package com.gmulbat1301.ebookshelf.screens.showAndCreatePages

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.gmulbat1301.ebookshelf.dataClasses.Book
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class BookControllerViewModel: ViewModel() {

    private val db = FirebaseFirestore.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    // Parametros de Book para guardar
    var titulo by mutableStateOf("")
        private set
    var autor by mutableStateOf("")
        private set
    var fechaSalida by mutableStateOf("")
        private set
    var sinopsis by mutableStateOf("")
        private set

    var stateText by mutableStateOf("")
        private set

    var resenaPersonal by mutableStateOf("")
        private set

    var comentarios by mutableStateOf("")
        private set



    // Se utiliza un MutableState para representar el estado actual del libro en la vista
    val book : MutableState<Book> = mutableStateOf(Book())

    // Método para guardar los datos de un libro en Firestore
    fun saveData(titulo : String, autor : String, sinopsis : String, fechaSalida : String){
        val bookAdd = Book(titulo, autor, sinopsis, fechaSalida)

        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("Users").document(auth.currentUser?.email!!)

        // Crear una colección llamada "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        // Agregar el libro a la colección "books"
        booksCollectionRef.document(titulo).set(bookAdd)
    }

    // Método para obtener los libros del usuario desde Firestore
    fun getData(onSuccess: (List<Book>) -> Unit, onFailure: (Exception) -> Unit) {
        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("Users").document(auth.currentUser?.email!!)

        // Obtener una referencia a la colección "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        // Obtener todos los documentos de la colección "books"
        booksCollectionRef.get()
            .addOnSuccessListener { documents ->
                val booksList = mutableListOf<Book>()
                for (document in documents) {
                    // Convertir cada documento en un objeto Book y añadirlo a la lista
                    val book = document.toObject(Book::class.java)
                    booksList.add(book)
                }
                onSuccess(booksList)
            }
            .addOnFailureListener { exception ->
                onFailure(exception)
            }
    }

    // Método para guardar un libro en el estado del ViewModel
    fun saveBook(book : Book){
        this.book.value = book
    }

    // Actualizar todos los parametros introducido un libro
    fun updateParametersByBook(book : Book){
        changeTitulo(book.titulo)
        changeAutor(book.autor)
        changeSinopsis(book.sinopsis)
        changefechaSalida(book.fechaSalida)
        changeResenaPersonal(book.resenaPersonal)
        changeComentarios(book.comentarios)
    }

    fun emptyParameters(){
        changeTitulo("")
        changeAutor("")
        changeSinopsis("")
        changefechaSalida("")
        changeResenaPersonal("")
        changeComentarios("")
    }

    // MEtodos para cambiar los parametros de book en los TextFields
    fun changeTitulo(newTitulo : String){
        titulo = newTitulo
    }

    fun changeAutor(newAutor : String){
        autor = newAutor
    }

    fun changeSinopsis(newSinopsis : String){
        sinopsis = newSinopsis
    }

    fun changefechaSalida(newfechaSalida : String){
        fechaSalida = newfechaSalida
    }

    fun changestateText(newStateText: String){
        stateText = newStateText
    }

    fun changeResenaPersonal(newResenaPersonal: String){
        resenaPersonal = newResenaPersonal
    }

    fun changeComentarios(newComentarios: String){
        comentarios = newComentarios
    }


}

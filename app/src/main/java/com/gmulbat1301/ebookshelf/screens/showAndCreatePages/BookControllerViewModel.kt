package com.gmulbat1301.ebookshelf.screens.showAndCreatePages

import androidx.lifecycle.ViewModel
import com.gmulbat1301.ebookshelf.dataClasses.Book
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class BookControllerViewModel: ViewModel() {

    private val db = FirebaseFirestore.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    fun saveData(titulo : String, autor : String, sinopsis : String, fechaSalida : String){
        val bookAdd = Book(titulo, autor, sinopsis, fechaSalida)

        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("users").document(auth.currentUser?.email!!)

        // Crear una colección llamada "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        // Agregar el libro a la colección "books"
        booksCollectionRef.document(titulo).set(bookAdd)
    }

    fun getData(onSuccess: (List<Book>) -> Unit, onFailure: (Exception) -> Unit) {
        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("users").document(auth.currentUser?.email!!)

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
                println("bazanero")
                println(booksList)
                onSuccess(booksList)
            }
            .addOnFailureListener { exception ->
                println("bazanero")
                onFailure(exception)
            }
    }


}

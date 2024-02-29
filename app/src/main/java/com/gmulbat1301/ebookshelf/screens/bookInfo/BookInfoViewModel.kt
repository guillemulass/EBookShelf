package com.gmulbat1301.ebookshelf.screens.bookInfo

import androidx.lifecycle.ViewModel
import com.gmulbat1301.ebookshelf.dataClasses.Book
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class BookInfoViewModel : ViewModel() {

    private val db = FirebaseFirestore.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    fun saveData(
        titulo: String, autor: String,
        sinopsis: String, fechaSalida: String,
        resenaPersonal: String, comentarios: String
    ) {
        val bookAdd = Book(titulo, autor, sinopsis, fechaSalida, resenaPersonal, comentarios)

        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("Users").document(auth.currentUser?.email!!)

        // Crear una colección llamada "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        // Agregar el libro a la colección "books"
        booksCollectionRef.document(titulo).set(bookAdd)
    }

    fun deleteData(titulo: String) {
        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("Users").document(auth.currentUser?.email!!)

        // Crear una colección llamada "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        // Eliminar el libro de la colección "books"
        booksCollectionRef.document(titulo).delete()
    }
}

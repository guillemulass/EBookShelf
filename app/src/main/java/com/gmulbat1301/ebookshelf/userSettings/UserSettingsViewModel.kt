package com.gmulbat1301.ebookshelf.userSettings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gmulbat1301.ebookshelf.dataClasses.Book
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class UserSettingsViewModel : ViewModel() {

    private val db = FirebaseFirestore.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    private var name = ""

    fun getNickName(): String {
        db.collection("Users").document(auth.currentUser?.email!!).get().addOnSuccessListener {
            name = it.get("username").toString()
        }
        return name
    }




    fun emptyData(){

        val userBooksRef = db.collection("Users").document(auth.currentUser?.email!!)

        val booksList = getData()

        for (book in booksList){
            userBooksRef.collection("books").document(book.titulo).delete()
        }

        db.collection("Users").document(auth.currentUser?.email!!).delete()


    }


    private fun getData(): MutableList<Book> {
        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("Users").document(auth.currentUser?.email!!)

        // Obtener una referencia a la colección "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        val booksList = mutableListOf<Book>()

        // Obtener todos los documentos de la colección "books"
        booksCollectionRef.get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    // Convertir cada documento en un objeto Book y añadirlo a la lista
                    val book = document.toObject(Book::class.java)
                    booksList.add(book)
                }
            }
        return booksList
    }
}
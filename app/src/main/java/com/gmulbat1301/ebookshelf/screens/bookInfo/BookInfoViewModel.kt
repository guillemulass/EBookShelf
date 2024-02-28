package com.gmulbat1301.ebookshelf.screens.bookInfo

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class BookInfoViewModel {

    private val db = FirebaseFirestore.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    fun deleteData(titulo : String){
        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("users").document(auth.currentUser?.email!!)

        // Crear una colección llamada "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        // Agregar el libro a la colección "books"
        booksCollectionRef.document(titulo).delete()
    }



}
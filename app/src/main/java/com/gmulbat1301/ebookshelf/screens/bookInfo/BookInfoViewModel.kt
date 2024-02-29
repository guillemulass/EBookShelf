package com.gmulbat1301.ebookshelf.screens.bookInfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.gmulbat1301.ebookshelf.dataClasses.Book
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class BookInfoViewModel {

    private val db = FirebaseFirestore.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    fun saveData(titulo : String, autor : String, sinopsis : String, fechaSalida : String, resenaPersonal : String, comentarios : String){
        val bookAdd = Book(titulo, autor, sinopsis, fechaSalida, resenaPersonal, comentarios)

        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("users").document(auth.currentUser?.email!!)

        // Crear una colección llamada "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        // Agregar el libro a la colección "books"
        booksCollectionRef.document(titulo).set(bookAdd)
    }


    fun deleteData(titulo : String){
        // Obtener una referencia a la colección "usersBooks" para el usuario actual
        val userBooksRef = db.collection("users").document(auth.currentUser?.email!!)

        // Crear una colección llamada "books" dentro del documento del usuario
        val booksCollectionRef = userBooksRef.collection("books")

        // Agregar el libro a la colección "books"
        booksCollectionRef.document(titulo).delete()
    }


}
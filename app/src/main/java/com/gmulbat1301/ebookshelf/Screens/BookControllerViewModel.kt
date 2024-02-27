package com.gmulbat1301.ebookshelf.Screens

import androidx.lifecycle.ViewModel
import com.gmulbat1301.ebookshelf.DataClasses.Book
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore

class BookControllerViewModel: ViewModel() {



    fun saveData(titulo : String, autor : String, sinopsis : String, fechaSalida : String){
        val db = FirebaseFirestore.getInstance()
        val auth: FirebaseAuth = Firebase.auth

        val bookAdd = Book(titulo, autor, sinopsis, fechaSalida)

        db.collection("usersBooks").document(auth.currentUser?.email!!).set(
            bookAdd
        )

    }

    fun getData(){

    }

    fun deleteData(){

    }

}
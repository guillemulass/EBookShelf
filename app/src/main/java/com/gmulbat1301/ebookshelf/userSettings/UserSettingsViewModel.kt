package com.gmulbat1301.ebookshelf.userSettings

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class UserSettingsViewModel {

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
        db.collection("Users").document(auth.currentUser?.email!!).delete()
    }

}
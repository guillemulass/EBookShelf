package com.gmulbat1301.ebookshelf.Screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gmulbat1301.ebookshelf.DataClasses.UserModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class RegisterViewModel : ViewModel() {

    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore


    var username by mutableStateOf("")
        private set
    var email by mutableStateOf("")
        private set
    var passw by mutableStateOf("")
        private set

    fun registerUser(onSuccess : () -> Unit,
                     onFailure:() -> Unit) {
        viewModelScope.launch {
            try {
                auth.createUserWithEmailAndPassword(email,passw).addOnCompleteListener {
                    saveUser(UserModel(username, email))
                    onSuccess()
                }.addOnFailureListener {
                    onFailure()
                }
            }
            catch (e:Exception) {
                println("Error de JetPack")
            }

        }

    }

    fun saveUser(userToAdd:UserModel) {
        viewModelScope.launch {
            firestore.collection("Users").document(email).set(userToAdd).addOnCompleteListener {
                println("Usuario guardado en base de datos correctamente")
            }.addOnFailureListener {
                println("Error guardando usuario en base de datos")
            }
        }

    }
    fun changeUsername(username:String) {
        this.username = username
    }
    fun changeEmail(email:String) {
        this.email = email
    }
    fun changePassw(passw:String) {
        this.passw = passw
    }

}
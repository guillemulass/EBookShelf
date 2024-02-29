package com.gmulbat1301.ebookshelf.screens.register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gmulbat1301.ebookshelf.dataClasses.UserModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
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
    var passwordConfirmation1 by mutableStateOf("")
        private set
    var passwordConfirmation2 by mutableStateOf("")
        private set
    var warningText by mutableStateOf("")
        private set

    private var passw by mutableStateOf("")

    fun registerUser(
        onSuccess : () -> Unit,
        onFailure:() -> Unit
    ) {

        viewModelScope.launch {
            try {
                auth.createUserWithEmailAndPassword(email,passw).addOnCompleteListener {
                    // Guardo el nombre de ususario para mostrarlo posteriormente
                    saveUser(UserModel(email, username))
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


    private fun saveUser(userToAdd:UserModel) {
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
    fun changePasswordConfirmation1(passwordConfirmation1:String) {
        this.passwordConfirmation1 = passwordConfirmation1
    }
    fun changePasswordConfirmation2(passwordConfirmation2:String) {
        this.passwordConfirmation2 = passwordConfirmation2
    }
    fun changeWarningText(warningText:String) {
        this.warningText = warningText
    }



}
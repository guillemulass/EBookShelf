package com.gmulbat1301.ebookshelf.screens.register

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gmulbat1301.ebookshelf.R
import com.gmulbat1301.ebookshelf.Routes.Routes
//import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
//import com.gmulbat1301.ebookshelf.headergeneral.HeaderGeneral
import androidx.compose.ui.platform.LocalContext
import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
import com.gmulbat1301.ebookshelf.headergeneral.HeaderGeneral

@Composable
fun PantallaCrearCuenta(
    registerViewmodel: RegisterViewModel,
    navController: NavHostController
){

    var password by remember { mutableStateOf("") }
    var passwordConfirmation by remember { mutableStateOf("") }
    var warningText by remember { mutableStateOf("") }
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.backgroundpaginainicial),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(
                    ScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(
                    top = 35.dp
                )
        ) {
            Box (
                Modifier.padding(end = 45.dp)
            ){
                HeaderGeneral(
                    modifier = Modifier
                        .width(306.dp)
                        .height(129.dp),
                    arrowBack = {
                        navController.navigate(Routes.PantallaInicial.route)
                    }
                )
            }

            TextField (
                value = registerViewmodel.email,
                onValueChange = { registerViewmodel.changeEmail(it) },
                label = { Text("Email") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                modifier = Modifier
                    .width(330.dp)
                    .padding(top = 55.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFD9D9D9),
                    unfocusedBorderColor = Color(0xFFD9D9D9),
                    focusedLabelColor = Color(0xFFD9D9D9),
                    unfocusedLabelColor = Color(0xFFD9D9D9),
                    unfocusedTextColor = Color(0xFFD9D9D9),
                    focusedTextColor = Color(0xFFD9D9D9)
                ),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email, contentDescription = null)
                },
                singleLine = true
            )

            TextField (
                value = registerViewmodel.username,
                onValueChange = { registerViewmodel.changeUsername(it) },
                label = { Text("Nombre de usuario") },
                modifier = Modifier
                    .width(330.dp)
                    .padding(top = 30.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFD9D9D9),
                    unfocusedBorderColor = Color(0xFFD9D9D9),
                    focusedLabelColor = Color(0xFFD9D9D9),
                    unfocusedLabelColor = Color(0xFFD9D9D9),
                    unfocusedTextColor = Color(0xFFD9D9D9),
                    focusedTextColor = Color(0xFFD9D9D9)
                ),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
                },
                singleLine = true
            )

            TextField(
                value = password,
                onValueChange = { newText ->
                    password = newText
                },
                label = { Text("Contraseña") },
                modifier = Modifier
                    .width(330.dp)
                    .padding(top = 30.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFD9D9D9),
                    unfocusedBorderColor = Color(0xFFD9D9D9),
                    focusedLabelColor = Color(0xFFD9D9D9),
                    unfocusedLabelColor = Color(0xFFD9D9D9),
                    unfocusedTextColor = Color(0xFFD9D9D9),
                    focusedTextColor = Color(0xFFD9D9D9)
                ),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Lock, contentDescription = null)
                },
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true
            )

            TextField(
                value = passwordConfirmation,
                onValueChange = { newText ->
                    passwordConfirmation = newText
                },
                label = { Text("Confirmar contraseña") },
                modifier = Modifier
                    .width(330.dp)
                    .padding(top = 30.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFD9D9D9),
                    unfocusedBorderColor = Color(0xFFD9D9D9),
                    focusedLabelColor = Color(0xFFD9D9D9),
                    unfocusedLabelColor = Color(0xFFD9D9D9),
                    unfocusedTextColor = Color(0xFFD9D9D9),
                    focusedTextColor = Color(0xFFD9D9D9)
                ),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Lock, contentDescription = null)
                },
                visualTransformation = PasswordVisualTransformation(),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(text = warningText)

            Spacer(modifier = Modifier.height(30.dp))

            BotonSmall(
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp),
                text = "Crear Cuenta",
                botonSmallTapped = {
                    if (password.length>=6 || passwordConfirmation.length>=6){
                        if (password == passwordConfirmation){
                            registerViewmodel.changePassw(passwordConfirmation)
                            warningText = ""
                            registerViewmodel.registerUser(
                                onSuccess = { navController.navigate(Routes.PantallaPrincipal.route) },
                                onFailure = { Toast.makeText(context,"Error al crear la cuenta, intentelo de nuevo",Toast.LENGTH_SHORT).show()  }
                            )
                        } else
                        {
                            warningText = "Las contraseñas no coinciden"
                        }
                    }
                    else{
                        warningText = "La contraseña debe tener al menos 6 caracteres"
                    }
                }
            )
        }
    }
}
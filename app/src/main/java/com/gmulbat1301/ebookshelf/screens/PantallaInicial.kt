package com.gmulbat1301.ebookshelf.screens

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
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gmulbat1301.ebookshelf.R
import com.gmulbat1301.ebookshelf.Routes.Routes
import com.gmulbat1301.ebookshelf.buttonspantallainicial.ButtonsPantallaInicial
import com.gmulbat1301.ebookshelf.headerpantallainicial.HeaderPantallaInicial
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

@Composable
fun PantallaInicial(
    navController: NavHostController,
    sessionClosed: Boolean
) {
    // Inicializar FirebaseAuth
    val auth: FirebaseAuth = Firebase.auth

    // Reaccionar a cambios en la autenticación
    // Sirve para saltar a la siguiente pagina si la sesion esta iniciada
    LaunchedEffect(Unit) {
        val email = auth.currentUser?.uid
        if (email != null && sessionClosed) {
            // Si hay una sesión activa y se cerró, navega a la pantalla principal
            navController.navigate(Routes.PantallaPrincipal.route)
        }
    }

    // Contenedor principal de la pantalla inicial
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Fondo de pantalla
        Image(
            painter = painterResource(id = R.drawable.backgroundpaginainicial),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        // Columna para organizar elementos verticales
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(
                    ScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(
                    start = 85.dp,
                    top = 35.dp
                )
        ) {
            // Encabezado de la pantalla inicial
            HeaderPantallaInicial(
                modifier = Modifier
                    .width(242.dp)
                    .height(129.dp)
            )

            // Espacio vertical entre el encabezado y los botones
            Spacer(modifier = Modifier.height(50.dp))

            // Botones de la pantalla inicial para iniciar sesión y crear cuenta
            ButtonsPantallaInicial(
                modifier = Modifier
                    .width(165.dp)
                    .height(190.dp),
                botonIniciarSesionPantallaInicial = {
                    navController.navigate(Routes.PantallaInicioSesion.route)
                },
                botonCrearCuentaPantallaInicial = {
                    navController.navigate(Routes.PantallaCrearCuenta.route)
                }
            )
        }
    }
}

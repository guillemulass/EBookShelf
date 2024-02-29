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
){

    val auth: FirebaseAuth = Firebase.auth

    LaunchedEffect(Unit) {
        val email = auth.currentUser?.uid
        if (email != null && sessionClosed) {
            navController.navigate(Routes.PantallaPrincipal.route)
        }
    }

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
            HeaderPantallaInicial(
                modifier = Modifier
                    .width(242.dp)
                    .height(129.dp)
            )

            Spacer(modifier = Modifier.height(50.dp))

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
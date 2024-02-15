package com.gmulbat1301.ebookshelf.Screens

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gmulbat1301.ebookshelf.R
import com.gmulbat1301.ebookshelf.Routes.Routes
import com.gmulbat1301.ebookshelf.botonesusuariosesioniniciada.BotonesUsuarioSesionIniciada
import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
import com.gmulbat1301.ebookshelf.headeruser.HeaderUser

@Composable
fun PantallaUsuarioSesionNoIniciada(
    navController: NavHostController
){

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
            Box(
                Modifier.padding(end = 65.dp)
            ) {
                HeaderUser(
                    Modifier
                        .width(318.dp)
                        .height(129.dp),
                    arrowBackTapped = {
                        navController.navigate(Routes.PantallaPrincipal.route)
                    }
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            BotonSmall(
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp),
                text = "Iniciar Sesión",
                botonSmallTapped = {
                    navController.navigate(Routes.PantallaInicioSesion.route)
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            BotonSmall(
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp),
                text = "Crear Cuenta",
                botonSmallTapped = {
                    navController.navigate(Routes.PantallaCrearCuenta.route)
                }
            )

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
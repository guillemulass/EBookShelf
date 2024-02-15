package com.gmulbat1301.ebookshelf.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
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
import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
import com.gmulbat1301.ebookshelf.headerpaginaprincipal.HeaderPaginaPrincipal
import com.gmulbat1301.ebookshelf.cardlibro.CardLibro

@Composable
fun PantallaPrincipal(
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
                Modifier.padding(end = 45.dp)
            ) {
                HeaderPaginaPrincipal(
                    modifier = Modifier
                        .width(379.dp)
                        .height(65.dp),
                    userLogoTapped = {
                        navController.navigate(Routes.PantallaUsuarioSesionIniciada.route)
                        //navController.navigate(Routes.PantallaUsuarioSesionNoIniciada.route)
                        /*
                        if (trueuserLoggedIn){
                            navController.navigate(Routes.PantallaUsuarioSesionIniciada.route)
                        } else{
                            navController.navigate(Routes.PantallaUsuarioSesionNoIniciada.route)
                        }

                         */
                    }
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            BotonSmall(
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp),
                text = "Añadir Libro",
                botonSmallTapped = {
                    navController.navigate(Routes.PantallaUsuarioSesionNoIniciada.route)
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

            CardLibro(
                Modifier
                    .height(504.dp)
                    .width(350.dp)
                    .clickable { navController.navigate(Routes.PantallaInformacionLibro.route) },
                tituloLibroCard = "El Imperio Final",
                sinopsisLibroCard = "Durante mil años han caído cenizas del cielo. Durante mil años nada ha  florecido. Durante mil años los skaa han sido esclavizados y viven en la  miseria, sumidos en un miedo inevitable. Durante mil años el Lord  Legislador ha reinado con poder absoluto, dominando gracias al terror, a  sus poderes y a su inmortalidad, ayudado por «obligadores» e «inquisidores», junto a la poderosa magia de la alomancia.",
                imagenLibroCard = painterResource(R.drawable.card_libro_imagen_libro)
            )

            Spacer(modifier = Modifier.height(30.dp))

            CardLibro(
                Modifier
                    .height(504.dp)
                    .width(350.dp)
                    .clickable { navController.navigate(Routes.PantallaInformacionLibro.route) }
                ,
                tituloLibroCard = "El Imperio Final",
                sinopsisLibroCard = "Durante mil años han caído cenizas del cielo. Durante mil años nada ha  florecido. Durante mil años los skaa han sido esclavizados y viven en la  miseria, sumidos en un miedo inevitable. Durante mil años el Lord  Legislador ha reinado con poder absoluto, dominando gracias al terror, a  sus poderes y a su inmortalidad, ayudado por «obligadores» e «inquisidores», junto a la poderosa magia de la alomancia.",
                imagenLibroCard = painterResource(R.drawable.card_libro_imagen_libro)
            )



            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
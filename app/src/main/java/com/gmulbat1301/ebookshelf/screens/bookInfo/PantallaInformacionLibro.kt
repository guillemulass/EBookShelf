package com.gmulbat1301.ebookshelf.screens.bookInfo

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
import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
import com.gmulbat1301.ebookshelf.headergeneral.HeaderGeneral
//import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
//import com.gmulbat1301.ebookshelf.headergeneral.HeaderGeneral
import com.gmulbat1301.ebookshelf.informacionlibro.InformacionLibro

@Composable
fun PantallaInformacionLibro(
    bookInfoViewModel: BookInfoViewModel,
    navController: NavHostController,
    titulo: String,
    autor: String,
    sinopsis: String,
    fechaSalida: String,
    resenaPersonal: String,
    comentarios: String
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
                HeaderGeneral(
                    modifier = Modifier
                        .width(306.dp)
                        .height(129.dp),
                    arrowBack = {
                        navController.navigate(Routes.PantallaPrincipal .route)
                    }
                )
            }

            InformacionLibro(
                tituloLibro = titulo,
                reseAPersonalText = resenaPersonal,
                comentariosText = comentarios,
                sinopsisText = sinopsis,
                autorText = autor,
                fechaSalidaText = fechaSalida,
                botonEditarInfo = {
                    navController.navigate(
                        "pantallaComentarios/${titulo}/${autor}/${sinopsis}/${fechaSalida}/${resenaPersonal}/${comentarios}"
                    )
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

            BotonSmall(
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp),
                text = "Eliminar Libro",
                botonSmallTapped = {
                    bookInfoViewModel.deleteData(titulo)
                    navController.navigate(Routes.PantallaPrincipal.route)
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

        }
    }
}
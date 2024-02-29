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
import com.gmulbat1301.ebookshelf.informacionlibro.InformacionLibro
import com.gmulbat1301.ebookshelf.screens.showAndCreatePages.BookControllerViewModel

@Composable
fun PantallaInformacionLibro(
    bookInfoViewModel: BookInfoViewModel,
    bookControllerViewModel: BookControllerViewModel,
    navController: NavHostController,
){

    // Obtener el libro actualmente seleccionado desde el ViewModel
    val book = bookControllerViewModel.book

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Fondo de pantalla
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
                        navController.navigate(Routes.PantallaPrincipal.route)
                    }
                )
            }

            // Información del libro
            InformacionLibro(
                tituloLibro = book.value.titulo,
                reseAPersonalText = book.value.resenaPersonal,
                comentariosText = book.value.comentarios,
                sinopsisText = book.value.sinopsis,
                autorText = book.value.autor,
                fechaSalidaText = book.value.fechaSalida,
                botonEditarInfo = {
                    navController.navigate(Routes.PantallaComentarios.route)
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Botón para eliminar el libro
            BotonSmall(
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp),
                text = "Eliminar Libro",
                botonSmallTapped = {
                    bookInfoViewModel.deleteData(book.value.titulo)
                    navController.navigate(Routes.PantallaPrincipal.route)
                }
            )

            Spacer(modifier = Modifier.height(30.dp))

        }
    }
}

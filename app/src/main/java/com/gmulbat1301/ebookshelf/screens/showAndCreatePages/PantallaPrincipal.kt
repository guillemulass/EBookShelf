package com.gmulbat1301.ebookshelf.screens.showAndCreatePages

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.gmulbat1301.ebookshelf.DataClasses.Book
import com.gmulbat1301.ebookshelf.R
import com.gmulbat1301.ebookshelf.Routes.Routes
import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
import com.gmulbat1301.ebookshelf.headerpaginaprincipal.HeaderPaginaPrincipal
import com.gmulbat1301.ebookshelf.panellibro.PanelLibro
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun PantallaPrincipal(
    bookControllerViewModel: BookControllerViewModel,
    navController: NavHostController
){

    val auth: FirebaseAuth = Firebase.auth
    var booksList by remember { mutableStateOf(emptyList<Book>()) }

    LaunchedEffect(Unit) {
        val userId = auth.currentUser?.uid
        if (userId != null) {
            bookControllerViewModel.getData(
                onSuccess = { books ->
                    booksList = books // Actualizar la lista de libros con los obtenidos
                },
                onFailure = {
                    println(it)
                }
            )
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
                .fillMaxSize()

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
                    navController.navigate(Routes.PantallaCrearLibro.route)
                }
            )

            BookListLazyColumn(navController, booksList)

        }
    }
}


@Composable
fun BookListLazyColumn(navController: NavController, booksList: List<Book>) {
    Column(Modifier.padding(16.dp)) {

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(30.dp)
        ) {
            items(booksList) { book ->
                PanelLibro(
                    Modifier
                        .width(350.dp)
                        .clickable {
                            navController.navigate(
                                "pantallaInformacionLibro/${book.titulo}/${book.autor}/${book.sinopsis}/${book.fechaSalida}/${book.resenaPersonal}/${book.comentarios}"
                            )
                        },
                    tituloLibroCard = book.titulo,
                    sinopsisLibroCard = book.sinopsis
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

    }
}

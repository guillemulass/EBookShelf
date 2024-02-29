package com.gmulbat1301.ebookshelf.screens.showAndCreatePages

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
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gmulbat1301.ebookshelf.R
import com.gmulbat1301.ebookshelf.Routes.Routes
import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
import com.gmulbat1301.ebookshelf.headergeneral.HeaderGeneral

@Composable
fun PantallaCrearLibro(
    bookControllerViewModel: BookControllerViewModel,
    navController: NavHostController
){

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
            // Encabezado
            Box (
                Modifier.padding(end = 45.dp)
            ){
                HeaderGeneral(
                    modifier = Modifier
                        .width(306.dp)
                        .height(129.dp),
                    arrowBack = {
                        navController.navigate(Routes.PantallaPrincipal.route)
                    }
                )
            }

            // Campos de texto para ingresar los detalles del libro
            TextField (
                value = bookControllerViewModel.titulo,
                onValueChange = { bookControllerViewModel.changeTitulo(it) },
                label = { Text("Titulo") },
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
                singleLine = false
            )

            // Campos de texto para autor, fecha de salida y sinopsis
            TextField (
                value = bookControllerViewModel.autor,
                onValueChange = { bookControllerViewModel.changeAutor(it) },
                label = { Text("Autor") },
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
                singleLine = false
            )

            TextField (
                value = bookControllerViewModel.fechaSalida,
                onValueChange = { bookControllerViewModel.changefechaSalida(it) },
                label = { Text("Fecha Salida") },
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
                singleLine = false
            )

            TextField (
                value = bookControllerViewModel.sinopsis,
                onValueChange = { bookControllerViewModel.changeSinopsis(it) },
                label = { Text("Sinopsis") },
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
                singleLine = false
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Botón para crear el libro
            BotonSmall(
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp),
                text = "Crear Libro",
                botonSmallTapped = {
                    // Validar que los campos no estén vacíos antes de crear el libro
                    if (bookControllerViewModel.autor.isNotEmpty() && bookControllerViewModel.titulo.isNotEmpty() && bookControllerViewModel.sinopsis.isNotEmpty() && bookControllerViewModel.fechaSalida.isNotEmpty()){
                        bookControllerViewModel.changestateText("${bookControllerViewModel.titulo} Creado")
                        bookControllerViewModel.saveData(bookControllerViewModel.titulo, bookControllerViewModel.autor, bookControllerViewModel.sinopsis, bookControllerViewModel.fechaSalida)

                    } else{
                        bookControllerViewModel.changestateText("Ningún parámetro puede estar vacío")
                    }
                }
            )

            // Mostrar un mensaje de estado después de crear el libro
            Text(
                text = bookControllerViewModel.stateText,
                color = Color.White
            )
        }
    }
}
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Create
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gmulbat1301.ebookshelf.R
import com.gmulbat1301.ebookshelf.Routes.Routes
import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
import com.gmulbat1301.ebookshelf.headergeneral.HeaderGeneral
import com.gmulbat1301.ebookshelf.screens.showAndCreatePages.BookControllerViewModel

//import com.gmulbat1301.ebookshelf.botonsmall.BotonSmall
//import com.gmulbat1301.ebookshelf.headergeneral.HeaderGeneral

@Composable
fun PantallaComentarios(
    bookInfoViewModel: BookInfoViewModel,
    bookControllerViewModel: BookControllerViewModel,
    navController: NavHostController,
){

    val book = bookControllerViewModel.book

    var _titulo by remember { mutableStateOf(book.value.titulo) }
    var _autor by remember { mutableStateOf(book.value.autor) }
    var _sinopsis by remember { mutableStateOf(book.value.sinopsis) }
    var _fechaSalida by remember { mutableStateOf(book.value.fechaSalida) }
    var _resenaPersonal by remember { mutableStateOf(book.value.resenaPersonal) }
    var _comentarios by remember { mutableStateOf(book.value.comentarios) }


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
                        navController.navigate(Routes.PantallaInformacionLibro.route)
                    }
                )
            }

            TextField (
                value = _resenaPersonal,
                onValueChange = { newValue ->
                    _resenaPersonal = newValue
                },
                label = { Text("Reseña Personal") },
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
                )
            )

            TextField (
                value = _comentarios,
                onValueChange = { newValue ->
                    _comentarios = newValue
                },
                label = { Text("Comentarios") },
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
                )
            )

            TextField (
                value = _titulo,
                onValueChange = { newValue ->
                    _titulo = newValue
                },
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
                )
            )

            TextField (
                value = _autor,
                onValueChange = { newValue ->
                    _autor = newValue
                },
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
                )
            )

            TextField (
                value = _sinopsis,
                onValueChange = { newValue ->
                    _sinopsis = newValue
                },
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
                )
            )

            TextField (
                value = _fechaSalida,
                onValueChange = { newValue ->
                    _fechaSalida = newValue
                },
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
                )
            )

            Spacer(modifier = Modifier.height(30.dp))

            BotonSmall(
                modifier = Modifier
                    .width(165.dp)
                    .height(50.dp),
                text = "Guardar Cambios",
                botonSmallTapped = {
                    bookInfoViewModel.deleteData(book.value.titulo)
                    bookInfoViewModel.saveData(
                        _titulo, _autor,
                        _sinopsis, _fechaSalida,
                        _resenaPersonal, _comentarios
                    )
                    navController.navigate(Routes.PantallaInformacionLibro.route)
                }
            )

        }
    }
}
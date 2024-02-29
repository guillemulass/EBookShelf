package com.gmulbat1301.ebookshelf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.gmulbat1301.ebookshelf.Routes.Routes
import com.gmulbat1301.ebookshelf.screens.logIn.LogInViewModel
import com.gmulbat1301.ebookshelf.screens.logIn.PantallaInicioSesion
import com.gmulbat1301.ebookshelf.screens.register.PantallaCrearCuenta
import com.gmulbat1301.ebookshelf.screens.register.RegisterViewModel
import com.gmulbat1301.ebookshelf.screens.showAndCreatePages.PantallaCrearLibro
import com.gmulbat1301.ebookshelf.screens.showAndCreatePages.PantallaPrincipal
import com.gmulbat1301.ebookshelf.screens.*
import com.gmulbat1301.ebookshelf.screens.bookInfo.BookInfoViewModel
import com.gmulbat1301.ebookshelf.screens.bookInfo.PantallaInformacionLibro
import com.gmulbat1301.ebookshelf.screens.bookInfo.PantallaComentarios
import com.gmulbat1301.ebookshelf.screens.showAndCreatePages.BookControllerViewModel
import com.gmulbat1301.ebookshelf.ui.theme.EBookShelfTheme
import com.gmulbat1301.ebookshelf.userSettings.PantallaUsuarioSesionIniciada
import com.gmulbat1301.ebookshelf.userSettings.UserSettingsViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicialización de ViewModels para cada pantalla
        val logInViewModel = LogInViewModel()
        val registerViewModel = RegisterViewModel()
        val bookControllerViewModel = BookControllerViewModel()
        val bookInfoViewModel = BookInfoViewModel()
        val userSettingsViewModel = UserSettingsViewModel()

        setContent {
            EBookShelfTheme {
                // Contenedor principal de la pantalla
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // NavController para manejar la navegación entre las pantallas
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Routes.PantallaInicial.route
                    ) {
                        // Definición de las pantallas y sus composable asociados
                        composable(Routes.PantallaInicial.route) {
                            PantallaInicial(
                                navController,
                                false
                            )
                        }

                        composable(Routes.PantallaCrearCuenta.route) {
                            PantallaCrearCuenta(
                                registerViewModel,
                                navController
                            )
                        }

                        composable(Routes.PantallaInicioSesion.route) {
                            PantallaInicioSesion(
                                logInViewModel,
                                navController
                            )
                        }

                        composable(Routes.PantallaPrincipal.route) {
                            PantallaPrincipal(
                                bookControllerViewModel,
                                navController
                            )
                        }

                        composable(Routes.PantallaInformacionLibro.route) {
                            PantallaInformacionLibro(
                                bookInfoViewModel,
                                bookControllerViewModel,
                                navController
                            )
                        }

                        composable(Routes.PantallaComentarios.route) {
                            PantallaComentarios(
                                bookInfoViewModel,
                                bookControllerViewModel,
                                navController
                            )
                        }

                        composable(Routes.PantallaUsuarioSesionIniciada.route) {
                            PantallaUsuarioSesionIniciada(
                                userSettingsViewModel,
                                navController
                            )
                        }

                        composable(Routes.PantallaCrearLibro.route) {
                            PantallaCrearLibro(
                                bookControllerViewModel,
                                navController
                            )
                        }
                    }
                }
            }
        }
    }
}
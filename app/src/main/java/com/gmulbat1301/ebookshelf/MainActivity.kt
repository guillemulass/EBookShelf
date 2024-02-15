package com.gmulbat1301.ebookshelf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gmulbat1301.ebookshelf.Routes.Routes
import com.gmulbat1301.ebookshelf.Screens.*
import com.gmulbat1301.ebookshelf.ui.theme.EBookShelfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EBookShelfTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Routes.PantallaInicial.route
                    ) {

                        composable(Routes.PantallaInicial.route) {
                            PantallaInicial(
                                navController
                            )
                        }

                        composable(Routes.PantallaCrearCuenta.route) {
                            PantallaCrearCuenta(
                                navController
                            )
                        }

                        composable(Routes.PantallaInicioSesion.route) {
                            PantallaInicioSesion(
                                navController
                            )
                        }

                        composable(Routes.PantallaPrincipal.route) {
                            PantallaPrincipal(
                                navController
                            )
                        }

                        composable(Routes.PantallaInformacionLibro.route) {
                            PantallaInformacionLibro(
                                navController
                            )
                        }

                        composable(Routes.PantallaUsuarioSesionIniciada.route) {
                            PantallaUsuarioSesionIniciada(
                                navController
                            )
                        }

                        composable(Routes.PantallaUsuarioSesionNoIniciada.route) {
                            PantallaUsuarioSesionNoIniciada(
                                navController
                            )
                        }

                    }
                }
            }
        }
    }
}
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
import com.gmulbat1301.ebookshelf.screens.bookInfo.PantallaInformacionLibro
import com.gmulbat1301.ebookshelf.screens.showAndCreatePages.BookControllerViewModel
import com.gmulbat1301.ebookshelf.ui.theme.EBookShelfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val logInViewModel = LogInViewModel()
        val registerViewModel = RegisterViewModel()
        val bookControllerViewModel = BookControllerViewModel()


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

                        composable(
                            Routes.PantallaInformacionLibro.route + "/{titulo}/{autor}/{sinopsis}/{fechaSalida}",
                            arguments = listOf(
                                navArgument("titulo") { type = NavType.StringType },
                                navArgument("autor") { type = NavType.StringType },
                                navArgument("sinopsis") { type = NavType.StringType },
                                navArgument("fechaSalida") { type = NavType.StringType }
                            )
                        ) { backStackEntry ->
                            PantallaInformacionLibro(
                                navController,
                                titulo = backStackEntry.arguments?.getString("titulo") ?: "",
                                autor = backStackEntry.arguments?.getString("autor") ?: "",
                                sinopsis = backStackEntry.arguments?.getString("sinopsis") ?: "",
                                fechaSalida = backStackEntry.arguments?.getString("fechaSalida") ?: ""
                            )
                        }


                        composable(Routes.PantallaUsuarioSesionIniciada.route) {
                            PantallaUsuarioSesionIniciada(
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
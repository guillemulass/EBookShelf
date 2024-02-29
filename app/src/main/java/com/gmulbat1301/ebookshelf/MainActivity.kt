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

        val logInViewModel = LogInViewModel()
        val registerViewModel = RegisterViewModel()
        val bookControllerViewModel = BookControllerViewModel()
        val bookInfoViewModel = BookInfoViewModel()
        val userSettingsViewModel = UserSettingsViewModel()



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
                                navController,
                                true
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
/*
                        composable(Routes.PantallaInformacionLibro.route) {
                            PantallaInformacionLibro(
                                bookControllerViewModel,
                                navController
                            )
                        }

                        composable(Routes.PantallaComentarios.route) {
                            PantallaComentarios(
                                bookControllerViewModel,
                                navController
                            )
                        }
 */

                        composable(
                            Routes.PantallaInformacionLibro.route + "/{titulo}/{autor}/{sinopsis}/{fechaSalida}/{resenaPersonal}/{comentarios}",
                            arguments = listOf(
                                navArgument("titulo") { type = NavType.StringType },
                                navArgument("autor") { type = NavType.StringType },
                                navArgument("sinopsis") { type = NavType.StringType },
                                navArgument("fechaSalida") { type = NavType.StringType },
                                navArgument("resenaPersonal") { type = NavType.StringType },
                                navArgument("comentarios") { type = NavType.StringType },
                            )
                        ) { backStackEntry ->
                            PantallaInformacionLibro(
                                bookInfoViewModel,
                                navController,
                                titulo = backStackEntry.arguments?.getString("titulo") ?: "",
                                autor = backStackEntry.arguments?.getString("autor") ?: "",
                                sinopsis = backStackEntry.arguments?.getString("sinopsis") ?: "",
                                fechaSalida = backStackEntry.arguments?.getString("fechaSalida") ?: "",
                                resenaPersonal = backStackEntry.arguments?.getString("resenaPersonal") ?: "",
                                comentarios = backStackEntry.arguments?.getString("comentarios") ?: ""
                            )
                        }

                        composable(
                            Routes.PantallaComentarios.route + "/{titulo}/{autor}/{sinopsis}/{fechaSalida}/{resenaPersonal}/{comentarios}",
                            arguments = listOf(
                                navArgument("titulo") { type = NavType.StringType },
                                navArgument("autor") { type = NavType.StringType },
                                navArgument("sinopsis") { type = NavType.StringType },
                                navArgument("fechaSalida") { type = NavType.StringType },
                                navArgument("resenaPersonal") { type = NavType.StringType },
                                navArgument("comentarios") { type = NavType.StringType },
                            )
                        ) { backStackEntry ->
                            PantallaComentarios(
                                bookInfoViewModel,
                                navController,
                                titulo = backStackEntry.arguments?.getString("titulo") ?: "",
                                autor = backStackEntry.arguments?.getString("autor") ?: "",
                                sinopsis = backStackEntry.arguments?.getString("sinopsis") ?: "",
                                fechaSalida = backStackEntry.arguments?.getString("fechaSalida") ?: "",
                                resenaPersonal = backStackEntry.arguments?.getString("resenaPersonal") ?: "",
                                comentarios = backStackEntry.arguments?.getString("comentarios") ?: ""
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
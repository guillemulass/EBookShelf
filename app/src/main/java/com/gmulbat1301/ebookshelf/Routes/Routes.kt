package com.gmulbat1301.ebookshelf.Routes


sealed class Routes(val route : String) {

    object PantallaInicial: Routes("PantallaInicial")
    object PantallaCrearCuenta: Routes("PantallaCrearCuenta")
    object PantallaInicioSesion: Routes("PantallaInicioSesion")
    object PantallaPrincipal: Routes("screenProyecto2")
    object PantallaInformacionLibro: Routes("PantallaInformacionLibro")
    object PantallaUsuarioSesionIniciada: Routes("PantallaUsuarioSesionIniciada")
    object PantallaCrearLibro: Routes("PantallaCrearLibro")

}
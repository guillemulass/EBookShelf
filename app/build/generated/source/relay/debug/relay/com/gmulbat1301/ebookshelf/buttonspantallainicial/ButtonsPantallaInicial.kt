package com.gmulbat1301.ebookshelf.buttonspantallainicial

import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gmulbat1301.ebookshelf.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'buttons_pantalla_inicial'.
 * Generated code; do not edit directly
 */
@Composable
fun ButtonsPantallaInicial(
    modifier: Modifier = Modifier,
    botonIniciarSesionPantallaInicial: () -> Unit = {},
    botonCrearCuentaPantallaInicial: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BotonIniciarSesionPantallaInicial(botonIniciarSesionPantallaInicial = botonIniciarSesionPantallaInicial) {
            BotonIniciarSesionPantallaInicialFondo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            BotonIniciarSesionPantallaInicialText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        BotonCrearCuentaPantallaInicial(botonCrearCuentaPantallaInicial = botonCrearCuentaPantallaInicial) {
            BotonCrearCuentaPantallaInicialFondo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            BotonCrearCuentaPantallaInicialText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 165, heightDp = 120)
@Composable
private fun ButtonsPantallaInicialPreview() {
    MaterialTheme {
        ButtonsPantallaInicial(
            botonIniciarSesionPantallaInicial = {},
            botonCrearCuentaPantallaInicial = {}
        )
    }
}

@Composable
fun BotonIniciarSesionPantallaInicialFondo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.buttons_pantalla_inicial_boton_iniciar_sesion_pantalla_inicial_fondo),
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun BotonIniciarSesionPantallaInicialText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Iniciar Sesión",
        fontSize = 17.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(50.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BotonIniciarSesionPantallaInicial(
    botonIniciarSesionPantallaInicial: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.tappable(onTap = botonIniciarSesionPantallaInicial).requiredWidth(165.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun BotonCrearCuentaPantallaInicialFondo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.buttons_pantalla_inicial_boton_crear_cuenta_pantalla_inicial_fondo),
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun BotonCrearCuentaPantallaInicialText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Crear Cuenta",
        fontSize = 17.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(50.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BotonCrearCuentaPantallaInicial(
    botonCrearCuentaPantallaInicial: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.tappable(onTap = botonCrearCuentaPantallaInicial).requiredWidth(165.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 20.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

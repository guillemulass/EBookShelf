package com.gmulbat1301.ebookshelf.botonesusuariosesioniniciada

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
 * This composable was generated from the UI Package 'botones_usuario_sesion_iniciada'.
 * Generated code; do not edit directly
 */
@Composable
fun BotonesUsuarioSesionIniciada(
    modifier: Modifier = Modifier,
    nombreUsuarioShowed: String,
    editTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        MostadorNombreUsuario {
            FondoNombreUsuario(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            NombreUsuario(
                nombreUsuarioShowed = nombreUsuarioShowed,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -14.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            FluentEdit32Regular(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 288.0.dp,
                        y = 7.0.dp
                    )
                )
            ) {
                Vector(
                    editTapped = editTapped,
                    modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
                )
            }
        }
        BotNCerrarSesion {
            FondoCerrarSesion(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            TextCerrarSesion(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        BotNEliminarCuenta {
            FondoEliminarCuenta(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            TextEliminarCuenta(
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

@Preview(widthDp = 330, heightDp = 209)
@Composable
private fun BotonesUsuarioSesionIniciadaPreview() {
    MaterialTheme {
        BotonesUsuarioSesionIniciada(
            nombreUsuarioShowed = "UserName17Char",
            editTapped = {}
        )
    }
}

@Composable
fun FondoNombreUsuario(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_sesion_iniciada_fondo_nombre_usuario),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun NombreUsuario(
    nombreUsuarioShowed: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = nombreUsuarioShowed,
        fontSize = 26.0.sp,
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
        modifier = modifier.requiredWidth(274.0.dp).requiredHeight(53.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Vector(
    editTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_sesion_iniciada_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.37451171875.dp,
                top = 2.37689208984375.dp,
                end = 0.62548828125.dp,
                bottom = 0.62310791015625.dp
            )
        ).tappable(onTap = editTapped).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun FluentEdit32Regular(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun MostadorNombreUsuario(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun FondoCerrarSesion(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_sesion_iniciada_fondo_cerrar_sesion),
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun TextCerrarSesion(modifier: Modifier = Modifier) {
    RelayText(
        content = "Cerrar Sesión",
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
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(53.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BotNCerrarSesion(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun FondoEliminarCuenta(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.botones_usuario_sesion_iniciada_fondo_eliminar_cuenta),
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun TextEliminarCuenta(modifier: Modifier = Modifier) {
    RelayText(
        content = "Eliminar Cuenta",
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
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(53.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun BotNEliminarCuenta(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.requiredWidth(165.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 25.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

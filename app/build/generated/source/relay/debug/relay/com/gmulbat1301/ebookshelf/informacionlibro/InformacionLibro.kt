package com.gmulbat1301.ebookshelf.informacionlibro

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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gmulbat1301.ebookshelf.R
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'informacion_libro'.
 * Generated code; do not edit directly
 */
@Composable
fun InformacionLibro(
    modifier: Modifier = Modifier,
    tituloLibro: String,
    portadaLibro: Painter,
    reseAPersonalText: String,
    comentariosText: String,
    editTapped: () -> Unit = {},
    sinopsisText: String,
    autorText: String,
    fechaSalidaText: String
) {
    TopLevel(modifier = modifier) {
        TituloLibro(tituloLibro = tituloLibro)
        PortadaLibro(
            portadaLibro = portadaLibro,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = -2.0.dp,
                    y = -2.0.dp
                )
            )
        )
        RellenablesPersonales {
            Frame1 {
                ReseAPersonal()
                FluentEdit32Regular(editTapped = editTapped) {
                    Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            ReseAPersonalText(reseAPersonalText = reseAPersonalText)
            Comentarios()
            ComentariosText(comentariosText = comentariosText)
        }
        InformacionLibroGeneral {
            Sinopsis()
            SinopsisText(sinopsisText = sinopsisText)
            Autor()
            AutorText(autorText = autorText)
            FechaSalida()
            FechaSalidaText(fechaSalidaText = fechaSalidaText)
        }
    }
}

@Preview(widthDp = 344, heightDp = 1340)
@Composable
private fun InformacionLibroPreview() {
    MaterialTheme {
        InformacionLibro(
            tituloLibro = "El Imperio Final",
            portadaLibro = painterResource(R.drawable.informacion_libro_portada_libro),
            reseAPersonalText = "sampletext ",
            comentariosText = "sampletext ",
            editTapped = {},
            sinopsisText = "La sociedad de Nacidos de la Bruma ha evolucionado en una fusión de  magia y tecnología en la que la economía se expande, la democracia se  enfrenta a la corrupción y la religión se convierte en una potencia  cultural cada vez más influyente, con cuatro fes distintas enfrentadas por la captación de conversos. Esta sociedad tan animada y optimista, aunque todavía tambaleante, se  enfrenta ahora a su primera amenaza de terrorismo, crímenes cuyo  objetivo es fomentar el descontento de la clase trabajadora y avivar las  llamas de los conflictos religiosos. Wax y Wayne, con la asistencia de  la adorable y brillante Marasi, deberán dar al traste con la  conspiración antes de que las revueltas civiles frenen por completo el progreso de Scadrial.  ",
            autorText = "Brandon Sanderson",
            fechaSalidaText = "28 / 02 / 2020"
        )
    }
}

@Composable
fun TituloLibro(
    tituloLibro: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloLibro,
        fontSize = 34.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(330.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PortadaLibro(
    portadaLibro: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = portadaLibro,
        radius = 16.0,
        strokeColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        strokeWidth = 2.0,
        borderAlignment = BorderAlignment.Outside,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(217.0.dp).requiredHeight(334.0.dp)
    )
}

@Composable
fun ReseAPersonal(modifier: Modifier = Modifier) {
    RelayText(
        content = "Reseña personal",
        fontSize = 27.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(280.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.informacion_libro_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.37457275390625.dp,
                top = 2.37689208984375.dp,
                end = 0.62542724609375.dp,
                bottom = 0.62310791015625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun FluentEdit32Regular(
    editTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = editTapped).requiredWidth(38.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Frame1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 2.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun ReseAPersonalText(
    reseAPersonalText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = reseAPersonalText,
        fontSize = 20.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Comentarios(modifier: Modifier = Modifier) {
    RelayText(
        content = "Comentarios",
        fontSize = 27.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(53.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun ComentariosText(
    comentariosText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = comentariosText,
        fontSize = 20.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun RellenablesPersonales(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        padding = PaddingValues(
            start = 16.0.dp,
            top = 8.0.dp,
            end = 16.0.dp,
            bottom = 8.0.dp
        ),
        itemSpacing = 10.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.requiredWidth(341.0.dp).requiredHeight(185.0.dp)
    )
}

@Composable
fun Sinopsis(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sinopsis",
        fontSize = 28.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(52.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SinopsisText(
    sinopsisText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = sinopsisText,
        fontSize = 15.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Autor(modifier: Modifier = Modifier) {
    RelayText(
        content = "Autor:",
        fontSize = 28.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(52.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun AutorText(
    autorText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = autorText,
        fontSize = 20.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun FechaSalida(modifier: Modifier = Modifier) {
    RelayText(
        content = "Fecha de Salida:",
        fontSize = 28.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).requiredHeight(52.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun FechaSalidaText(
    fechaSalidaText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = fechaSalidaText,
        fontSize = 20.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(320.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun InformacionLibroGeneral(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        padding = PaddingValues(all = 8.0.dp),
        radius = 16.0,
        content = content,
        modifier = modifier.requiredWidth(344.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 24.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

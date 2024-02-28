package com.gmulbat1301.ebookshelf.panellibro

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gmulbat1301.ebookshelf.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

// Design to select for PanelLibro
enum class Property1 {
    Default,
    Variant2,
    Variant3,
    Variant4,
    Variant5,
    Variant6
}

/**
 * This composable was generated from the UI Package 'panel_libro'.
 * Generated code; do not edit directly
 */
@Composable
fun PanelLibro(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Default,
    tituloLibroCard: String,
    sinopsisLibroCard: String
) {
    when (property1) {
        Property1.Default -> TopLevelProperty1Default(modifier = modifier) {
            TituloProperty1Default(tituloLibroCard = tituloLibroCard)
            SinopsisProperty1Default(sinopsisLibroCard = sinopsisLibroCard)
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(modifier = modifier) {
            TituloProperty1Variant2(tituloLibroCard = tituloLibroCard)
            SinopsisProperty1Variant2(sinopsisLibroCard = sinopsisLibroCard)
            Image1Property1Variant2()
        }
        Property1.Variant3 -> TopLevelProperty1Variant3(modifier = modifier) {
            TituloProperty1Variant3(tituloLibroCard = tituloLibroCard)
            SinopsisProperty1Variant3(sinopsisLibroCard = sinopsisLibroCard)
            ImagenLibroProperty1Variant3()
        }
        Property1.Variant4 -> TopLevelProperty1Variant4(modifier = modifier) {
            TituloProperty1Variant4(tituloLibroCard = tituloLibroCard)
            SinopsisProperty1Variant4(sinopsisLibroCard = sinopsisLibroCard)
            ImagenLibroProperty1Variant4()
        }
        Property1.Variant5 -> TopLevelProperty1Variant5(modifier = modifier) {
            TituloProperty1Variant5(tituloLibroCard = tituloLibroCard)
            SinopsisProperty1Variant5(sinopsisLibroCard = sinopsisLibroCard)
            ImagenLibroProperty1Variant5()
        }
        Property1.Variant6 -> TopLevelProperty1Variant6(modifier = modifier) {
            TituloProperty1Variant6(tituloLibroCard = tituloLibroCard)
            SinopsisProperty1Variant6(sinopsisLibroCard = sinopsisLibroCard)
            ImagenLibroProperty1Variant6()
        }
    }
}

@Preview(widthDp = 350, heightDp = 349)
@Composable
private fun PanelLibroProperty1DefaultPreview() {
    MaterialTheme {
        RelayContainer {
            PanelLibro(
                tituloLibroCard = "El Imperio Final",
                sinopsisLibroCard = "Durante mil años han caído cenizas del cielo. Durante mil años nada ha  florecido. Durante mil años los skaa han sido esclavizados y viven en la  miseria, sumidos en un miedo inevitable. Durante mil años el Lord  Legislador ha reinado con poder absoluto, dominando gracias al terror, a  sus poderes y a su inmortalidad, ayudado por «obligadores» e «inquisidores», junto a la poderosa magia de la alomancia.\n",
                property1 = Property1.Default,
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 350, heightDp = 497)
@Composable
private fun PanelLibroProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            PanelLibro(
                tituloLibroCard = "El Pozo de la Ascension",
                sinopsisLibroCard = "Durante mil años nada ha cambiado: han caído las cenizas, los skaa han  sido esclavizados y el Lord Legislador ha dominado el mundo. Pero lo  imposible ha sucedido. El Lord Legislador ha muerto. Sin embargo, vencer  y matarlo fue la parte sencilla. El verdadero desafío será sobrevivir a las consecuencias de su caída.\n",
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 350, heightDp = 469)
@Composable
private fun PanelLibroProperty1Variant3Preview() {
    MaterialTheme {
        RelayContainer {
            PanelLibro(
                tituloLibroCard = "El Heroe de las Eras",
                sinopsisLibroCard = "Vin y el Rey Elend buscan en los últimos escondites de recursos del Lord Legislador y, engañado, el Rey libera del Pozo de la Ascensión algo que debería haber quedado oculto para siempre. Un enorme peligro acecha a la humanidad, y la verdadera pregunta es si conseguirán detenerlo a tiempo\n",
                property1 = Property1.Variant3,
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 350, heightDp = 654)
@Composable
private fun PanelLibroProperty1Variant4Preview() {
    MaterialTheme {
        RelayContainer {
            PanelLibro(
                tituloLibroCard = "Aleación de Ley",
                sinopsisLibroCard = "Han pasado trescientos años desde los acontecimientos narrados en la  primera trilogía de la saga, y Scadrial se encuentra ahora cerca de la  modernidad: ferrocarriles, canales, iluminación eléctrica y los primeros  rascacielos invaden el planeta. Aunque la ciencia y la tecnología están  alcanzando nuevos retos, la antigua magia de la alomancia continúa  desempeñando un papel fundamental. En una zona conocida como los Áridos,  existen herramientas cruciales para aquellos hombres y mujeres que  intentan establecer el orden y la justicia. Uno de estos hombres es Lord  Waxillium Ladrian, experto en metales y en el uso de la alomancia y la feruquimia.",
                property1 = Property1.Variant4,
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 350, heightDp = 469)
@Composable
private fun PanelLibroProperty1Variant5Preview() {
    MaterialTheme {
        RelayContainer {
            PanelLibro(
                tituloLibroCard = "Sombras de Identidad",
                sinopsisLibroCard = "La sociedad de Nacidos de la Bruma ha evolucionado en una fusión de  magia y tecnología en la que la economía se expande, la democracia se  enfrenta a la corrupción y la religión se convierte en una potencia  cultural cada vez más influyente, con cuatro fes distintas enfrentadas por la captación de conversos.",
                property1 = Property1.Variant5,
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 350, heightDp = 469)
@Composable
private fun PanelLibroProperty1Variant6Preview() {
    MaterialTheme {
        RelayContainer {
            PanelLibro(
                tituloLibroCard = "Brazales de Duelo",
                sinopsisLibroCard = "La cuenca de Elendel es un polvorín. El descontento de los trabajadores  se suma a las diferencias irreconciliables entre la capital y las demás  ciudades de la cuenca; Elendel asegura gobernarlas mientras sus  habitantes denuncian la opresión a la que se sienten sometidos.",
                property1 = Property1.Variant6,
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Composable
fun TituloProperty1Default(
    tituloLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloLibroCard,
        fontSize = 34.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 22,
            green = 22,
            blue = 24
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(330.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SinopsisProperty1Default(
    sinopsisLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = sinopsisLibroCard,
        fontSize = 15.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 22,
            green = 22,
            blue = 24
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(326.0.dp)
    )
}

@Composable
fun TopLevelProperty1Default(
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
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TituloProperty1Variant2(
    tituloLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloLibroCard,
        fontSize = 37.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(330.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SinopsisProperty1Variant2(
    sinopsisLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = sinopsisLibroCard,
        fontSize = 15.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(326.0.dp)
    )
}

@Composable
fun Image1Property1Variant2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.panel_libro_image_1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(139.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant2(
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
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TituloProperty1Variant3(
    tituloLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloLibroCard,
        fontSize = 34.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(330.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SinopsisProperty1Variant3(
    sinopsisLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = sinopsisLibroCard,
        fontSize = 15.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(326.0.dp)
    )
}

@Composable
fun ImagenLibroProperty1Variant3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.panel_libro_imagen_libro),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(139.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant3(
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
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TituloProperty1Variant4(
    tituloLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloLibroCard,
        fontSize = 34.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(330.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SinopsisProperty1Variant4(
    sinopsisLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = sinopsisLibroCard,
        fontSize = 15.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(326.0.dp)
    )
}

@Composable
fun ImagenLibroProperty1Variant4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.panel_libro_imagen_libro1),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(169.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant4(
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
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TituloProperty1Variant5(
    tituloLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloLibroCard,
        fontSize = 34.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(330.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SinopsisProperty1Variant5(
    sinopsisLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = sinopsisLibroCard,
        fontSize = 15.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(326.0.dp)
    )
}

@Composable
fun ImagenLibroProperty1Variant5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.panel_libro_imagen_libro2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(139.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant5(
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
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun TituloProperty1Variant6(
    tituloLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloLibroCard,
        fontSize = 34.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(330.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun SinopsisProperty1Variant6(
    sinopsisLibroCard: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = sinopsisLibroCard,
        fontSize = 15.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 14,
            green = 13,
            blue = 46
        ),
        height = 1.31884765625.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(326.0.dp)
    )
}

@Composable
fun ImagenLibroProperty1Variant6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.panel_libro_imagen_libro3),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(159.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant6(
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
            start = 0.0.dp,
            top = 8.0.dp,
            end = 0.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 16.0,
        clipToParent = false,
        radius = 16.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

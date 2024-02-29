package com.gmulbat1301.ebookshelf.panellibro

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'panel_libro'.
 * Generated code; do not edit directly
 */
@Composable
fun PanelLibro(
    modifier: Modifier = Modifier,
    tituloLibroCard: String,
    sinopsisLibroCard: String
) {
    TopLevel(modifier = modifier) {
        Titulo(tituloLibroCard = tituloLibroCard)
        Sinopsis(sinopsisLibroCard = sinopsisLibroCard)
    }
}

@Preview(widthDp = 350, heightDp = 349)
@Composable
private fun PanelLibroPreview() {
    MaterialTheme {
        RelayContainer {
            PanelLibro(
                tituloLibroCard = "El Imperio Final",
                sinopsisLibroCard = "Durante mil años han caído cenizas del cielo. Durante mil años nada ha  florecido. Durante mil años los skaa han sido esclavizados y viven en la  miseria, sumidos en un miedo inevitable. Durante mil años el Lord  Legislador ha reinado con poder absoluto, dominando gracias al terror, a  sus poderes y a su inmortalidad, ayudado por «obligadores» e «inquisidores», junto a la poderosa magia de la alomancia.\n",
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Composable
fun Titulo(
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
fun Sinopsis(
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
fun TopLevel(
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

package com.gmulbat1301.ebookshelf.botonsmall

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gmulbat1301.ebookshelf.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'boton_small'.
 * Generated code; do not edit directly
 */
@Composable
fun BotonSmall(
    modifier: Modifier = Modifier,
    botonSmallTapped: () -> Unit = {},
    text: String
) {
    TopLevel(
        botonSmallTapped = botonSmallTapped,
        modifier = modifier
    ) {
        Fondo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Text(
            text = text,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
    }
}

@Preview(widthDp = 165, heightDp = 50)
@Composable
private fun BotonSmallPreview() {
    MaterialTheme {
        RelayContainer {
            BotonSmall(
                botonSmallTapped = {},
                text = "Crear Cuenta",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Fondo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.boton_small_fondo),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = text,
        fontSize = 17.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 22,
            green = 22,
            blue = 24
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TopLevel(
    botonSmallTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = botonSmallTapped).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

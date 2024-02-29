package com.gmulbat1301.ebookshelf.headeruser

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
 * This composable was generated from the UI Package 'header_user'.
 * Generated code; do not edit directly
 */
@Composable
fun HeaderUser(
    modifier: Modifier = Modifier,
    arrowBackTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        UserLogo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            UserLogoBody2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            UserLogoBody(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            UserLogoHead(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            UserLogoCircunference(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        EBookShelf(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Vector(
            arrowBackTapped = arrowBackTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0000152587890625.dp
                )
            ).rowWeight(1.0f).columnWeight(1.0f)
        )
    }
}

@Preview(widthDp = 318, heightDp = 129)
@Composable
private fun HeaderUserPreview() {
    MaterialTheme {
        RelayContainer {
            HeaderUser(
                arrowBackTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun UserLogoBody2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_user_user_logo_body_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 54.0.dp,
                end = 16.0.dp,
                bottom = 4.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun UserLogoBody(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_user_user_logo_body),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 11.0.dp,
                top = 35.0.dp,
                end = 12.0.dp,
                bottom = 9.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun UserLogoHead(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_user_user_logo_head),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 21.0.dp,
                top = 9.0.dp,
                end = 21.0.dp,
                bottom = 33.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun UserLogoCircunference(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_user_user_logo_circunference),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun UserLogo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 164.0.dp,
                top = 64.0.dp,
                end = 89.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun EBookShelf(modifier: Modifier = Modifier) {
    RelayText(
        content = "EBookShelf",
        fontSize = 36.0.sp,
        fontFamily = robotoMono,
        color = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        height = 1.31884765625.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 76.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 65.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Vector(
    arrowBackTapped: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.header_user_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.8890762329101562.dp,
                top = 12.000007629394531.dp,
                end = 281.88907623291016.dp,
                bottom = 76.99999237060547.dp
            )
        ).tappable(onTap = arrowBackTapped).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

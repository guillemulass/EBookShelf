package com.gmulbat1301.ebookshelf.headerpaginaprincipal

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
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'header_pagina_principal'.
 * Generated code; do not edit directly
 */
@Composable
fun HeaderPaginaPrincipal(
    modifier: Modifier = Modifier,
    userLogoTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        MdiBookshelf {
            Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        EBookShelf()
        UserLogo(userLogoTapped = userLogoTapped) {
            UserLogoBody2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 25.0.dp
                    )
                )
            )
            UserLogoBody(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 13.0.dp
                    )
                )
            )
            UserLogoHead(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -12.0.dp
                    )
                )
            )
            UserLogoCircunference(
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

@Preview(widthDp = 379, heightDp = 65)
@Composable
private fun HeaderPaginaPrincipalPreview() {
    MaterialTheme {
        HeaderPaginaPrincipal(userLogoTapped = {})
    }
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_pagina_principal_vector),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 8.125.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MdiBookshelf(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(65.0.dp).requiredHeight(65.0.dp)
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
        modifier = modifier.requiredWidth(217.0.dp).requiredHeight(64.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun UserLogoBody2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_pagina_principal_user_logo_body_2),
        modifier = modifier.requiredWidth(33.0.dp).requiredHeight(7.0.dp)
    )
}

@Composable
fun UserLogoBody(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_pagina_principal_user_logo_body),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(21.0.dp)
    )
}

@Composable
fun UserLogoHead(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_pagina_principal_user_logo_head),
        modifier = modifier.requiredWidth(23.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun UserLogoCircunference(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_pagina_principal_user_logo_circunference),
        modifier = modifier.requiredWidth(65.0.dp).requiredHeight(65.0.dp)
    )
}

@Composable
fun UserLogo(
    userLogoTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = userLogoTapped).requiredWidth(65.0.dp).requiredHeight(65.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

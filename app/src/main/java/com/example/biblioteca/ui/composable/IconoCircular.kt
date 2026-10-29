package com.example.biblioteca.ui.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun IconoCircular(
    @DrawableRes icono: Int,
    colorIcono: Color,
    colorFondo: Color,
    modifier: Modifier = Modifier,
    tamano: Dp = 160.dp
) {
    Box(
        modifier = modifier
            .size(tamano)
            .clip(CircleShape)
            .background(colorFondo),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = icono),
            contentDescription = null,
            tint = colorIcono,
            modifier = Modifier.size(tamano / 2)
        )
    }
}
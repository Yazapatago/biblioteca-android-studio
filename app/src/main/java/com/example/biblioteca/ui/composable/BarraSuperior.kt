package com.example.biblioteca.ui.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.MoradoPrincipal
import com.example.biblioteca.ui.theme.TextoOscuro

@Composable
fun BarraSuperior(
    titulo: String,
    @DrawableRes iconoIzquierdo: Int,
    onClickIzquierdo: () -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes iconoDerecho: Int? = null
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 8.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onClickIzquierdo) {
            Icon(
                painter = painterResource(id = iconoIzquierdo),
                contentDescription = null,
                tint = TextoOscuro
            )
        }
        Text(
            text = titulo,
            modifier = Modifier.weight(1f),
            color = TextoOscuro,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        if (iconoDerecho != null) {
            Icon(
                painter = painterResource(id = iconoDerecho),
                contentDescription = null,
                tint = MoradoPrincipal,
                modifier = Modifier
                    .padding(end = 12.dp)
                    .size(26.dp)
            )
        }
    }
}
package com.example.biblioteca.ui.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.TextoOscuro

@Composable
fun InfoFila(
    etiqueta: String,
    valor: String,
    modifier: Modifier = Modifier,
    colorValor: Color = TextoOscuro
) {
    Row(modifier = modifier.fillMaxWidth()) {
        Text(
            text = "$etiqueta:",
            modifier = Modifier.width(110.dp),
            color = TextoOscuro,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(text = valor, color = colorValor, fontSize = 15.sp)
    }
}
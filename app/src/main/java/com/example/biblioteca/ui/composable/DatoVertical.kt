package com.example.biblioteca.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.TextoGris
import com.example.biblioteca.ui.theme.TextoOscuro

@Composable
fun DatoVertical(
    etiqueta: String,
    valor: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = etiqueta, color = TextoGris, fontSize = 13.sp)
        Text(text = valor, color = TextoOscuro, fontSize = 15.sp, fontWeight = FontWeight.SemiBold)
    }
}
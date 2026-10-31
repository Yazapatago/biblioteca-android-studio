package com.example.biblioteca.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.VerdeClaro
import com.example.biblioteca.ui.theme.VerdePrincipal

@Composable
fun EstadoChip(
    texto: String,
    modifier: Modifier = Modifier,
    color: Color = VerdePrincipal,
    colorFondo: Color = VerdeClaro
) {
    Text(
        text = texto,
        color = color,
        fontSize = 13.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = modifier
            .background(colorFondo, RoundedCornerShape(50))
            .border(1.dp, color, RoundedCornerShape(50))
            .padding(horizontal = 14.dp, vertical = 4.dp)
    )
}
package com.example.biblioteca.ui.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.TextoGris
import com.example.biblioteca.ui.theme.TextoOscuro

@Composable
fun DatoConIcono(
    @DrawableRes icono: Int,
    etiqueta: String,
    valor: String,
    colorIcono: Color,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = icono),
            contentDescription = null,
            tint = colorIcono,
            modifier = Modifier.size(28.dp)
        )
        Spacer(modifier = Modifier.width(14.dp))
        Column {
            Text(text = etiqueta, color = TextoGris, fontSize = 14.sp)
            Text(text = valor, color = TextoOscuro, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}

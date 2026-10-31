package com.example.biblioteca.ui.section

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.theme.NaranjaClaro
import com.example.biblioteca.ui.theme.NaranjaPrincipal

@Composable
fun PortadaSection(
    @DrawableRes portada: Int,
    nombre: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Parámetro recibido",
            color = NaranjaPrincipal,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .background(NaranjaClaro, RoundedCornerShape(10.dp))
                .border(1.dp, NaranjaPrincipal, RoundedCornerShape(10.dp))
                .padding(horizontal = 16.dp, vertical = 6.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = portada),
            contentDescription = nombre,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(150.dp)
                .height(212.dp)
                .shadow(10.dp, RoundedCornerShape(8.dp))
                .clip(RoundedCornerShape(8.dp))
        )
    }
}
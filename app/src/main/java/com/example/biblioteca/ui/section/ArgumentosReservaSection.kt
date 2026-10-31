package com.example.biblioteca.ui.section

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.ui.composable.DatoVertical
import com.example.biblioteca.ui.composable.EstadoChip
import com.example.biblioteca.ui.composable.Etiqueta
import com.example.biblioteca.ui.composable.NotaInfo
import com.example.biblioteca.ui.theme.VerdeClaro
import com.example.biblioteca.ui.theme.VerdePrincipal

@Composable
fun ArgumentosReservaSection(
    @DrawableRes portada: Int,
    nombreLibro: String,
    autor: String,
    fechaReserva: String,
    codigoReserva: String,
    estado: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Etiqueta(
            texto = "Argumentos recibidos",
            icono = R.drawable.ic_check,
            color = VerdePrincipal,
            colorFondo = VerdeClaro
        )
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        ) {
            Row(modifier = Modifier.padding(16.dp)) {
                Image(
                    painter = painterResource(id = portada),
                    contentDescription = nombreLibro,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(100.dp)
                        .height(140.dp)
                        .clip(RoundedCornerShape(6.dp))
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    DatoVertical(etiqueta = "Nombre:", valor = nombreLibro)
                    DatoVertical(etiqueta = "Autor:", valor = autor)
                    DatoVertical(etiqueta = "Fecha Reserva:", valor = fechaReserva)
                    DatoVertical(etiqueta = "Código Reserva:", valor = codigoReserva)
                    EstadoChip(texto = estado)
                }
            }
        }
        NotaInfo(texto = "Estos datos fueron enviados desde la pantalla anterior como parámetros.")
    }
}
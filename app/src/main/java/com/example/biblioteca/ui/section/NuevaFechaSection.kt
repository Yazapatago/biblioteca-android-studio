package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.ui.composable.BotonPrincipal
import com.example.biblioteca.ui.composable.CampoFecha
import com.example.biblioteca.ui.composable.DatoConIcono
import com.example.biblioteca.ui.theme.MoradoPrincipal
import com.example.biblioteca.ui.theme.NaranjaPrincipal

@Composable
fun NuevaFechaSection(
    fechaActual: String,
    fechaNueva: String,
    onConfirmar: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                DatoConIcono(
                    icono = R.drawable.ic_calendario,
                    etiqueta = "Reserva Actual:",
                    valor = fechaActual,
                    colorIcono = MoradoPrincipal
                )
                CampoFecha(etiqueta = "Nueva Fecha:", valor = fechaNueva)
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        BotonPrincipal(
            texto = "Confirmar Renovación",
            icono = R.drawable.ic_check,
            color = NaranjaPrincipal,
            onClick = onConfirmar
        )
    }
}
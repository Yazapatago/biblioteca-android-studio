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
import com.example.biblioteca.ui.composable.DatoConIcono
import com.example.biblioteca.ui.theme.MoradoPrincipal
import com.example.biblioteca.ui.theme.VerdePrincipal

@Composable
fun ResumenReservaSection(
    nombreLibro: String,
    fecha: String,
    onVolverInicio: () -> Unit,
    onVerReservas: () -> Unit,
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
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                DatoConIcono(
                    icono = R.drawable.ic_libros,
                    etiqueta = "Libro:",
                    valor = nombreLibro,
                    colorIcono = VerdePrincipal
                )
                DatoConIcono(
                    icono = R.drawable.ic_calendario,
                    etiqueta = "Fecha:",
                    valor = fecha,
                    colorIcono = VerdePrincipal
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        BotonPrincipal(
            texto = "Ver Mis Reservas",
            icono = R.drawable.ic_ver,
            color = MoradoPrincipal,
            onClick = onVerReservas
        )
        Spacer(modifier = Modifier.height(12.dp))
        BotonPrincipal(
            texto = "Volver al Inicio",
            icono = R.drawable.ic_home,
            color = VerdePrincipal,
            onClick = onVolverInicio
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}
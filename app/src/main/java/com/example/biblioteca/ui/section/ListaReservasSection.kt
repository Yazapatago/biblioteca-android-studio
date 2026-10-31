package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.data.model.Reserva
import com.example.biblioteca.ui.composable.NotaInfo
import com.example.biblioteca.ui.composable.ReservaItem

@Composable
fun ListaReservasSection(
    reservas: List<Reserva>,
    onVerReserva: (String, String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        reservas.forEach { reserva ->
            ReservaItem(
                nombre = reserva.nombreLibro,
                portada = reserva.portada,
                fecha = reserva.fechaReserva,
                estado = reserva.estado,
                onVerReserva = {
                    onVerReserva(reserva.nombreLibro, reserva.fechaReserva, reserva.codigo)
                }
            )
        }
        NotaInfo(texto = "Aquí verás todas tus reservas activas.")
    }
}
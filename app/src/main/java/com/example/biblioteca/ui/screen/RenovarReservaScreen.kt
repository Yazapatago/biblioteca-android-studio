package com.example.biblioteca.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.data.buscarReservaPorCodigo
import com.example.biblioteca.ui.section.BarraVolverSection
import com.example.biblioteca.ui.section.LibroReservaSection
import com.example.biblioteca.ui.section.NuevaFechaSection
import com.example.biblioteca.ui.theme.FondoApp

@Composable
fun RenovarReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    codigoReserva: String,
    onVolver: () -> Unit,
    onConfirmar: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val reserva = buscarReservaPorCodigo(codigoReserva)
    val fechaNueva = reserva?.fechaRenovacion ?: fechaReserva

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(FondoApp)
    ) {
        BarraVolverSection(titulo = "Renovar Reserva", onVolver = onVolver)
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            LibroReservaSection(
                portada = reserva?.portada ?: R.drawable.ic_libros,
                nombreLibro = nombreLibro
            )
            Spacer(modifier = Modifier.height(20.dp))
            NuevaFechaSection(
                fechaActual = fechaReserva,
                fechaNueva = fechaNueva,
                onConfirmar = { onConfirmar(fechaNueva) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RenovarReservaScreenPreview() {
    RenovarReservaScreen(
        nombreLibro = "Clean Code",
        fechaReserva = "15/06/2026",
        codigoReserva = "RES-2026-001",
        onVolver = {},
        onConfirmar = {}
    )
}
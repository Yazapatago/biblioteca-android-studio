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
import com.example.biblioteca.ui.section.AccionesReservaSection
import com.example.biblioteca.ui.section.ArgumentosReservaSection
import com.example.biblioteca.ui.section.BarraVolverSection
import com.example.biblioteca.ui.theme.FondoApp

@Composable
fun DetalleReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    codigoReserva: String,
    onVolver: () -> Unit,
    onRenovar: () -> Unit,
    onCancelar: () -> Unit,
    modifier: Modifier = Modifier
) {
    val reserva = buscarReservaPorCodigo(codigoReserva)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(FondoApp)
    ) {
        BarraVolverSection(titulo = "Detalle de Reserva", onVolver = onVolver)
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            ArgumentosReservaSection(
                portada = reserva?.portada ?: R.drawable.ic_libros,
                nombreLibro = nombreLibro,
                autor = reserva?.autor ?: "Desconocido",
                fechaReserva = fechaReserva,
                codigoReserva = codigoReserva,
                estado = reserva?.estado ?: "Activa"
            )
            Spacer(modifier = Modifier.height(24.dp))
            AccionesReservaSection(
                onRenovar = onRenovar,
                onCancelar = onCancelar
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetalleReservaScreenPreview() {
    DetalleReservaScreen(
        nombreLibro = "Clean Code",
        fechaReserva = "15/06/2026",
        codigoReserva = "RES-2026-001",
        onVolver = {},
        onRenovar = {},
        onCancelar = {}
    )
}
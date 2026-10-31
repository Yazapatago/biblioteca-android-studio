package com.example.biblioteca.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.section.ExitoSection
import com.example.biblioteca.ui.section.ResumenRenovacionSection
import com.example.biblioteca.ui.theme.VerdeClaro

@Composable
fun RenovacionExitosaScreen(
    nombreLibro: String,
    fechaNueva: String,
    onVolverReservas: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(VerdeClaro)
            .padding(24.dp)
    ) {
        ExitoSection(
            modifier = Modifier.weight(1f),
            titulo = "Reserva Renovada"
        )
        ResumenRenovacionSection(
            nombreLibro = nombreLibro,
            fechaNueva = fechaNueva,
            onVolverReservas = onVolverReservas
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RenovacionExitosaScreenPreview() {
    RenovacionExitosaScreen(
        nombreLibro = "Clean Code",
        fechaNueva = "30/06/2026",
        onVolverReservas = {}
    )
}
package com.example.biblioteca.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.biblioteca.data.listaReservas
import com.example.biblioteca.ui.section.EncabezadoReservasSection
import com.example.biblioteca.ui.section.ListaReservasSection
import com.example.biblioteca.ui.theme.FondoApp

@Composable
fun MisReservasScreen(
    onVerReserva: (String, String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(FondoApp)
    ) {
        EncabezadoReservasSection()
        ListaReservasSection(
            reservas = listaReservas,
            onVerReserva = onVerReserva,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MisReservasScreenPreview() {
    MisReservasScreen(onVerReserva = { _, _, _ -> })
}
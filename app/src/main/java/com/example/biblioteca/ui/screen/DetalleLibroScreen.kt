package com.example.biblioteca.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.biblioteca.data.buscarLibroPorId
import com.example.biblioteca.ui.section.InfoLibroSection
import com.example.biblioteca.ui.section.PortadaSection
import com.example.biblioteca.ui.theme.FondoApp

@Composable
fun DetalleLibroScreen(
    id: Int,
    onReservar: () -> Unit,
    modifier: Modifier = Modifier
) {
    val libro = buscarLibroPorId(id)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(FondoApp)
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (libro != null) {
            PortadaSection(portada = libro.portada, nombre = libro.nombre)
            Spacer(modifier = Modifier.height(24.dp))
            InfoLibroSection(libro = libro, onReservar = onReservar)
        } else {
            Text(text = "No se encontró el libro con id $id")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetalleLibroScreenPreview() {
    DetalleLibroScreen(id = 1, onReservar = {})
}
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
import com.example.biblioteca.data.listaLibros
import com.example.biblioteca.ui.section.EncabezadoListaSection
import com.example.biblioteca.ui.section.ListaLibrosSection
import com.example.biblioteca.ui.theme.FondoApp

@Composable
fun ListaLibrosScreen(
    onVerDetalle: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(FondoApp)
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        EncabezadoListaSection()
        Spacer(modifier = Modifier.height(20.dp))
        ListaLibrosSection(libros = listaLibros, onVerDetalle = onVerDetalle)
    }
}

@Preview(showBackground = true)
@Composable
fun ListaLibrosScreenPreview() {
    ListaLibrosScreen(onVerDetalle = {})
}
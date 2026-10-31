package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.data.model.Libro
import com.example.biblioteca.ui.composable.LibroItem

@Composable
fun ListaLibrosSection(
    libros: List<Libro>,
    onVerDetalle: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        libros.forEach { libro ->
            LibroItem(
                nombre = libro.nombre,
                portada = libro.portada,
                onVerDetalle = { onVerDetalle(libro.id) }
            )
        }
    }
}
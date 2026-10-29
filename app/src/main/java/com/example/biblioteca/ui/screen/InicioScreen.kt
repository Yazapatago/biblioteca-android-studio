package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun InicioScreen(
    onVerLibros: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Inicio Biblioteca")
        Button(onClick = onVerLibros) {
            Text(text = "Ver Libros")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioScreenPreview() {
    InicioScreen(onVerLibros = {})
}
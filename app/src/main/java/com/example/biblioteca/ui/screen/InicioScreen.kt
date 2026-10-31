package com.example.biblioteca.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.section.BienvenidaSection
import com.example.biblioteca.ui.theme.FondoApp

@Composable
fun InicioScreen(
    onVerLibros: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(FondoApp)
            .padding(24.dp)
    ) {
        BienvenidaSection(onVerLibros = onVerLibros)
    }
}

@Preview(showBackground = true)
@Composable
fun InicioScreenPreview() {
    InicioScreen(onVerLibros = {})
}
package com.example.biblioteca.ui.section

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.biblioteca.R
import com.example.biblioteca.ui.composable.BarraSuperior

@Composable
fun BarraVolverSection(
    titulo: String,
    onVolver: () -> Unit,
    modifier: Modifier = Modifier
) {
    BarraSuperior(
        titulo = titulo,
        iconoIzquierdo = R.drawable.ic_atras,
        onClickIzquierdo = onVolver,
        modifier = modifier
    )
}
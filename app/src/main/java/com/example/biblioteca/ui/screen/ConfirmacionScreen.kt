package com.example.biblioteca.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.biblioteca.data.buscarLibroPorId
import com.example.biblioteca.ui.section.ExitoSection
import com.example.biblioteca.ui.section.ResumenReservaSection
import com.example.biblioteca.ui.theme.VerdeClaro
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
fun ConfirmacionScreen(
    id: Int,
    onVolverInicio: () -> Unit,
    modifier: Modifier = Modifier
) {
    val libro = buscarLibroPorId(id)
    val fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(VerdeClaro)
            .padding(24.dp)
    ) {
        ExitoSection(modifier = Modifier.weight(1f))
        ResumenReservaSection(
            nombreLibro = libro?.nombre ?: "Desconocido",
            fecha = fecha,
            onVolverInicio = onVolverInicio
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ConfirmacionScreenPreview() {
    ConfirmacionScreen(id = 1, onVolverInicio = {})
}
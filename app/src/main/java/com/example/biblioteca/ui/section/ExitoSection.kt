package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.ui.composable.IconoCircular
import com.example.biblioteca.ui.composable.Titulo
import com.example.biblioteca.ui.theme.VerdeMedio
import com.example.biblioteca.ui.theme.VerdePrincipal

@Composable
fun ExitoSection(
    modifier: Modifier = Modifier,
    titulo: String = "Reserva Exitosa"
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        IconoCircular(
            icono = R.drawable.ic_check,
            colorIcono = VerdePrincipal,
            colorFondo = VerdeMedio,
            tamano = 170.dp
        )
        Spacer(modifier = Modifier.height(24.dp))
        Titulo(texto = titulo, color = VerdePrincipal)
    }
}
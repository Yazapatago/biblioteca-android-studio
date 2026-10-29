package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.R
import com.example.biblioteca.ui.composable.BotonPrincipal
import com.example.biblioteca.ui.composable.IconoCircular
import com.example.biblioteca.ui.composable.Parrafo
import com.example.biblioteca.ui.composable.Titulo
import com.example.biblioteca.ui.theme.MoradoClaro
import com.example.biblioteca.ui.theme.MoradoPrincipal

@Composable
fun BienvenidaSection(
    onVerLibros: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            IconoCircular(
                icono = R.drawable.ic_biblioteca,
                colorIcono = MoradoPrincipal,
                colorFondo = MoradoClaro,
                tamano = 180.dp
            )
            Spacer(modifier = Modifier.height(32.dp))
            Titulo(
                texto = "¡Bienvenido a tu Biblioteca!",
                tamano = 26.sp,
                alineacion = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(12.dp))
            Parrafo(
                texto = "Descubre, aprende y reserva tus libros favoritos.",
                alineacion = TextAlign.Center
            )
        }
        BotonPrincipal(
            texto = "Ver Libros",
            icono = R.drawable.ic_libros,
            color = MoradoPrincipal,
            onClick = onVerLibros
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}
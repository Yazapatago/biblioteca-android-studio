package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.ui.composable.Parrafo
import com.example.biblioteca.ui.composable.Titulo
import com.example.biblioteca.ui.theme.MoradoPrincipal

@Composable
fun EncabezadoListaSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.ic_libros),
                contentDescription = null,
                tint = MoradoPrincipal,
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Titulo(texto = "Mis Libros")
        }
        Spacer(modifier = Modifier.height(6.dp))
        Parrafo(texto = "Elige un libro para ver más detalles.")
    }
}
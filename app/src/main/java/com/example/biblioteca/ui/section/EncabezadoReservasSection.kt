package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.R
import com.example.biblioteca.ui.composable.BarraSuperior
import com.example.biblioteca.ui.composable.Titulo
import com.example.biblioteca.ui.theme.NaranjaPrincipal

@Composable
fun EncabezadoReservasSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        BarraSuperior(
            titulo = "Mis Reservas",
            iconoIzquierdo = R.drawable.ic_menu,
            onClickIzquierdo = {},
            iconoDerecho = R.drawable.ic_libros
        )
        Row(
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_libros),
                contentDescription = null,
                tint = NaranjaPrincipal,
                modifier = Modifier.size(22.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Titulo(texto = "Lista de reservas activas", tamano = 17.sp)
        }
    }
}
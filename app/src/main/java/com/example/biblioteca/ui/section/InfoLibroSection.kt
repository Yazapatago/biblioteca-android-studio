package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.R
import com.example.biblioteca.data.model.Libro
import com.example.biblioteca.ui.composable.BotonPrincipal
import com.example.biblioteca.ui.composable.InfoFila
import com.example.biblioteca.ui.composable.Parrafo
import com.example.biblioteca.ui.theme.MoradoPrincipal
import com.example.biblioteca.ui.theme.NaranjaPrincipal
import com.example.biblioteca.ui.theme.TextoOscuro

@Composable
fun InfoLibroSection(
    libro: Libro,
    onReservar: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        InfoFila(etiqueta = "Nombre", valor = libro.nombre)
        InfoFila(etiqueta = "Autor", valor = libro.autor)
        InfoFila(etiqueta = "Categoría", valor = libro.categoria, colorValor = MoradoPrincipal)
        Text(
            text = "Descripción:",
            color = TextoOscuro,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold
        )
        Parrafo(texto = libro.descripcion)
        Spacer(modifier = Modifier.height(16.dp))
        BotonPrincipal(
            texto = "Reservar Libro",
            icono = R.drawable.ic_bookmark,
            color = NaranjaPrincipal,
            onClick = onReservar
        )
    }
}
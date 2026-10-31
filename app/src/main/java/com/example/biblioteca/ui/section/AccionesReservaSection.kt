package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.R
import com.example.biblioteca.ui.composable.BotonPrincipal
import com.example.biblioteca.ui.theme.RojoPrincipal
import com.example.biblioteca.ui.theme.VerdePrincipal

@Composable
fun AccionesReservaSection(
    onRenovar: () -> Unit,
    onCancelar: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        BotonPrincipal(
            texto = "Renovar",
            icono = R.drawable.ic_renovar,
            color = VerdePrincipal,
            onClick = onRenovar,
            modifier = Modifier.weight(1f),
            tamanoTexto = 15.sp
        )
        BotonPrincipal(
            texto = "Cancelar",
            icono = R.drawable.ic_cancelar,
            color = RojoPrincipal,
            onClick = onCancelar,
            modifier = Modifier.weight(1f),
            tamanoTexto = 15.sp
        )
    }
}
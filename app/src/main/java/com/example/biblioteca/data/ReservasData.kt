package com.example.biblioteca.data

import com.example.biblioteca.R
import com.example.biblioteca.data.model.Reserva

val listaReservas = listOf(
    Reserva(
        codigo = "RES-2026-001",
        nombreLibro = "Clean Code",
        autor = "Robert C. Martin",
        portada = R.drawable.clean_code,
        fechaReserva = "15/06/2026",
        fechaRenovacion = "30/06/2026",
        estado = "Activa"
    ),
    Reserva(
        codigo = "RES-2026-002",
        nombreLibro = "Jetpack Compose",
        autor = "Equipo Kodeco",
        portada = R.drawable.jetpack_compose,
        fechaReserva = "18/06/2026",
        fechaRenovacion = "03/07/2026",
        estado = "Activa"
    )
)

fun buscarReservaPorCodigo(codigo: String): Reserva? {
    return listaReservas.find { it.codigo == codigo }
}
package com.example.biblioteca.navigation

import kotlinx.serialization.Serializable

@Serializable
data object InicioRoute

@Serializable
data object ListaLibrosRoute

@Serializable
data class DetalleLibroRoute(val id: Int)

@Serializable
data class ConfirmacionRoute(val id: Int)

@Serializable
data object MisReservasRoute

@Serializable
data class DetalleReservaRoute(
    val nombreLibro: String,
    val fechaReserva: String,
    val codigoReserva: String
)

@Serializable
data class RenovarReservaRoute(
    val nombreLibro: String,
    val fechaReserva: String,
    val codigoReserva: String
)

@Serializable
data class RenovacionExitosaRoute(
    val nombreLibro: String,
    val fechaNueva: String
)
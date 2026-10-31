package com.example.biblioteca.data.model

import androidx.annotation.DrawableRes

data class Reserva(
    val codigo: String,
    val nombreLibro: String,
    val autor: String,
    @DrawableRes val portada: Int,
    val fechaReserva: String,
    val fechaRenovacion: String,
    val estado: String
)
package com.example.biblioteca.data.model

import androidx.annotation.DrawableRes

data class Libro(
    val id: Int,
    val nombre: String,
    val autor: String,
    val categoria: String,
    val descripcion: String,
    @DrawableRes val portada: Int
)
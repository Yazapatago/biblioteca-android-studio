package com.example.biblioteca.navigation

import kotlinx.serialization.Serializable


@Serializable
data object InicioRoute

@Serializable
data object ListaLibrosRoute

@Serializable
data class DetalleLibroRoute(val id: Int)

@Serializable
data class ConfirmacionRoute (val id: Int)
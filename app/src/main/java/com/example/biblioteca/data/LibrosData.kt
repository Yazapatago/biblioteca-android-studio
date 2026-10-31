package com.example.biblioteca.data

import com.example.biblioteca.R
import com.example.biblioteca.data.model.Libro

val listaLibros = listOf(
    Libro(
        id = 1,
        nombre = "Clean Code",
        autor = "Robert C. Martin",
        categoria = "Programación",
        descripcion = "Guía práctica para escribir código limpio, legible y mantenible. Un clásico imprescindible para desarrolladores.",
        portada = R.drawable.clean_code
    ),
    Libro(
        id = 2,
        nombre = "Kotlin para Android",
        autor = "Antonio Leiva",
        categoria = "Desarrollo móvil",
        descripcion = "Aprende Kotlin desde cero y aplícalo en la creación de aplicaciones Android modernas.",
        portada = R.drawable.kotlin_android
    ),
    Libro(
        id = 3,
        nombre = "Arquitectura de Software",
        autor = "Mark Richards y Neal Ford",
        categoria = "Arquitectura",
        descripcion = "Fundamentos para diseñar sistemas escalables: patrones, capas y toma de decisiones técnicas.",
        portada = R.drawable.arquitectura_software
    ),
    Libro(
        id = 4,
        nombre = "Jetpack Compose",
        autor = "Equipo Kodeco",
        categoria = "Desarrollo móvil",
        descripcion = "Construye interfaces declarativas en Android con composables, estados y navegación.",
        portada = R.drawable.jetpack_compose
    )
)

fun buscarLibroPorId(id: Int): Libro? {
    return listaLibros.find { it.id == id }
}
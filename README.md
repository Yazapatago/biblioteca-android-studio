# 📚 Biblioteca — Práctica de Navigation Compose

Aplicación Android desarrollada con **Jetpack Compose** que simula una biblioteca: el usuario explora un catálogo de libros, consulta su detalle y realiza una reserva. El objetivo de la práctica es conectar múltiples pantallas y compartir información entre ellas mediante **Navigation Compose**.

## Funcionalidades

- Pantalla de inicio con acceso al catálogo.
- Lista de libros con portada y botón para ver el detalle.
- Detalle del libro recibido como parámetro (`id`) desde la lista.
- Confirmación de reserva con el libro y la fecha actual.
- Regreso al inicio limpiando la pila de navegación.

## Flujo de navegación

```
Inicio → Lista de Libros → Detalle del Libro → Confirmación → Inicio
```

## Tecnologías

- Kotlin
- Jetpack Compose + Material 3
- Navigation Compose con rutas type-safe (`@Serializable`)
- Vector Drawables para íconos y portadas

## Arquitectura

El proyecto está organizado en capas y respeta la jerarquía **NavHost → Screen → Section → Composable**:

```
com.example.biblioteca
├── data          → modelo Libro y catálogo de libros
├── navigation    → rutas y NavHost
└── ui
    ├── screen      → pantallas (solo llaman secciones)
    ├── section     → bloques de cada pantalla
    ├── composable  → componentes reutilizables
    └── theme       → colores y tema
```

## Flujo de trabajo (Gitflow)

- `main` → versiones estables
- `develop` → integración
- `feature/*` → nuevas funcionalidades
- `bugfix/*` → correcciones en desarrollo
- `release/*` → preparación de versiones

## Versión

**v1.0.0** — Flujo completo de biblioteca: inicio, lista, detalle y confirmación de reserva.

## Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en Android Studio.
3. Sincronizar Gradle y ejecutar en un emulador o dispositivo.
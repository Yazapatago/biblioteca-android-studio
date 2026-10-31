# 📚 Biblioteca — Práctica de Navigation Compose

Aplicación Android desarrollada con **Jetpack Compose** que simula una biblioteca: el usuario explora un catálogo de libros, consulta su detalle, realiza una reserva y gestiona sus reservas. El objetivo de la práctica es conectar múltiples pantallas y compartir información entre ellas mediante **Navigation Compose**.

## Funcionalidades

### Parte 1 — Biblioteca
- Pantalla de inicio con acceso al catálogo.
- Lista de libros con portada y botón para ver el detalle.
- Detalle del libro recibido como parámetro (`id`) desde la lista.
- Confirmación de reserva con el libro y la fecha actual.
- Regreso al inicio limpiando la pila de navegación.

### Parte 2 — Mis Reservas
- Lista de reservas activas con acceso a su detalle.
- Detalle de reserva que recibe **múltiples parámetros** (`nombreLibro`, `fechaReserva`, `codigoReserva`).
- Renovación de reserva que envía la nueva fecha (`fechaNueva`) a la pantalla de éxito.
- Botones de regreso y cancelación que vuelven a Mis Reservas.

## Flujo de navegación

```
Inicio → Lista de Libros → Detalle del Libro → Confirmación → Inicio
                                                    ↓
                    Mis Reservas → Detalle de Reserva → Renovar Reserva → Renovación Exitosa
                                          ↓ (Cancelar)                            ↓
                                    Mis Reservas  ←───────────────────────  Mis Reservas
```

## Parámetros que viajan entre pantallas

| Parámetro | Descripción |
|---|---|
| `id` | Identificador del libro seleccionado |
| `nombreLibro` | Nombre del libro reservado |
| `fechaReserva` | Fecha de la reserva original |
| `codigoReserva` | Código único de la reserva |
| `fechaNueva` | Nueva fecha al renovar |

## Tecnologías

- Kotlin
- Jetpack Compose + Material 3
- Navigation Compose con rutas type-safe (`@Serializable`)
- Vector Drawables para íconos y portadas

## Arquitectura

El proyecto está organizado en capas y respeta la jerarquía **NavHost → Screen → Section → Composable**:

```
com.example.biblioteca
├── data          → catálogo de libros y reservas de ejemplo
│   └── model     → modelos Libro y Reserva
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

## Versiones

- **v1.0.0** — Flujo de biblioteca: inicio, lista, detalle y confirmación de reserva.
- **v1.1.0** — Flujo Mis Reservas: detalle, renovación y cancelación con múltiples parámetros.

## Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en Android Studio.
3. Sincronizar Gradle y ejecutar en un emulador o dispositivo.
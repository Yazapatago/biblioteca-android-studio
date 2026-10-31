package com.example.biblioteca.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.biblioteca.ui.screen.ConfirmacionScreen
import com.example.biblioteca.ui.screen.DetalleLibroScreen
import com.example.biblioteca.ui.screen.InicioScreen
import com.example.biblioteca.ui.screen.ListaLibrosScreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = InicioRoute,
        modifier = modifier
    ) {

        composable<InicioRoute> {
            InicioScreen(
                onVerLibros = { navController.navigate(ListaLibrosRoute) }
            )
        }

        composable<ListaLibrosRoute> {
            ListaLibrosScreen(
                onVerDetalle = { id -> navController.navigate(DetalleLibroRoute(id)) }
            )
        }

        composable<DetalleLibroRoute> { backStackEntry ->
            val ruta = backStackEntry.toRoute<DetalleLibroRoute>()
            DetalleLibroScreen(
                id = ruta.id,
                onReservar = { navController.navigate(ConfirmacionRoute(ruta.id)) }
            )
        }

        composable<ConfirmacionRoute> { backStackEntry ->
            val ruta = backStackEntry.toRoute<ConfirmacionRoute>()
            ConfirmacionScreen(
                id = ruta.id,
                onVolverInicio = {
                    navController.navigate(InicioRoute) {
                        popUpTo<InicioRoute> { inclusive = true }
                    }
                }
            )
        }
    }
}
package com.flexphd.foodprophet.ui.components

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}

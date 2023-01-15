package com.example.denysenkojetpackcompose

sealed class Screen(val route: String) {
    object MainCarScreen: Screen("main_car_screen")
    object DetailCarScreen: Screen("detail_car_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}


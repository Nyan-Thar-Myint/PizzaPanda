package com.example.pizzapanda.presentation.util

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home")
    object ExampleScreen: Screen("example")
}
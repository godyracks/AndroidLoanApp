package com.gody.funds

sealed class Screen(val route: String){
    object Home : Screen(route = "home_screen")
    object Profile: Screen(route = "profile_screen")
    object Savings: Screen(route = "profile_screen")

}

package com.gody.funds

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
            composable(
                Screen.Home.route

            ){
                HomeScreen(navController = navController)
            }
        composable(
            Screen.Profile.route

        ){
            ProfileScreen(
                navController = navController
            )
        }
        composable(
            Screen.Savings.route

        ){
            SavingsScreen(
                navController = navController
            )
        }
    }
}
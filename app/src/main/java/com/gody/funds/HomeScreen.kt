package com.gody.funds

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text


import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Text(
            modifier = Modifier.clickable{
                navController.navigate(route = Screen.Profile.route)
            },
            text = "Home",
            color = Color.Blue,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp

        )
    }
}




@Preview(showBackground = true)
@Composable
fun HomeScreenPrev() {
    HomeScreen(
        navController = rememberNavController()
    )
}
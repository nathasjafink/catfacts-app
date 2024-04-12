package com.example.data_web.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.data_web.ui.CatFact.CatFactScreen
import com.example.data_web.ui.Welcome.Welcome

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome"){
            Welcome(navController = navController)
        }
        composable("catFact"){
            CatFactScreen()
        }
    }
}
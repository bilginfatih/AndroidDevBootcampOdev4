package com.fatihbilgin.odev4navigate.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigate() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "homePage") {
        composable("homePage") {
            HomePage(navController)
        }
        composable("APage") {
            APage(navController)
        }
        composable("XPage") {
            XPage(navController)
        }
        composable("BPage") {
            BPage(navController)
        }
        composable("YPage") {
            YPage(navController)
        }
    }
}
package com.fatihbilgin.odev4navigate.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fatihbilgin.odev4navigate.ui.theme.HomePageColor
import com.fatihbilgin.odev4navigate.ui.theme.appBarTitleWhite

@Composable
fun HomePage(navController: NavController) {
    BasePage(
        title = "Home Page",
        backgroundColor = HomePageColor,
        titleColor = appBarTitleWhite,
        buttons = listOf(
            "Git Sayfa -> A" to { navController.navigate("APage") },
            "Git Sayfa -> X" to { navController.navigate("XPage") }
        )
    )
}

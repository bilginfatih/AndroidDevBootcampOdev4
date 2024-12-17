package com.fatihbilgin.odev4navigate.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fatihbilgin.odev4navigate.ui.theme.XPageColor
import com.fatihbilgin.odev4navigate.ui.theme.appBarTitleWhite

@Composable
fun XPage(navController: NavController) {
    BasePage(
        title = "X Page",
        backgroundColor = XPageColor,
        titleColor = appBarTitleWhite,
        buttons = listOf(
            "Git Sayfa -> Y" to { navController.navigate("YPage") },
        )
    )
}

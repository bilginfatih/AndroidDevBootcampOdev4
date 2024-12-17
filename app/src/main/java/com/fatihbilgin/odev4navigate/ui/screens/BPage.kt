package com.fatihbilgin.odev4navigate.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fatihbilgin.odev4navigate.ui.theme.BPageColor
import com.fatihbilgin.odev4navigate.ui.theme.appBarTitleWhite

@Composable
fun BPage(navController: NavController) {
    BasePage(
        title = "B Page",
        backgroundColor = BPageColor,
        titleColor = appBarTitleWhite,
        buttons = listOf(
            "Git Sayfa -> Y" to { navController.navigate("YPage") },
        )
    )
}
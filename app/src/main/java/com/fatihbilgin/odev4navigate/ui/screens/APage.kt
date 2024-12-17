package com.fatihbilgin.odev4navigate.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fatihbilgin.odev4navigate.ui.theme.APageColor
import com.fatihbilgin.odev4navigate.ui.theme.appBarTitleDark

@Composable
fun APage(navController: NavController) {
    BasePage(
        title = "A Page",
        backgroundColor = APageColor,
        titleColor = appBarTitleDark,
        buttons = listOf(
            "Git Sayfa -> B" to { navController.navigate("BPage") },
        )
    )
}

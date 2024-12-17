package com.fatihbilgin.odev4navigate.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fatihbilgin.odev4navigate.ui.theme.YPageColor
import com.fatihbilgin.odev4navigate.ui.theme.appBarTitleDark

@Composable
fun YPage(navController: NavController) {
    BasePage(
        title = "Y Page",
        backgroundColor = YPageColor,
        titleColor = appBarTitleDark,
        backHandlerAction = {
            navController.popBackStack(route = "homePage", inclusive = false)
        }
    )
}
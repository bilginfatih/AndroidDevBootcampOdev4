package com.fatihbilgin.odev4navigate.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

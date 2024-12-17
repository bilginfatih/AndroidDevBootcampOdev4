package com.fatihbilgin.odev4navigate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.fatihbilgin.odev4navigate.ui.screens.HomePage
import com.fatihbilgin.odev4navigate.ui.screens.Navigate
import com.fatihbilgin.odev4navigate.ui.theme.Odev4NavigateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Odev4NavigateTheme {
                Navigate()
            }
        }
    }
}



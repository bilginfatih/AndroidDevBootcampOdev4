package com.fatihbilgin.odev4navigate.ui.screens

import androidx.activity.compose.BackHandler
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
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasePage(
    title: String, // Sayfa başlığı
    backgroundColor: Color, // AppBar rengi
    titleColor: Color, // AppBar başlık rengi
    buttons: List<Pair<String, () -> Unit>>? = null, // Buton metinleri ve aksiyonları
    backHandlerAction: (() -> Unit)? = null // Geri tuşu tıklama
) {
    // Geri tuşu fonksiyonu
    backHandlerAction?.let {
        BackHandler(enabled = true) {
            it() // Geri tuşuna basıldığında, burada belirtilen aksiyon çalıştırılır.
        }
    }
    // Scaffold, genel sayfa düzenini sağlar.
    Scaffold(
        topBar = {
            // AppBar bileşenini oluşturur ve başlık ile arka plan rengini ayarlar.
            CenterAlignedTopAppBar(
                title = { Text(text = title) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = backgroundColor,
                    titleContentColor = titleColor
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues), // Scaffold tarafından sağlanan paddingi uygular.
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // butonlar oluşturulur
            buttons?.forEach { (text, action) ->
                Button(onClick = { action() }) {
                    Text(text = text)
                }
            }
        }
    }
}

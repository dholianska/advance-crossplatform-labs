package com.holianska.labnetwork

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.holianska.labnetwork.ui.theme.AppTheme
import com.holianska.labnetwork.di.initKoin
import com.holianska.labnetwork.presentation.App

fun main() = application {
    initKoin { printLogger() }
    Window(
        onCloseRequest = ::exitApplication,
        title = "AdvancedKotlinMultiplatform",
    ) {
        AppTheme {
            App()
        }
    }
}
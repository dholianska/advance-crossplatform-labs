package com.holianska.labnetwork

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.holianska.labnetwork.di.initKoin
import com.holianska.labnetwork.presentation.App
import com.holianska.labnetwork.ui.theme.AppTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin { printLogger() }
    ComposeViewport {
        AppTheme {
            App()
        }
    }
}
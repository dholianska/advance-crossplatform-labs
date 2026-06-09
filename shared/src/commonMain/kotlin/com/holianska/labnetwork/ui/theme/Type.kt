package com.holianska.labnetwork.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

private val baseline = Typography()

fun getTypography(font1: Font, font2: Font? = null): Typography {
    val bodyFontFamily = FontFamily(font1)
    val displayFontFamily = FontFamily(font2 ?: font1)
    return _root_ide_package_.androidx.compose.material3.Typography(
        displayLarge = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.displayLarge.copy(
            fontFamily = displayFontFamily
        ),
        displayMedium = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.displayMedium.copy(
            fontFamily = displayFontFamily
        ),
        displaySmall = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.displaySmall.copy(
            fontFamily = displayFontFamily
        ),
        headlineLarge = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.headlineLarge.copy(
            fontFamily = displayFontFamily
        ),
        headlineMedium = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.headlineMedium.copy(
            fontFamily = displayFontFamily
        ),
        headlineSmall = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.headlineSmall.copy(
            fontFamily = displayFontFamily
        ),
        titleLarge = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.titleLarge.copy(
            fontFamily = displayFontFamily
        ),
        titleMedium = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.titleMedium.copy(
            fontFamily = displayFontFamily
        ),
        titleSmall = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.titleSmall.copy(
            fontFamily = displayFontFamily
        ),
        bodyLarge = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.bodyMedium.copy(
            fontFamily = bodyFontFamily
        ),
        bodySmall = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.bodySmall.copy(fontFamily = bodyFontFamily),
        labelLarge = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.labelLarge.copy(
            fontFamily = bodyFontFamily
        ),
        labelMedium = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.labelMedium.copy(
            fontFamily = bodyFontFamily
        ),
        labelSmall = _root_ide_package_.com.holianska.labnetwork.ui.theme.baseline.labelSmall.copy(
            fontFamily = bodyFontFamily
        ),
    )
}
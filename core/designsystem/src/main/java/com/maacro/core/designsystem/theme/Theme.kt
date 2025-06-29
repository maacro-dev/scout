package com.maacro.core.designsystem.theme

import android.os.Build
import android.util.Log
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
	primary = Neutral200,
	onPrimary = Neutral900,
	secondary = Neutral300,
	onSecondary = Neutral900,
	background = Neutral950,
	onBackground = Neutral100,
	surface = Neutral900,
	onSurface = Neutral100
)

private val LightColorScheme = lightColorScheme(
	primary = Neutral800,
	onPrimary = Neutral50,
	secondary = Neutral700,
	onSecondary = Neutral50,
	background = Neutral50,
	onBackground = Neutral900,
	surface = Neutral100,
	onSurface = Neutral900,
	onSurfaceVariant = Neutral500, // muted
)

@Composable
fun ScoutTheme(
	darkTheme: Boolean = isSystemInDarkTheme(),
	children: @Composable () -> Unit
) {

	val colorScheme = when {
		darkTheme -> DarkColorScheme
		else -> LightColorScheme
	}

	MaterialTheme(
		colorScheme = colorScheme,
		typography = ScoutTypography,
		content = children
	)
}
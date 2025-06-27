package com.maacro.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val SansSerif = FontFamily.Default

val ScoutTypography = Typography(
	displayLarge = TextStyle( // text-5xl
		fontFamily = SansSerif,
		fontWeight = FontWeight.Bold,
		fontSize = 48.sp,
		lineHeight = 56.sp,
		letterSpacing = (-0.5).sp
	),
	displayMedium = TextStyle( // text-4xl
		fontFamily = SansSerif,
		fontWeight = FontWeight.Bold,
		fontSize = 36.sp,
		lineHeight = 44.sp,
		letterSpacing = (-0.25).sp
	),
	headlineLarge = TextStyle( // text-3xl
		fontFamily = SansSerif,
		fontWeight = FontWeight.SemiBold,
		fontSize = 30.sp,
		lineHeight = 36.sp
	),
	headlineMedium = TextStyle( // text-2xl
		fontFamily = SansSerif,
		fontWeight = FontWeight.SemiBold,
		fontSize = 24.sp,
		lineHeight = 32.sp
	),
	titleLarge = TextStyle( // text-xl
		fontFamily = SansSerif,
		fontWeight = FontWeight.Medium,
		fontSize = 20.sp,
		lineHeight = 28.sp
	),
	titleMedium = TextStyle( // text-lg
		fontFamily = SansSerif,
		fontWeight = FontWeight.Medium,
		fontSize = 18.sp,
		lineHeight = 28.sp
	),
	titleSmall = TextStyle( // text-md
		fontFamily = SansSerif,
		fontWeight = FontWeight.Medium,
		fontSize = 16.sp,
		lineHeight = 28.sp
	),
	bodyLarge = TextStyle( // text-base
		fontFamily = SansSerif,
		fontWeight = FontWeight.Normal,
		fontSize = 16.sp,
		lineHeight = 24.sp,
		letterSpacing = 0.5.sp
	),
	bodyMedium = TextStyle( // text-sm
		fontFamily = SansSerif,
		fontWeight = FontWeight.Normal,
		fontSize = 14.sp,
		lineHeight = 20.sp,
		letterSpacing = 0.25.sp
	),
	labelLarge = TextStyle( // text-sm/medium
		fontFamily = SansSerif,
		fontWeight = FontWeight.Medium,
		fontSize = 14.sp,
		lineHeight = 20.sp,
		letterSpacing = 0.1.sp
	),
	labelSmall = TextStyle( // text-xs
		fontFamily = SansSerif,
		fontWeight = FontWeight.Medium,
		fontSize = 12.sp,
		lineHeight = 16.sp,
		letterSpacing = 0.5.sp
	)
)

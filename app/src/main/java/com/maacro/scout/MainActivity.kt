package com.maacro.scout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.maacro.core.designsystem.theme.ScoutTheme
import com.maacro.core.designsystem.theme.ScoutTypography

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			ScoutTheme(dynamicColor = false) {
				Surface(
					modifier = Modifier.fillMaxSize(),
				) {
					Column(
						modifier = Modifier.fillMaxSize(),
						verticalArrangement = Arrangement.Center,
						horizontalAlignment = Alignment.CenterHorizontally
					) {
						Column(
							horizontalAlignment = Alignment.Start
						) {
							Text(
								"Humay",
								style = ScoutTypography.displayLarge,
							)
						}
					}
				}
			}
		}
	}
}

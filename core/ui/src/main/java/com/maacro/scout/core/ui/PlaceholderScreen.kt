package com.maacro.scout.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.maacro.core.designsystem.theme.ScoutTypography

/**
 * A simple full-screen placeholder UI for use in unfinished or empty screens.
 *
 * @param modifier Optional [Modifier] for applying layout changes to the [Surface].
 * @param label The text to display in the center of the screen.
 */
@Composable
fun PlaceholderScreen(
    modifier: Modifier = Modifier,
    label: String = "This is a placeholder screen"
) {
    Surface(modifier = modifier.fillMaxSize()) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = label,
                style = ScoutTypography.headlineMedium
            )
        }
    }
}

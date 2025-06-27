package com.maacro.scout.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.maacro.scout.navigation.ScoutNavHost

@Composable
fun ScoutApp(
    modifier: Modifier = Modifier,
    appState: ScoutAppState
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        ScoutNavHost(
            appState = appState,
        )
    }
}
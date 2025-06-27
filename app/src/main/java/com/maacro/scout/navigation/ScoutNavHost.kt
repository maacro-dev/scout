package com.maacro.scout.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.maacro.scout.feature.auth.navigation.LoginRoute
import com.maacro.scout.feature.auth.navigation.loginScreen
import com.maacro.scout.ui.ScoutAppState

@Composable
fun ScoutNavHost(
    appState: ScoutAppState,
    modifier: Modifier = Modifier,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = LoginRoute,
        modifier = modifier,
    ) {
        loginScreen()
    }
}

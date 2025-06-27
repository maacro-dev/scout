package com.maacro.scout.feature.auth.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.maacro.scout.feature.auth.LoginScreen
import kotlinx.serialization.Serializable

@Serializable data object LoginRoute

fun NavController.navigateToLogin(navOptions: NavOptions) =
    navigate(route = LoginRoute, navOptions)

fun NavGraphBuilder.loginScreen() {
    composable<LoginRoute> {
        LoginScreen()
    }
}
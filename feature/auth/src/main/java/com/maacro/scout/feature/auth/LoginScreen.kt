package com.maacro.scout.feature.auth

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.maacro.scout.core.ui.PlaceholderScreen

@Composable
internal fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = hiltViewModel()
) {
    PlaceholderScreen(modifier)
}
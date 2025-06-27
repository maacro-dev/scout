package com.maacro.scout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.maacro.core.designsystem.theme.ScoutTheme
import com.maacro.scout.ui.ScoutApp
import com.maacro.scout.ui.rememberScoutAppState
import com.maacro.scout.util.isNightMode
import com.maacro.scout.util.systemNightModeFlow
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

	private val viewModel: MainActivityViewModel by viewModels()
	override fun onCreate(savedInstanceState: Bundle?) {
		val splashScreen = installSplashScreen()
		super.onCreate(savedInstanceState)

		var darkMode by mutableStateOf(resources.configuration.isNightMode)

		lifecycleScope.launch {
			repeatOnLifecycle(Lifecycle.State.STARTED) {
				combine(
					systemNightModeFlow(),     // Flow<Boolean>
					viewModel.uiState          // Flow<UiState>
				) { systemDark, uiState ->
					// compute whether we should use dark theme
					uiState.shouldUseDarkTheme(systemDark)
				}
					.distinctUntilChanged()
					.collect { newDarkMode ->
						darkMode = newDarkMode
						enableEdgeToEdge(
							statusBarStyle = SystemBarStyle.auto(
								lightScrim = android.graphics.Color.TRANSPARENT,
								darkScrim  = android.graphics.Color.TRANSPARENT
							) { newDarkMode },
							navigationBarStyle = SystemBarStyle.auto(
								lightScrim = lightScrim,
								darkScrim  = darkScrim
							) { newDarkMode }
						)
					}
			}
		}

        // Keep the splash screen on-screen until the UI state is loaded. This condition is
        // evaluated each time the app needs to be redrawn so it should be fast to avoid blocking
        // the UI.

        splashScreen.setKeepOnScreenCondition { viewModel.uiState.value.shouldKeepSplashScreen() }

		setContent {
			val appState = rememberScoutAppState()
			ScoutTheme(dynamicColor = false) {
				ScoutApp(appState = appState)
			}
		}
	}
}

private val lightScrim = android.graphics.Color.argb(0xe6, 0xFF, 0xFF, 0xFF)

private val darkScrim = android.graphics.Color.argb(0x80, 0x1b, 0x1b, 0x1b)


package com.maacro.scout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maacro.scout.MainActivityUiState.Loading
import com.maacro.scout.MainActivityUiState.Success
import com.maacro.scout.core.data.repository.UserDataRepository
import com.maacro.scout.core.model.ThemeConfig
import com.maacro.scout.core.model.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    userDataRepository: UserDataRepository
): ViewModel(){
    val uiState: StateFlow<MainActivityUiState> = userDataRepository.userData.map {
        Success(it)
    }.stateIn(
        scope = viewModelScope,
        initialValue = Loading,
        started = SharingStarted.WhileSubscribed(5_000),
    )
}

sealed interface MainActivityUiState {
    data object Loading : MainActivityUiState

    data class Success(val userData: UserData) : MainActivityUiState {

        override fun shouldUseDarkTheme(isSystemDarkTheme: Boolean) =
            when (userData.themeConfig) {
                ThemeConfig.FOLLOW_SYSTEM -> isSystemDarkTheme
                ThemeConfig.LIGHT -> false
                ThemeConfig.DARK -> true
            }
    }

    /**
     * Returns `true` if the state wasn't loaded yet and it should keep showing the splash screen.
     */
    fun shouldKeepSplashScreen() = this is Loading

    /**
     * Returns `true` if dark theme should be used.
     */
    fun shouldUseDarkTheme(isSystemDarkTheme: Boolean) = isSystemDarkTheme
}

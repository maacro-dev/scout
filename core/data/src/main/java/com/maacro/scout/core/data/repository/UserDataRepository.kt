package com.maacro.scout.core.data.repository

import com.maacro.scout.core.model.ThemeConfig
import com.maacro.scout.core.model.UserData
import kotlinx.coroutines.flow.Flow

interface UserDataRepository {

    /**
     * Stream of [UserData]
     */
    val userData: Flow<UserData>

    /**
     * Sets the desired dark theme config.
     */
    suspend fun setThemeConfig(themeConfig: ThemeConfig)


    /**
     * Sets whether the user has completed the onboarding process.
     */
    suspend fun setShouldHideOnboarding(shouldHideOnboarding: Boolean)
}

package com.maacro.scout.core.data.repository

import com.maacro.scout.core.model.ThemeConfig
import com.maacro.scout.core.model.UserData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class OfflineFirstUserDataRepository @Inject constructor(): UserDataRepository {

    /**
     * Returns a [Flow] of a default [UserData] for now.
     *
     * This will be changed in the future.
     */
    override val userData: Flow<UserData> = flowOf(
        UserData(
            themeConfig = ThemeConfig.FOLLOW_SYSTEM,
            shouldHideOnboarding = false
        )
    )

    override suspend fun setThemeConfig(themeConfig: ThemeConfig) {
        // TODO
    }

    override suspend fun setShouldHideOnboarding(shouldHideOnboarding: Boolean) {
        // TODO
    }

}
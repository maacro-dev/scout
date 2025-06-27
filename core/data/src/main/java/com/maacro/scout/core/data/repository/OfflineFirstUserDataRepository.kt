package com.maacro.scout.core.data.repository

import com.maacro.scout.core.model.ThemeConfig
import com.maacro.scout.core.model.UserData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import javax.inject.Inject

class OfflineFirstUserDataRepository @Inject constructor(): UserDataRepository {

    override val userData: Flow<UserData> = emptyFlow()

    override suspend fun setThemeConfig(themeConfig: ThemeConfig) {
        // TODO
    }

    override suspend fun setShouldHideOnboarding(shouldHideOnboarding: Boolean) {
        // TODO
    }

}
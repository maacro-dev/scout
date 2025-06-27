package com.maacro.scout.navigation

import com.maacro.scout.feature.auth.navigation.LoginRoute
import kotlin.reflect.KClass

enum class TopLevelDestination(
    val route: KClass<*>,
    val baseRoute: KClass<*> = route
) {
    LOGIN(
        route = LoginRoute::class
    )
}
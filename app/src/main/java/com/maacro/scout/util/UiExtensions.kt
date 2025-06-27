package com.maacro.scout.util

import android.content.res.Configuration
import androidx.activity.ComponentActivity
import androidx.core.util.Consumer
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.distinctUntilChanged

/**
 * True if this Configuration is currently in night (dark) mode.
 */
val Configuration.isNightMode: Boolean
    get() = (uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES

/**
 * Emits the system night-mode state as a [Flow], starting with the current value
 * and then updating whenever the configuration changes.
 */
fun ComponentActivity.systemNightModeFlow(): Flow<Boolean> = callbackFlow {

    // Immediately send the current state
    trySend(resources.configuration.isNightMode)

    // Listener for future changes
    val listener = Consumer<Configuration> { newConfig ->
        trySend(newConfig.isNightMode)
    }

    addOnConfigurationChangedListener(listener)
    awaitClose { removeOnConfigurationChangedListener(listener) }
}
    .distinctUntilChanged()  // skip duplicates
    .conflate()              // keep only the latest when collector is slow

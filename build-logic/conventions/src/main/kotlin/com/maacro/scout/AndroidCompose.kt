package com.maacro.scout

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        buildFeatures {
            compose = true
        }
        dependencies {
            val bom = libs.findLibrary("androidx-compose-bom").get()
            val composeCompiler = libs.findLibrary("androidx-compose-compiler").get()

            add("implementation", platform(bom))
            add("implementation", composeCompiler)
        }
        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("compose-compiler").get().toString()
        }
    }
}

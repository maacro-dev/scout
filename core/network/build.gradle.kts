plugins {
    alias(libs.plugins.scout.android.library)
    alias(libs.plugins.scout.hilt)
}

android {
    namespace = "com.maacro.scout.core.network"
    buildFeatures {
        buildConfig = true
    }
}

dependencies {

    api(projects.core.common)
    api(projects.core.model)

    // http modules ->
    implementation(libs.kotlinx.serialization.json)
}
plugins {
    alias(libs.plugins.scout.android.library)
    alias(libs.plugins.scout.android.library.compose)
}

android {
    namespace = "com.maacro.scout.core.designsystem"
}

dependencies {
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.material3.navigationSuite)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui)
    api(libs.androidx.compose.ui.util)
    api(libs.androidx.compose.ui.graphics)
    api(libs.androidx.compose.material.iconsExtended)
}
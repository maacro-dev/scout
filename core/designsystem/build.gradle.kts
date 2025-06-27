plugins {
    alias(libs.plugins.scout.android.library)
    alias(libs.plugins.scout.android.library.compose)
}

android {
    namespace = "com.maacro.scout.core.designsystem"
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
}
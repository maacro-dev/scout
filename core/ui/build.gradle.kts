plugins {
    alias(libs.plugins.scout.android.library)
    alias(libs.plugins.scout.android.library.compose)
}

android {
    namespace = "com.maacro.scout.core.ui"
}

dependencies {
    api(projects.core.designsystem)
}
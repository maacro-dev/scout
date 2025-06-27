plugins {
    alias(libs.plugins.scout.android.library)
    alias(libs.plugins.scout.android.room)
    alias(libs.plugins.scout.hilt)
}

android {
    namespace = "com.maacro.scout.database"
}

dependencies {
     api(projects.core.model)
}
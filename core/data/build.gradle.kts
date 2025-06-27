plugins {
    alias(libs.plugins.scout.android.library)
    alias(libs.plugins.scout.hilt)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.maacro.scout.data"

}

dependencies {
    api(projects.core.common)
    api(projects.core.database)
    api(projects.core.datastore)
    // network
}
plugins {
    alias(libs.plugins.scout.android.library)
    alias(libs.plugins.scout.hilt)
}

android {
    namespace = "com.maacro.scout.datastore"

    defaultConfig {
        consumerProguardFiles("consumer-proguard-rules.pro")
    }
}

dependencies {
    // datastore-proto
    // model
    api(libs.androidx.dataStore)

    implementation(projects.core.common)
}
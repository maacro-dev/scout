plugins {
    alias(libs.plugins.scout.android.feature)
    alias(libs.plugins.scout.android.library.compose)
}

android {
    namespace = "com.maacro.scout.feature.auth"
}

dependencies {

    // to add: domain
    implementation(projects.core.data)


}
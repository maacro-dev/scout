import com.maacro.scout.ScoutBuildType

plugins {
	alias(libs.plugins.scout.android.application)
	alias(libs.plugins.scout.android.application.compose)
	alias(libs.plugins.scout.hilt)
	alias(libs.plugins.kotlin.serialization)
}

android {
	namespace = "com.maacro.scout"

	defaultConfig {
		applicationId = "com.maacro.scout"
		versionCode = 1
		versionName = "0.1.0"
	}


	buildTypes {
		debug {
			applicationIdSuffix = ScoutBuildType.DEBUG.applicationIdSuffix
		}
		release {
			isMinifyEnabled = true
			applicationIdSuffix = ScoutBuildType.RELEASE.applicationIdSuffix
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
			signingConfig = signingConfigs.named("debug").get()
		}
	}
}

dependencies {

	implementation(projects.feature.auth)

	implementation(projects.core.common)
	implementation(projects.core.ui)
	implementation(projects.core.designsystem)
	implementation(projects.core.data)
	implementation(projects.core.model)
	implementation(projects.core.designsystem)

	implementation(projects.sync)

	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.core.splashscreen)
	implementation(libs.androidx.activity.compose)


	implementation(libs.androidx.dataStore)
	implementation(libs.androidx.dataStore.core)
	implementation(libs.androidx.hilt.navigation.compose)
	implementation(libs.androidx.lifecycle.runtime.compose)
	implementation(libs.androidx.lifecycle.viewmodel.compose)
	implementation(libs.androidx.metrics)
	implementation(libs.androidx.navigation.compose)
	implementation(libs.androidx.work.runtime)

	implementation(libs.hilt.android)
	implementation(libs.hilt.ext.work)

	implementation(libs.kotlinx.coroutines.android)
	implementation(libs.kotlinx.coroutines.core)
	implementation(libs.kotlinx.serialization.json)

	implementation(libs.room.ktx)
	implementation(libs.room.runtime)

	debugImplementation(libs.androidx.compose.ui.tooling)

	ksp(libs.hilt.compiler)
	ksp(libs.hilt.ext.compiler)
	ksp(libs.room.compiler)
}
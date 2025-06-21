plugins {
	alias(libs.plugins.android.application)
	alias(libs.plugins.kotlin.android)
	alias(libs.plugins.kotlin.compose)
	alias(libs.plugins.hilt)
	alias(libs.plugins.kotlin.serialization)
	alias(libs.plugins.ksp)
}

android {
	namespace = "com.maacro.scout"
	compileSdk = 35

	defaultConfig {
		applicationId = "com.maacro.scout"
		minSdk = 26
		targetSdk = 36
		versionCode = 1
		versionName = "0.1.0"

	}

	buildTypes {
		debug {
			isMinifyEnabled = false
		}
		release {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_17
		targetCompatibility = JavaVersion.VERSION_17
	}
	kotlinOptions {
		jvmTarget = "17"
	}
	buildFeatures {
		compose = true
		buildConfig = true
	}
}

dependencies {

	implementation(platform(libs.androidx.compose.bom))

	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.activity.compose)
	implementation(libs.androidx.compose.ui)
	implementation(libs.androidx.compose.ui.graphics)
	implementation(libs.androidx.compose.material.iconsExtended)
	implementation(libs.androidx.compose.material3)
	implementation(libs.androidx.compose.material3.navigationSuite)
	implementation(libs.androidx.compose.runtime)
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
plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
    id("kotlin-android")
}

android {
    compileSdkVersion(AppConfiguration.COMPILE_SDK)

    defaultConfig {
        minSdkVersion(AppConfiguration.MIN_SDK_VERSION)
        targetSdkVersion(AppConfiguration.TARGET_SDK)

        applicationId = AppConfiguration.APPLICATION_ID
        versionCode = AppConfiguration.VERSION_CODE
        versionName = AppConfiguration.VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementAndroidDefaultLibraries()
    implementTestLibraries()
    implementAndroidTestLibraries()
}

package dependencies

object Dependencies {

    private const val path = "../commonFiles/gradleScript/"

    const val common = "${path}common.gradle"
    const val dependency = "./gradleScript/dependencies.gradle"

    object Plugins {
        const val ANDROID_APPLICATION = "com.android.application"
        const val KOTLIN_ANDROID = "kotlin-android"
        const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"
        const val KOTLIN_KAPT = "kotlin-kapt"
    }

    object Kotlin {
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Version.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
        const val material = "com.google.android.material:material:${Version.material}"
    }

    object General {
        const val koin = "org.koin:koin-core:${Version.koin}"
        const val koinAndroid = "org.koin:koin-android:${Version.koin}"
        const val koinAndroidViewModel = "org.koin:koin-android-viewmodel:${Version.koin}"
    }

    object VRPhone {
        const val vrPhoneModule = "com.charlesadam.vrphone:vrphone-modules:${Version.vrphoneModule}"
    }

    object Test {
        const val jUnit = "junit:junit:${Version.jUnit}"
        const val koinTest = "org.koin:koin-test:${Version.koin}"
    }

    object InstrumentedTests {
        const val jUnitInstrumented = "androidx.test.ext:junit:${Version.androidjUnit}"
        const val expresso = "androidx.test.espresso:espresso-core:${Version.expressoCore}"
    }
}
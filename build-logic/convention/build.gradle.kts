import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "ezbus.android.application"
            implementationClass = "com.ezbus.convention.AndroidApplicationConventionPlugin"
        }

        register("androidHilt") {
            id = "ezbus.android.hilt"
            implementationClass = "com.ezbus.convention.AndroidHiltConventionPlugin"
        }

        register("androidLint") {
            id = "ezbus.android.lint"
            implementationClass = "com.ezbus.convention.AndroidLintConventionPlugin"
        }

        register("androidCore") {
            id = "ezbus.android.core"
            implementationClass = "com.ezbus.convention.AndroidCoreConventionPlugin"
        }

        register("androidCompose") {
            id = "ezbus.android.compose"
            implementationClass = "com.ezbus.convention.AndroidComposeConventionPlugin"
        }

        register("jvmLibrary") {
            id = "ezbus.jvm.library"
            implementationClass = "com.ezbus.convention.JvmLibraryConventionPlugin"
        }

        register("androidFeature") {
            id = "ezbus.android.feature"
            implementationClass = "com.ezbus.convention.AndroidFeatureConventionPlugin"
        }
    }
}
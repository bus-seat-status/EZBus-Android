@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.ezbus.user"

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/DEPENDENCIES"
        }
    }
}

dependencies {
    implementation(libs.junit)
    implementation(libs.google.services)
    implementation(libs.play.services.auth)
    androidTestImplementation(libs.androidx.test.ext)
}
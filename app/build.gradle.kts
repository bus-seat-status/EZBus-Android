@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("ezbus.android.application")
    id("ezbus.android.hilt")
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
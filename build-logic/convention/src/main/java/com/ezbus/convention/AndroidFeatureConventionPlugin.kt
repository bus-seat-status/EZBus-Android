package com.ezbus.convention

import com.ezbus.convention.ezbus.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("ezbus.android.core")
                apply("ezbus.android.hilt")
                apply("ezbus.android.compose")
            }

            dependencies {
                // 모듈 추가하면 여기다가 추가하기

                add("implementation", libs.findLibrary("coil.kt").get())

                add("implementation", libs.findLibrary("androidx.lifecycle.runtimeCompose").get())
                add("implementation", libs.findLibrary("androidx.lifecycle.viewModelCompose").get())
            }
        }
    }
}
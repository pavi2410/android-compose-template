pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            version("compose", "1.1.1")
            library("compose-ui", "androidx.compose.ui", "ui").versionRef("compose")
            library("compose-material", "androidx.compose.material", "material").versionRef("compose")
            library("compose-tooling-debug", "androidx.compose.ui", "ui-tooling").versionRef("compose")
            library("compose-tooling-preview", "androidx.compose.ui", "ui-tooling-preview").versionRef("compose")
            library("compose-test-junit4", "androidx.compose.ui", "ui-test-junit4").versionRef("compose")

            library("androidx-core-ktx", "androidx.core:core-ktx:1.7.0")
            library("androidx-lifecycle-runtime-ktx", "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
            library("androidx-activity-compose", "androidx.activity:activity-compose:1.4.0")

            library("junit4", "junit:junit:4.13.2")
            library("androidx.junit", "androidx.test.ext:junit:1.1.3")
            library("androidx.espresso.core", "androidx.test.espresso:espresso-core:3.4.0")
        }
    }
}

rootProject.name = "android-compose-template"

include(":app")

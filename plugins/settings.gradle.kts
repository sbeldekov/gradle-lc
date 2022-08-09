@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}

apply(from = "../gradle/shared/settings.gradle.kts")

include("helloPlugin")

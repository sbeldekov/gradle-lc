buildCache {
    local {
        removeUnusedEntriesAfterDays = 1
        directory = "${settingsDir}/.gradle/build-cache"
    }
}

// https://docs.gradle.org/current/userguide/declaring_repositories.html#sub:centralized-repository-declaration
@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}

// enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

include("helloPlugin")

println()
println("Initialization Phase - evaluate settings.gradle.kts: ${rootProject.name}")

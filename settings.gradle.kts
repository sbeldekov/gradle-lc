pluginManagement {
    @Suppress("UnstableApiUsage")
    includeBuild("plugins")
}

rootProject.name = "gradle-lc"

apply(from = "gradle/shared/settings.gradle.kts")

include("subproject1")
include("subproject2")

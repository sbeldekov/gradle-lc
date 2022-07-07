buildCache {
    local {
        removeUnusedEntriesAfterDays = 1
        directory = "${settingsDir}/.gradle/build-cache"
    }
}

rootProject.name = "gradle-lc"

gradle.taskGraph.whenReady {
    println()
    println("Configuration Phase - settings.gradle.taskGraph.whenReady: ${rootProject.name}")
}

gradle.projectsEvaluated {
    println()
    println("Configuration Phase - settings.gradle.projectsEvaluated: ${rootProject.name}")
}

gradle.projectsLoaded {
    println("Initialization Phase - settings.gradle.projectsLoaded: ${rootProject.name}")
}

gradle.settingsEvaluated {
    println("Initialization Phase - settings.gradle.settingsEvaluated: ${rootProject.name}")
}

gradle.afterProject {
    println("Configuration Phase - settings.gradle.afterProject: $name")
}

gradle.beforeProject {
    println("Configuration Phase - settings.gradle.beforeProject: $name")
}

// enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

include("subproject")

println()
println("Initialization Phase - evaluate settings.gradle.kts: ${rootProject.name}")

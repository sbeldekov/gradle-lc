buildCache {
    local {
        removeUnusedEntriesAfterDays = 1
        directory = "${settingsDir}/.gradle/build-cache"
    }
}

gradle.taskGraph.whenReady {
    println()
    println("Configuration Phase - settings.gradle.taskGraph.whenReady: ${rootProject.name}")
}

gradle.projectsEvaluated {
    println()
    println("Configuration Phase - settings.gradle.projectsEvaluated: ${rootProject.name}")
}

gradle.projectsLoaded {
    println()
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

println()
println("Initialization Phase - evaluate settings.gradle.kts: ${rootProject.name}")

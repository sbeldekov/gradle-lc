buildCache {
    local {
        removeUnusedEntriesAfterDays = 1
        directory = "${settingsDir}/build-cache"
    }
}

rootProject.name = "gradle-lc"

gradle.taskGraph.whenReady {
    println()
    println("Configuration Phase - settings.gradle.taskGraph.whenReady")
}

gradle.projectsEvaluated {
    println()
    println("Configuration Phase - settings.gradle.projectsEvaluated")
}

gradle.projectsLoaded {
    println("Initialization Phase - settings.gradle.projectsLoaded")
    println()
}

gradle.settingsEvaluated {
    println("Initialization Phase - settings.gradle.settingsEvaluated")
}

gradle.afterProject {
    println("Configuration Phase - settings.gradle.afterProject: $name")
}

gradle.beforeProject {
    println("Configuration Phase - settings.gradle.beforeProject: $name")
}

include("subproject")

println()
println("Initialization Phase - evaluate settings.gradle.kts")

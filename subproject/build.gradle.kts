tasks.register("foo") {
    doLast {
        println("Execution Phase - task.doLast: ${project.name}:$name")
    }
    doFirst {
        println("Execution Phase - task.doFirst: ${project.name}:$name")
    }
    println()
    println("Configuration Phase - evaluate task: ${project.name}:$name")
}

tasks.named("foo").configure {
    println("Configuration Phase - configure task: ${project.name}:$name")
}

afterEvaluate {
    println("Configuration Phase - project.afterEvaluate: $name")
}

println("Configuration Phase - evaluate build.gradle.kts: $name")

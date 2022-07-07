import com.example.gradle.plugin.hello.HelloPluginExtension

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

allprojects {
    afterEvaluate {
        apply(plugin = "com.example.gradle.plugin.hello")
        let { project ->
            configure<HelloPluginExtension> {
                message.set(project.name)
            }
        }
    }
}

afterEvaluate {
    println("Configuration Phase - project.afterEvaluate: $name")
}

subprojects {
    afterEvaluate {
        println("Configuration Phase - rootProject.subprojects.afterEvaluate: $name")
    }
    beforeEvaluate {
        println("Configuration Phase - rootProject.subprojects.beforeEvaluate: $name")
    }
}

println("Configuration Phase - evaluate build.gradle.kts: $name")

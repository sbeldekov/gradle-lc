import com.example.gradle.plugin.hello.HelloPluginExtension
import com.example.gradle.plugin.hello.HelloTask

plugins {
    id("com.example.gradle.plugin.hello") apply false
}

subprojects {
    afterEvaluate {
        apply(plugin = "com.example.gradle.plugin.hello")

        val foo by tasks.registering(HelloTask::class) {
            println()
            println("Configuration Phase - register task: ${project.name}: $name")
        }

        foo.configure {
            println("Configuration Phase - configure task: ${project.name}: $name")
            projectName.set(project.name)
        }

        configure<HelloPluginExtension> {
            println("Configuration Phase - configure extension: ${name}: ${HelloPluginExtension::class.simpleName}")
            projectName.set(name)
        }
    }
}

println("Configuration Phase - evaluate build.gradle.kts: $name")

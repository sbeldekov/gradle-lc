package com.example.gradle.plugin.hello

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class HelloPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val pluginName = javaClass.simpleName
        val logger = target.logger

        val helloPluginExtension = target.extensions.create(
            "helloPluginOptions", HelloPluginExtension::class.java
        )

        logger.lifecycle(
            "Configuration Phase - apply plugin: {}: {}", target.name, pluginName
        )

        target.gradle.projectsEvaluated {
            logger.lifecycle(
                "Configuration Phase - gradle.projectsEvaluated added by {}: {}",
                helloPluginExtension.projectName.get(),
                pluginName
            )
        }
    }
}

abstract class HelloPluginExtension {
    abstract val projectName: Property<String>

    init {
        @Suppress("LeakingThis")
        projectName.convention("default value")
    }
}

abstract class HelloTask : DefaultTask() {
    @get:Input
    abstract val projectName: Property<String>

    init {
        @Suppress("LeakingThis")
        projectName.convention("default value")
    }

    @TaskAction
    fun taskAction() {
        println("Execution Phase - taskAction: ${projectName.get()}: $name")
    }
}

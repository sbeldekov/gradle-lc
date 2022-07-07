package com.example.gradle.plugin.hello

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property

class HelloPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val pluginName = javaClass.simpleName
        val logger = target.logger

        val helloPluginExtension = target.extensions.create(
            "helloPluginOptions", HelloPluginExtension::class.java
        )

        logger.lifecycle(
            "Configuration Phase - apply {}: {}", pluginName, target.name
        )

        target.gradle.projectsEvaluated {
            logger.lifecycle(
                "Configuration Phase - gradle.projectsEvaluated added by {}: {}",
                pluginName,
                helloPluginExtension.message.get()
            )
        }
    }
}

abstract class HelloPluginExtension {
    abstract val message: Property<String>

    init {
        @Suppress("LeakingThis")
        message.convention("default value")
    }
}

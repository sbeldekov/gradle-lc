plugins {
    `kotlin-dsl`
}

val javaVersion: String by project

subprojects {
    beforeEvaluate {
        apply(plugin = "org.gradle.kotlin.kotlin-dsl")

        configure<JavaPluginExtension> {
            toolchain {
                languageVersion.set(JavaLanguageVersion.of(javaVersion))
            }
        }

        tasks.compileKotlin.configure {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
            }
        }

        let { subproject ->
            gradle.projectsEvaluated {
                rootProject.dependencies { runtimeOnly(subproject) }
            }
        }
    }
}

tasks.configureEach {
    if (name != "clean") {
        enabled = false
    }
}

println("Configuration Phase - evaluate build.gradle.kts: $name")

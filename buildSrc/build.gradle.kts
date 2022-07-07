plugins {
    `kotlin-dsl`
}

val javaVersion: String by project

subprojects {
    beforeEvaluate {
        apply(plugin = "org.gradle.kotlin.kotlin-dsl")

        configure<KotlinDslPluginOptions> {
            jvmTarget.set(javaVersion)
        }

        configure<JavaPluginExtension> {
            targetCompatibility = JavaVersion.toVersion(javaVersion)
        }

        tasks.compileKotlin.configure {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
            }
        }

        let { subproject ->
            parent!!.dependencies { runtimeOnly(subproject) }
        }
    }
}

tasks.configureEach {
    if (name != "clean") {
        enabled = false
    }
}

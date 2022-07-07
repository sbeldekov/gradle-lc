gradlePlugin {
    plugins {
        register("helloPlugin") {
            id = "com.example.gradle.plugin.hello"
            implementationClass = "com.example.gradle.plugin.hello.HelloPlugin"
        }
    }
}

println("Configuration Phase - evaluate build.gradle.kts: $name")

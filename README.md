**`./gradlew foo`**

```
Initialization Phase - evaluate settings.gradle.kts: gradle-lc
Initialization Phase - settings.gradle.settingsEvaluated: gradle-lc

Initialization Phase - evaluate settings.gradle.kts: plugins
Initialization Phase - settings.gradle.settingsEvaluated: plugins

Initialization Phase - settings.gradle.projectsLoaded: gradle-lc

> Configure project :plugins
Configuration Phase - evaluate build.gradle.kts: plugins

> Configure project :plugins:helloPlugin
Configuration Phase - evaluate build.gradle.kts: helloPlugin

> Configure project :
Configuration Phase - settings.gradle.beforeProject: gradle-lc

Initialization Phase - settings.gradle.projectsLoaded: plugins

Configuration Phase - settings.gradle.projectsEvaluated: plugins

Configuration Phase - settings.gradle.taskGraph.whenReady: plugins

> Task :plugins:helloPlugin:pluginDescriptors
> Task :plugins:helloPlugin:processResources
> Task :plugins:helloPlugin:compileKotlin
> Task :plugins:helloPlugin:compileJava NO-SOURCE
> Task :plugins:helloPlugin:classes
> Task :plugins:helloPlugin:inspectClassesForKotlinIC
> Task :plugins:helloPlugin:jar

> Configure project :
Configuration Phase - evaluate build.gradle.kts: gradle-lc
Configuration Phase - settings.gradle.afterProject: gradle-lc

> Configure project :subproject1
Configuration Phase - settings.gradle.beforeProject: subproject1
Configuration Phase - evaluate build.gradle.kts: subproject1
Configuration Phase - settings.gradle.afterProject: subproject1
Configuration Phase - apply plugin: subproject1: HelloPlugin
Configuration Phase - configure extension: subproject1: HelloPluginExtension

> Configure project :subproject2
Configuration Phase - settings.gradle.beforeProject: subproject2
Configuration Phase - evaluate build.gradle.kts: subproject2
Configuration Phase - settings.gradle.afterProject: subproject2
Configuration Phase - apply plugin: subproject2: HelloPlugin
Configuration Phase - configure extension: subproject2: HelloPluginExtension

Configuration Phase - register task: subproject1: foo
Configuration Phase - configure task: subproject1: foo

Configuration Phase - register task: subproject2: foo
Configuration Phase - configure task: subproject2: foo

Configuration Phase - settings.gradle.projectsEvaluated: gradle-lc
Configuration Phase - gradle.projectsEvaluated added by subproject1: HelloPlugin
Configuration Phase - gradle.projectsEvaluated added by subproject2: HelloPlugin

Configuration Phase - settings.gradle.taskGraph.whenReady: gradle-lc

> Task :subproject2:foo
Execution Phase - taskAction: subproject2: foo

> Task :subproject1:foo
Execution Phase - taskAction: subproject1: foo
```

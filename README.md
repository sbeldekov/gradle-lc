**`./gradlew foo`**

```
Initialization Phase - evaluate settings.gradle.kts
Initialization Phase - settings.gradle.settingsEvaluated
Initialization Phase - settings.gradle.projectsLoaded

Initialization Phase - evaluate buildSrc settings.gradle.kts

> Configure project :buildSrc
Configuration Phase - evaluate build.gradle.kts: buildSrc

> Configure project :buildSrc:helloPlugin
Configuration Phase - evaluate build.gradle.kts: helloPlugin

> Configure project :
Configuration Phase - settings.gradle.beforeProject: gradle-lc
Configuration Phase - evaluate build.gradle.kts: gradle-lc
Configuration Phase - settings.gradle.afterProject: gradle-lc
Configuration Phase - apply plugin: gradle-lc: HelloPlugin
Configuration Phase - configure extension: gradle-lc: HelloPluginExtension

> Configure project :subproject
Configuration Phase - settings.gradle.beforeProject: subproject
Configuration Phase - evaluate build.gradle.kts: subproject
Configuration Phase - settings.gradle.afterProject: subproject
Configuration Phase - apply plugin: subproject: HelloPlugin
Configuration Phase - configure extension: subproject: HelloPluginExtension

Configuration Phase - register task: gradle-lc: foo
Configuration Phase - configure task: gradle-lc: foo

Configuration Phase - register task: subproject: foo
Configuration Phase - configure task: subproject: foo

Configuration Phase - settings.gradle.projectsEvaluated
Configuration Phase - gradle.projectsEvaluated added by gradle-lc: HelloPlugin
Configuration Phase - gradle.projectsEvaluated added by subproject: HelloPlugin

Configuration Phase - settings.gradle.taskGraph.whenReady

> Task :subproject:foo
Execution Phase - taskAction: subproject: foo

> Task :foo
Execution Phase - taskAction: gradle-lc: foo


BUILD SUCCESSFUL
2 actionable tasks: 2 executed
Execution finished 'foo'
```

**`./gradlew foo`**

```
Initialization Phase - evaluate settings.gradle.kts
Initialization Phase - settings.gradle.settingsEvaluated
Initialization Phase - settings.gradle.projectsLoaded

> Configure project :
Configuration Phase - settings.gradle.beforeProject: gradle-lc
Configuration Phase - evaluate build.gradle.kts: gradle-lc
Configuration Phase - settings.gradle.afterProject: gradle-lc
Configuration Phase - apply HelloPlugin: gradle-lc
Configuration Phase - project.afterEvaluate: gradle-lc

> Configure project :subproject
Configuration Phase - settings.gradle.beforeProject: subproject
Configuration Phase - rootProject.subprojects.beforeEvaluate: subproject
Configuration Phase - evaluate build.gradle.kts: subproject
Configuration Phase - settings.gradle.afterProject: subproject
Configuration Phase - apply HelloPlugin: subproject
Configuration Phase - rootProject.subprojects.afterEvaluate: subproject
Configuration Phase - project.afterEvaluate: subproject

Configuration Phase - settings.gradle.projectsEvaluated
Configuration Phase - gradle.projectsEvaluated added by HelloPlugin: gradle-lc
Configuration Phase - gradle.projectsEvaluated added by HelloPlugin: subproject

Configuration Phase - evaluate task: gradle-lc:foo
Configuration Phase - configure task: gradle-lc:foo

Configuration Phase - evaluate task: subproject:foo
Configuration Phase - configure task: subproject:foo

Configuration Phase - settings.gradle.taskGraph.whenReady

> Task :foo
Execution Phase - task.doFirst: gradle-lc:foo
Execution Phase - task.doLast: gradle-lc:foo

> Task :subproject:foo
Execution Phase - task.doFirst: subproject:foo
Execution Phase - task.doLast: subproject:foo

BUILD SUCCESSFUL
2 actionable tasks: 2 executed
Execution finished 'foo'
```

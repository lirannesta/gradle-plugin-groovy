package com.example.build

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class ExamplePlugin implements Plugin<Project> {
    static String VERSION = "1.0.0"

    @Override
    void apply(Project project) {
        // Plugin logic goes here
        project.logger.quiet("Custom Gradle Plugin Applied $VERSION!")

        project.tasks.register("hello") { Task task ->
            task.doLast(new Action<Task>() {
                @Override
                void execute(Task t) {
                    println "Hello! from the ExamplePlugin $VERSION"
                }
            })
        }
    }
}


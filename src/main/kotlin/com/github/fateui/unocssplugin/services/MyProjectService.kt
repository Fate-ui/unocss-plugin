package com.github.fateui.unocssplugin.services

import com.intellij.openapi.project.Project
import com.github.fateui.unocssplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

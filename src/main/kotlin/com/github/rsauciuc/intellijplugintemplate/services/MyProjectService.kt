package com.github.rsauciuc.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.rsauciuc.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

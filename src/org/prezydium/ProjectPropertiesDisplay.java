package org.prezydium;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.ui.Messages;

import java.util.ArrayList;
import java.util.List;

public class ProjectPropertiesDisplay {

    public void displayProperties(Project project) {
        final String projectPath = project.getBasePath();
        final String projectName = project.getName();
        final String sdkName = ProjectRootManager.getInstance(project).getProjectSdkName();
        List<String> listOfModuleNamesWithFilePaths = new ArrayList<>();
        final Module[] modules = ModuleManager.getInstance(project).getSortedModules();
        for (Module module : modules) {
            listOfModuleNamesWithFilePaths.add(module.getName()
                    .concat(" ")
                    .concat(module.getModuleFilePath()));
        }
        Messages.showMessageDialog(new StringBuilder()
                .append("Project name: ".concat(projectName + "\n"))
                .append("Project path: ".concat(projectPath + "\n"))
                .append("Used SDK: ".concat(sdkName + "\n"))
                .append("Contains modules: ")
                .append(listOfModuleNamesWithFilePaths)
                .toString(), "la", null);
    }
}

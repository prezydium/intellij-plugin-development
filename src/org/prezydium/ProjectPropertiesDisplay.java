package org.prezydium;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;

import java.io.IOException;

public class ProjectPropertiesDisplay {

    private  String projectPath;


    public void displayProperties(Project project){

        projectPath = project.getBasePath();

        System.out.println(project.getPresentableUrl());
        System.out.println(project.getProjectFilePath());
        System.out.println(project.getBasePath()); //
        System.out.println(project.getLocationHash());
        VirtualFile virtualFile = project.getProjectFile();
        System.out.println(virtualFile.getBOM());
        VirtualFile virtualFile1 = (project.getWorkspaceFile());
        System.out.println(virtualFile1.getExtension());
        System.out.println(virtualFile1.getTimeStamp());
        try {
            virtualFile1.rename(this, "test1");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

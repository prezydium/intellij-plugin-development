package org.prezydium.clickanalyzer;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.openapi.vfs.VirtualFile;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClickAnalyzer {

    public Map<String, String> analyseClickedItem(AnActionEvent e) {
        Map<String, String> propertiesFromClickedItem = new LinkedHashMap<>();
        VirtualFile virtualFile = e.getDataContext().getData(PlatformDataKeys.VIRTUAL_FILE);
        propertiesFromClickedItem.put("Clicked project", e.getProject().getName());
        String moduleName = ProjectRootManager.getInstance(e.getProject()).getFileIndex().getModuleForFile(virtualFile).getName();
        propertiesFromClickedItem.put("Clicked module", moduleName);
        return propertiesFromClickedItem;
    }
}

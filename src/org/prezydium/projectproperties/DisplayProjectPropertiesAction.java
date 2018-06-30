package org.prezydium.projectproperties;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class DisplayProjectPropertiesAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        new ProjectPropertiesDisplay().displayProperties(e.getProject());
    }
}

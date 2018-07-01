package org.prezydium.clickanalyzer;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.IconLoader;

public class ClickAnalyzerAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showMessageDialog(new ClickAnalyzer().analyseClickedItem(e).toString(), "Clicked item properties", null);
    }
}

package org.prezydium.toolwindow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PrezydiumToolWindow implements ToolWindowFactory {
    private JTextArea text1;
    private JPanel panel1;
    private JButton goodButton;
    private JButton notWellButton;

    public PrezydiumToolWindow() {
        goodButton.addActionListener(e -> Messages.showMessageDialog("Nice to hear that!", "Happy Window", new ImageIcon("/av.png")));
        notWellButton.addActionListener(e -> Messages.showMessageDialog("If i could i would hug you", "Sad Window", new ImageIcon("/av.png")));
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(panel1, "", false);
        toolWindow.getContentManager().addContent(content);
    }
}

package io.github.hocgin.Action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import io.github.hocgin.ui.SettingDialog;

/**
 * Created by moy on 16-2-2.
 */
public class MainAction extends AnAction {
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = (Project) anActionEvent.getData(PlatformDataKeys.PROJECT);
        openDialog(project);
    }

    private void openDialog(Project project) {
        SettingDialog settingDialog = new SettingDialog();
        settingDialog.setSize(600, 400);
        settingDialog.setLocationRelativeTo(null);
        settingDialog.setVisible(true);
    }
}

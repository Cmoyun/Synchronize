package io.github.hocgin;

import io.github.hocgin.ui.SettingDialog;

/**
 * Created by moy on 16-2-2.
 */
public class Main {
    public static void main(String[] args) {
        SettingDialog settingDialog = new SettingDialog();
        settingDialog.setSize(600, 400);
        settingDialog.setLocationRelativeTo(null);
        settingDialog.setVisible(true);
    }
}

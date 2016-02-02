package io.github.hocgin.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by moy on 16-2-3.
 */
public class SettingDialog extends AbsBaseJFrame {

    int left = 30;
    JLabel tokenLabel;
    JTextField tokenInput;
    JLabel gistLabel;
    JTextField gistInput;

    public SettingDialog() throws HeadlessException {
        super();
        init();
    }

    void createUI() {
        tokenLabel = new JLabel("GitHub Token:");
        tokenInput = new JTextField();
        gistLabel = new JLabel("Gist ID:");
        gistInput = new JTextField();
    }

    void initUI() {
        // x y w h
        System.out.println("  # --> " + left);
        int labelY = 15;
        int labelW = 100;
        int labelH = 23;
        int inputW = 400;
        int inputH = 23;
        // Token
        tokenLabel.setBounds(left, labelY, labelW, labelH);
        tokenInput.setBounds(left + labelW, labelY, inputW, inputH);
        tokenLabel.setFont(defaultFont);
        contentPane.add(tokenLabel);
        contentPane.add(tokenInput);
        // Gist
        gistLabel.setBounds(left, labelH + labelY, labelW, labelH);
        gistInput.setBounds(left + labelW, labelH + labelY, inputW, inputH);
        gistLabel.setFont(defaultFont);
        contentPane.add(gistLabel);
        contentPane.add(gistInput);
        // 下拉 - 操作系统
        // 文件选择 - 配置文件目录
    }

    void setListener() {

    }
}

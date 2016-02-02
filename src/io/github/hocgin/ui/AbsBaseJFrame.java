package io.github.hocgin.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by moy on 16-2-3.
 */
public abstract class AbsBaseJFrame extends JFrame{
    Container contentPane;
    Font defaultFont = new Font("宋体", Font.PLAIN, 16);
    public AbsBaseJFrame() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(getLayout());
    }

    final void init() {
        createUI();
        initUI();
        setListener();
    }

    abstract void createUI();
    abstract void initUI();
    abstract void setListener();

    public LayoutManager getLayout() {
        return null;
    }
    
}

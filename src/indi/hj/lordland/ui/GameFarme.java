package indi.hj.lordland.ui;

import indi.hj.lordland.object.Card;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @author Joe
 *
 */
public class GameFarme extends JFrame {
    private static final int Win_Width=1080;
    private static final int Win_Height=800;

    public GameFarme(){
        this.setSize(Win_Width,Win_Height);
        this.setTitle("斗地主");
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.WHITE);
        this.getContentPane().setVisible(true);//如果改为true那么就变成了黑色。
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width -Win_Width) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - Win_Height) / 2);
    }

}

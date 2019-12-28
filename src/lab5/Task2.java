package lab5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Task2 extends JFrame {
    Task2(String path) {
        super("Picture");
        setLayout(new FlowLayout());
        setSize(700,500);
        ImageIcon im = new ImageIcon(path);
        JLabel l1 = new JLabel(im);
        this.add(l1);
        setVisible(true);
    }

}

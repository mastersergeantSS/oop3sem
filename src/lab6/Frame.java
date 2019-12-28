package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame {
    Frame() {
        super("Borders");
        setSize(700, 500);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton b1 = new JButton("North");
        panel.add(b1, BorderLayout.NORTH);

        JButton b2 = new JButton("South");
        panel.add(b2, BorderLayout.SOUTH);

        JButton b3 = new JButton("East");
        panel.add(b3, BorderLayout.EAST);

        JButton b4 = new JButton("West");
        panel.add(b4, BorderLayout.WEST);

        JButton b5 = new JButton("Center");
        panel.add(b5, BorderLayout.CENTER);


        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Рафха");
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Абха");
            }
        });

        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Дахране");
            }
        });

        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Джидда");
            }
        });

        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в Афиф");
            }
        });

        getContentPane().add(panel);
    }
}

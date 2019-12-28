package pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Match extends JFrame
{
    JLabel jlb1 = new JLabel();
    JLabel jlb2 = new JLabel();
    JLabel jlb3 = new JLabel();

    JButton jb1 = new JButton("AC Milan");
    JButton jb2 = new JButton("Real Madrid");

    private int acm = 0;
    private int rm = 0;

    private void matchDesription(String ls)
    {
        jlb1.setText("Result: " + acm + " x " + rm);
        jlb2.setText("| Last scorer: " + ls);
        if (acm > rm)
            jlb3.setText("Winner: AC Milan");
        else if (rm > acm)
            jlb3.setText("Winner: Real Madrid");
        else
            jlb3.setText("Winner: Draw");

    }


    public Match()
    {
        super("AC Milan vs Real Madrid");

        setLayout(new FlowLayout());
        setSize(275, 125);

        add(jb1);
        add(jb2);
        add(jlb1);
        add(jlb2);
        add(jlb3);

        matchDesription("N/A");

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                acm++;
                matchDesription("AC Milan");
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                rm++;
                matchDesription("Real Madrid");
            }
        });


        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Match();
    }

}

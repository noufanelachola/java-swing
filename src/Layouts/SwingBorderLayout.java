package Layouts;

import javax.swing.*;
import java.awt.*;

public class SwingBorderLayout extends JFrame {
    public SwingBorderLayout(){
//        JFrame frame = new JFrame();
        this.setLayout(new BorderLayout(10,5));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Layouts");
        this.setVisible(true);
        this.setSize(500,500);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.orange);

        panel2.setLayout(new BorderLayout(5,5));

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.CENTER);
        this.add(panel3,BorderLayout.SOUTH);
        this.add(panel4,BorderLayout.EAST);
        this.add(panel5,BorderLayout.WEST);

        //------------------------SUB-PANELS-----------------------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.red);
        panel7.setBackground(Color.green);
        panel8.setBackground(Color.blue);
        panel9.setBackground(Color.yellow);
        panel10.setBackground(Color.orange);

        panel6.setPreferredSize(new Dimension(100,100));
        panel7.setPreferredSize(new Dimension(100,100));
        panel8.setPreferredSize(new Dimension(100,100));
        panel9.setPreferredSize(new Dimension(100,100));
        panel10.setPreferredSize(new Dimension(100,100));

        panel2.add(panel6,BorderLayout.NORTH);
        panel2.add(panel7,BorderLayout.CENTER);
        panel2.add(panel8,BorderLayout.SOUTH);
        panel2.add(panel9,BorderLayout.EAST);
        panel2.add(panel10,BorderLayout.WEST);

    }


}

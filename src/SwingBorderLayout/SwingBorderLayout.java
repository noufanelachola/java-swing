package SwingBorderLayout;

import javax.swing.*;
import java.awt.*;

public class SwingBorderLayout extends JFrame {
    public SwingBorderLayout(){
//        JFrame frame = new JFrame();
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SwingBorderLayout");
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

    }
}

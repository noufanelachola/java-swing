package FlowLayoutPackage;

import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutClass {
    public FlowLayoutClass() {
        JFrame frame = new JFrame("FlowLayoutPackage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,25,25));

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));
        frame.add(new JButton("Button 7"));
        frame.add(new JButton("Button 8"));
        frame.add(new JButton("Button 9"));
        frame.add(new JButton("Button 10"));

        frame.setVisible(true);
    }
}

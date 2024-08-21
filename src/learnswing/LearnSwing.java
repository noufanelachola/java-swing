/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learnswing;
//import myframe.MyFrame;
import javax.swing.*;
import java.awt.*;


public class LearnSwing {
    
    public static void main(String[] args) {
        // TODO code application logic here
        // MyFrame frame = new MyFrame();
        ImageIcon icon = new ImageIcon("D:\\Codes\\Java\\Swing\\LearnSwing\\src\\myframe\\logo2.png");
        JLabel label = new JLabel("Hi");
        label.setIcon(icon);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setBounds(0, 0, 300, 300);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        panel2.setBounds(300, 0, 300, 300);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.setBounds(0, 300, 600, 300);

        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(label);
        frame.add(panel2);
        frame.add(panel3);
        frame.setIconImage(icon.getImage());

    }
    
}

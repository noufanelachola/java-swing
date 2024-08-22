/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learnswing;
//import myframe.MyFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LearnSwing {

    JButton button;  // Declare the button as an instance variable so it can be accessed in both methods

    public static void main(String[] args) {
        LearnSwing learnSwing = new LearnSwing();  // Create an instance of the class to access non-static members
        learnSwing.createUI();  // Call a method to set up the UI
    }

    // Method to create the UI components
    public void createUI() {
        ImageIcon icon = new ImageIcon("D:\\Codes\\Java\\Swing\\LearnSwing\\src\\myframe\\logo2.png");
        JLabel label = new JLabel("Hi");
        button = new JButton("Click Me");

        button.setBounds(100, 100, 200, 200);
        button.addActionListener(e -> System.out.println("Clicked"));  // Register the button with this class's ActionListener
//        button.addActionListener(this);  // Register the button with this class's ActionListener
        button.setFocusable(Boolean.FALSE);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,20));
        button.setForeground(Color.yellow);
        button.setBackground(Color.lightGray);
        button.setIconTextGap(-10);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);

        label.setIcon(icon);

        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.add(button);
        frame.setIconImage(icon.getImage());
    }

    // This method will be called when the button is clicked
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == button) {
//            System.out.println("Clicked");
//        }
//    }
}

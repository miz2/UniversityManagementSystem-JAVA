package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 100);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Mizaan Aman Aniket Yash");
        name.setBounds(70, 230, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(name);
        
        JLabel rollno = new JLabel("Student ID: 1000016197, 1000016028,1000016136,1000016217");
        rollno.setBounds(70, 270, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(rollno);
        
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}

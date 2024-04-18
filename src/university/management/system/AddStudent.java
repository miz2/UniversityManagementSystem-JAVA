package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class AddStudent extends JFrame implements ActionListener {

    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii, tfaadhar;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox<String> cbcourse, cbbranch;
    JButton submit, cancel;

    AddStudent() {

        setTitle("New Student Details");
        setSize(600, 700); // Increased width to 600
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 2, 10, 10));
        setResizable(false);

        JLabel lblName = new JLabel("Name:");
        tfname = new JTextField();

        JLabel lblFatherName = new JLabel("Father's Name:");
        tffname = new JTextField();

        JLabel lblAddress = new JLabel("Address:");
        tfaddress = new JTextField();

        JLabel lblPhone = new JLabel("Phone:");
        tfphone = new JTextField();

        JLabel lblEmail = new JLabel("Email ID:");
        tfemail = new JTextField();

        JLabel lblDob = new JLabel("Date of Birth:");
        dcdob = new JDateChooser();

        JLabel lblXPercent = new JLabel("Class X (%):");
        tfx = new JTextField();

        JLabel lblXiiPercent = new JLabel("Class XII (%):");
        tfxii = new JTextField();

        JLabel lblAadhar = new JLabel("Aadhar Number:");
        tfaadhar = new JTextField();

        JLabel lblCourse = new JLabel("Course:");
        String[] courses = {"B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MCom", "MA", "BA"};
        cbcourse = new JComboBox<>(courses);

        JLabel lblBranch = new JLabel("Branch:");
        String[] branches = {"Computer Science", "Electronics", "Mechanical", "Civil", "IT"};
        cbbranch = new JComboBox<>(branches);

        submit = new JButton("Submit");
        submit.addActionListener(this);

        cancel = new JButton("Cancel");
        cancel.addActionListener(this);

        add(lblName);       add(tfname);
        add(lblFatherName); add(tffname);
        add(lblAddress);    add(tfaddress);
        add(lblPhone);      add(tfphone);
        add(lblEmail);      add(tfemail);
        add(lblDob);       add(dcdob);
        add(lblXPercent);   add(tfx);
        add(lblXiiPercent); add(tfxii);
        add(lblAadhar);     add(tfaadhar);
        add(lblCourse);     add(cbcourse);
        add(lblBranch);     add(cbbranch);
        add(submit);        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            // Code for submitting student details
            JOptionPane.showMessageDialog(this, "Student details submitted successfully!");
        } else {
            dispose(); // Close the window if Cancel button is clicked
        }
    }

    public static void main(String[] args) {
        new AddStudent();
    }
}

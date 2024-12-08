/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.customermanagementsystem;

/**
 *Login form requests a username and password. Once correctly entered, the main form 
 * comes up and allows for user selection.
 * 
 * @author Isis Vasquez
 * Date Completed: 12/06/2024
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Admin Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userField = new JTextField(15);
        passField = new JPasswordField(15);
        loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String pass = new String(passField.getPassword());
                if (user.equals("root") && pass.equals("Ipass2003!")) {
                    new TestForm().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login!");
                }
            }
        });

        addComponents();
        setVisible(true);
    }

    private void addComponents() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Username:"));
        panel.add(userField);
        panel.add(new JLabel("Password:"));
        panel.add(passField);
        panel.add(loginButton);
        add(panel);
    }
}

package com.Form;


	

	import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

	public class Form1 implements ActionListener {
	    
		JFrame frame;
	    JLabel name = new JLabel("Names");
	    JLabel userName = new JLabel("UserName");
	    JLabel password = new JLabel("Password");

	    JTextField nameField = new JTextField();
	    JTextField userNameField = new JTextField();
	    JPasswordField passwordField = new JPasswordField();

	    JButton registerBtn = new JButton("Register");
	    JButton resetBtn = new JButton("Reset");

	    public Form1() {
	        createWindow();
	        setLocationAndSize();
	        addComponentsToFrame();
	        addActionEvent();
	        name.setHorizontalAlignment(SwingConstants.CENTER);
	        userName.setHorizontalAlignment(SwingConstants.CENTER);
	        password.setHorizontalAlignment(SwingConstants.CENTER);
	        
	    }

	    private void createWindow() {
	        frame = new JFrame();
	        frame.setTitle("User Registration");
	        frame.setBounds(100, 100, 400, 300);
	        frame.getContentPane().setBackground(java.awt.Color.decode("#5DADE2"));
	        frame.getContentPane().setLayout(null);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	    }

	    private void setLocationAndSize() {
	        name.setBounds(30, 30, 120, 30);
	        nameField.setBounds(180, 30, 150, 30);

	        userName.setBounds(30, 80, 120, 30);
	        userNameField.setBounds(180, 80, 150, 30);

	        password.setBounds(30, 130, 120, 30);
	        passwordField.setBounds(180, 130, 150, 30);

	        registerBtn.setBounds(50, 190, 120, 40);
	        resetBtn.setBounds(200, 190, 120, 40);
	    }

	    private void addComponentsToFrame() {
	    	name.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    	userName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    	password.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    	registerBtn.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    	resetBtn.setBorder(BorderFactory.createLineBorder(Color.GRAY));
	    	
	    	name.setForeground(Color.WHITE);
	    	userName.setForeground(Color.WHITE);
	    	password.setForeground(Color.WHITE);
	    	registerBtn.setForeground(Color.WHITE);
	    	resetBtn.setForeground(Color.WHITE);
	    	
	    	registerBtn.setBackground(java.awt.Color.decode("#5DADE2"));
	    	resetBtn.setBackground(java.awt.Color.decode("#5DADE2"));
	    	
	    
	        frame.add(name);
	        frame.add(userName);
	        frame.add(password);

	        frame.add(nameField);
	        frame.add(userNameField);
	        frame.add(passwordField);

	        frame.add(registerBtn);
	        frame.add(resetBtn);
	    }

	    private void addActionEvent() {
	        registerBtn.addActionListener(this);
	        resetBtn.addActionListener(this);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == registerBtn) {
	            String name = nameField.getText();
	            String username = userNameField.getText();
	            String password = String.valueOf(passwordField.getPassword());

	            if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
	                JOptionPane.showMessageDialog(frame, "Please fill all fields!");
	            } else {
	                JOptionPane.showMessageDialog(frame,
	                        "Registered Successfully!\nName: " + name +
	                                "\nUsername: " + username);
	            }
	        } else if (e.getSource() == resetBtn) {
	            nameField.setText("");
	            userNameField.setText("");
	            passwordField.setText("");
	        }
	    }

	    public static void main(String[] args) {
	        new Form1();
	    }
	}


// Author: Aatma Patel
// Friday Apr 23 2020
// Period 4
// ISC3U
// Unit 5 Looping Assignment 1

package LoopingAssignment1;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JPasswordField;

import javax.swing.JTextField;

public class LoginGUI implements ActionListener{
	
	private static JLabel userLabel;
	
	private static JTextField userText;
	
	private static JLabel passLabel;
	
	private static JPasswordField passText;
	
	private static JButton button;
	
	private static JLabel success;
	
	private static JLabel fail;

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		
		JFrame frame = new JFrame();
		
		frame.setSize(320, 200);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username:");
		
		userLabel.setBounds(10, 20, 80, 25);
		
		panel.add(userLabel);
		
		userText = new JTextField(20);

		userText.setBounds(100, 20, 165, 25);
		
		panel.add(userText);
		
		passLabel = new JLabel("Password:");
		
		passLabel.setBounds(10, 50, 80, 25);
		
		panel.add(passLabel);
		
		passText = new JPasswordField();

		passText.setBounds(100, 50, 165, 25);
		
		panel.add(passText);
		
	    button = new JButton("Login");
		
		button.setBounds(100, 80, 80, 25);
		
		button.addActionListener(new GUI());
		
		panel.add(button);
		
		success = new JLabel("");
		
	    fail = new JLabel("");
		
		success.setBounds(10, 110, 300, 25);
		
		panel.add(success);
		
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userText.getText();
		
		@SuppressWarnings("deprecation")
		String pass = passText.getText();
				
		if(user.equals("psm1921") && pass.equals("msm1933")) {
			
			success.setText("Try again...");
			
		} else {
			
		fail.setText("Try again...");

		}

	}

}

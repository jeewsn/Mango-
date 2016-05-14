/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panel;

/**
 *
 * @author halo
 */
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends SuperPanels 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	//private int init=0;
	JPanel login = new JPanel();

	JTextField userField = new JTextField();
	JTextField passField = new JTextField();
	JButton ok = new JButton("Login");
	ActionListener listenerForOKButton;
	public LoginPanel()
	{
		super();
		JLabel user = new JLabel("UserID");
		JLabel password = new JLabel("Password");
		
		user.setBounds		(50, 0 , 300, 50);
		password.setBounds	(50,100, 300, 50);
		userField.setBounds	(50, 50, 300, 50);
		passField.setBounds	(50,150, 300, 50);
		ok.setBounds		(50,200, 300, 50);
		add(user);
		//add(password);
		add(userField);
		//add(passField);
		
		
	}
	public void setUser(String user)
	{
		userField.setText(user);  
	}
	public void setPass(String password)
	{
		passField.setText(password);
	}
	public String getUser()
	{
		return (String )userField.getText();
	}
	public String getPassword()
	{
		return (String)passField.getText();
	}
	
	public void addListener(ActionListener listenerForOKButton)
	{
		ok.addActionListener(listenerForOKButton);
	}

}
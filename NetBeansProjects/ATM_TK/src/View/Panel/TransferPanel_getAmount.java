/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panel;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author halo
 */
public class TransferPanel_getAmount extends SuperPanels
{
    JTextField amountField = new JTextField();
    public TransferPanel_getAmount()
    {
           super();
		JLabel user = new JLabel("Target Transfer ID");
		JLabel password = new JLabel("Password");
		
		user.setBounds		(50, 0 , 300, 50);
		password.setBounds	(50,100, 300, 50);
		amountField.setBounds	(50, 100, 300, 50);
		//passField.setBounds	(50,150, 300, 50);
		//ok.setBounds		(50,200, 300, 50);
		add(user);
		//add(password);
		add(amountField);
		//add(passField);
    }
    @Override
    public void setAmount(String text)
    {
        amountField.setText(text);
    }
    @Override
    public String getAmount()
    {
        return amountField.getText();
    }
}

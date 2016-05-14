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
public class WithdrawPanel extends SuperPanels
{
    
    JTextField amountField= new JTextField();
    public WithdrawPanel()
    {
        
        super();
		
		JLabel withdraws = new JLabel("Withdraw");
		
		withdraws.setBounds		(50, 0 , 300, 50);
		amountField.setBounds	(50,100, 300, 50);
		add(withdraws);
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

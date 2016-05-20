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
public class TransferPanel_getID extends SuperPanels
{
    JTextField TranIDField = new JTextField();
    public TransferPanel_getID()
    {
        super();
		JLabel user = new JLabel("Target Transfer ID");
		//JLabel password = new JLabel("Password");
		
		user.setBounds		(50, 0 , 300, 50);
		//password.setBounds	(50,100, 300, 50);
		TranIDField.setBounds	(50, 50, 300, 50);
		//passField.setBounds	(50,150, 300, 50);
		//ok.setBounds		(50,200, 300, 50);
		add(user);
		//add(password);
		add(TranIDField);
		//add(passField);
    }
    @Override
    public void setTranID(String text)
    {
        TranIDField.setText(text);
    }
    @Override
    public String getTranID()
    {
        return TranIDField.getText();
    }
   
}

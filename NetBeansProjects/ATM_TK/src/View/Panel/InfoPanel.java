/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javafx.scene.layout.Border;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author halo
 */
public class InfoPanel extends SuperPanels
{
       JPanel left = new JPanel();
       
        JButton deposit       = new JButton("Deposit");
        JButton WithDraw      = new JButton("WithDraw");
        JButton Transfer      = new JButton("Transfer");
        JButton Donate        = new JButton("Donate");
        JButton ShowStateMent = new JButton("ShowStateMent");
        JButton LogOut        = new JButton("Logout");
        JLabel Account_ID     = new JLabel();
        JLabel Account_Name   = new JLabel();
        JLabel Balance        = new JLabel();
    public InfoPanel()
    {
        this.setLayout(new BorderLayout());
        left.setLayout(new BoxLayout(left, ALLBITS));
       
        
    }
    public void addListener(ActionListener listener)
	{
           deposit.addActionListener(listener);
           WithDraw.addActionListener(listener);
           Transfer.addActionListener(listener);
           ShowStateMent.addActionListener(listener);
           LogOut.addActionListener(listener);
           Donate.addActionListener(listener);
           
        }
	public void setUser(String user)	
        {	
            Account_Name.setText(user);
        }
	public void setBalance(String balance)	
        {
            Balance.setText(balance);
        }
	public void setID(String iD)            
        {
            Account_ID.setText(iD);
        }
	
        
}

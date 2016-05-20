package View.Panel;

import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * @author halo
 */
public class DepositPanel extends SuperPanels
{
    JTextField amountField= new JTextField();
    JLabel deposit  = new JLabel("Deposit");
    public DepositPanel()
    {
        super();
		deposit.setBounds		(50, 0 , 300, 50);
		amountField.setBounds   	(50,100, 300, 50);
		add(deposit);
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
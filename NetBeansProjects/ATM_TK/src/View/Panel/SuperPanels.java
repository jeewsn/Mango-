package View.Panel;

/**
 *
 * @author halo
 */
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class SuperPanels extends JPanel
{
	public SuperPanels() {
		// TODO Auto-generated constructor stub
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(null);
		
	}
	public void addListener(ActionListener listener){ }
	public void setUser(String user)	{	}
	public void setBalance(String balance)	{	}
	public void setID(String iD)	{	}
	public void setTranID(String traniD)	{	}
	public void setPassword(String password)	{	}
	public void setAmount(String text)	{	}
	public String getUser(){return "";}
	public String getBalance(){return "";}
	public String getID(){return "";}
	public String getTranID(){return "";}
	public String getPassword(){return "";}
	public String getAmount(){return "";}
	public int getFocus(){return 0;}
	public void changePanel()
	{
		
	}
}


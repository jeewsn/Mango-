package View;
import View.Panel.SuperPanels;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * @author halo
 */
public class inrFrame extends JFrame
{
    public inrFrame(SuperPanels topPanel)//,String title)
	{
		this.title=title;
		this.topPanel=topPanel;
		initComponent();
	}	
	private JFrame aa = new JFrame();
	private SuperPanels topPanel;
	private String title ;
	private JButton No1	= new JButton("1"),	No2	= new JButton("2"),
			  No3	= new JButton("3"),	No4	= new JButton("4"),
			  No5	= new JButton("5"),	No6	= new JButton("6"),
			  No7	= new JButton("7"),	No8	= new JButton("8"),
			  No9	= new JButton("9"), No0	= new JButton("0"),
			  Noreset = new JButton("reset"),Nodel= new JButton("del"),
			  Nodot	= new JButton("Dot"),NoEnter = new JButton("Enter"),
			  NoBack	= new JButton("Back");
	public void setTitle(String title) {this.title = title;}
	
	public void initComponent()
	{
		aa.setTitle(title);
		System.out.println("already settitle");
		JPanel NumButton = new JPanel();
		this.setSize(400,800);
			NumButton.setSize(400,400);
			NumButton.setLayout(new GridLayout(5, 3,2,2));
			NumButton.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                        
			NumButton.add(NoBack);  NumButton.add(NoEnter);	NumButton.add(Noreset);
			NumButton.add(No1);	NumButton.add(No2);     NumButton.add(No3);
			NumButton.add(No4); 	NumButton.add(No5); 	NumButton.add(No6);
			NumButton.add(No7); 	NumButton.add(No8);	NumButton.add(No9);
			NumButton.add(Nodot);	NumButton.add(No0); 	NumButton.add(Nodel);
			this.add(NumButton);
			this.setSize(400, 400);
			this.setVisible(true);		
			System.out.println("already create NumPanel");
			
		this.setSize(400,800);
		JPanel parent 		= new JPanel();
		parent.setLayout(new GridLayout(2,0,5,5));
		parent.setSize(400,800);
		aa.setVisible(true);
		aa.setDefaultCloseOperation(EXIT_ON_CLOSE);
		aa.setSize(400,800);
		parent.add(topPanel);
		parent.add(NumButton);
		aa.add(parent);
		System.out.println("Already create this"+title);
	}
	public void closeFrame()
	{
		System.out.println("already dispose");
		aa.dispose();
	}
	public void showMessage(String word)
	{
		JOptionPane.showMessageDialog( null , word);
                System.out.println("showMessageDialog"+word);
	}
	public void addListener(ActionListener listener )
	{
		No1.addActionListener	(listener); No2.addActionListener	(listener);
		No3.addActionListener	(listener); No4.addActionListener	(listener);
		No5.addActionListener	(listener); No6.addActionListener	(listener);
		No7.addActionListener	(listener); No8.addActionListener	(listener);
		No9.addActionListener	(listener); No0.addActionListener	(listener);
		Noreset.addActionListener(listener);Nodel.addActionListener	(listener);
		Nodot.addActionListener	(listener); NoEnter.addActionListener	(listener);
		NoBack.addActionListener(listener); 
                topPanel.addListener(listener);
		 
	}
	public void changePanel(SuperPanels newtopPanel)
	{
		this.topPanel=newtopPanel;
		aa.removeAll();
		initComponent();
		
	}
	// Connecting get and set with Panel not Use of all
	public String getUserPanel()                    {return topPanel.getUser();}
	public void setUserPanel(String user)   	{topPanel.setUser(user);}
	public String getPasswordPanel()		{return topPanel.getPassword();}
	public void setPasswordPanel(String password)	{topPanel.setPassword(password);}
	public String getBalancePanel()			{return topPanel.getBalance();}
	public void setBalancePanel(String balance)	{topPanel.setBalance(balance);}
	public String getIDPanel()			{return topPanel.getID();}
	public void setIdPanel(String id)		{topPanel.setID(id);}
	public String getTranIDPanel()			{return topPanel.getTranID();}
	public void setTranIDPanel(String traniD)	{topPanel.setTranID(traniD);}
	public String getAmountPanel()		{return topPanel.getAmount();}
	public void setAmountPanel(String text)	{topPanel.setAmount(text);}
	public int getFocus()                           {return topPanel.getFocus();}
	
}

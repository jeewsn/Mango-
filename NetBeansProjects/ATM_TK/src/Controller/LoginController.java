/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import Model.Mlogin;

import ModelV2.MGetUserData;
import View.Panel.LoginPanel;
import View.Panel.inrFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author halo
 */
public class LoginController 
{
    inrFrame theView;
    MGetUserData theModel;
    //Mstoredatas datas;
    //MgetDB thedb;
   
    public LoginController()//SuperPanels theView )
    {
        theModel= new MGetUserData();
        this.theView=new inrFrame(new LoginPanel());
        this.theView.addListener(new listenerLogin());
        //datas = new Mstoredatas();
        //thedb=new MgetDB();
        
    }
   class listenerLogin implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
		String command=e.getActionCommand();
		System.out.println(command+"  Login Panel");
		if(e.getActionCommand().equals("1"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"1");
		}
		else if(command.equals("2"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"2");				
                }
		else if(command.equals("3"))
                {
                    theView.setPasswordPanel(theView.getPasswordPanel()+"3");				
                }
		else if(command.equals("4"))
                {
                    theView.setPasswordPanel(theView.getPasswordPanel()+"4");				
                }
		else if(command.equals("5"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"5");				
                }
		else if(command.equals("6"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"6");				}
		else if(command.equals("7"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"7");				}
		else if(command.equals("8"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"8");				}
		else if(command.equals("9"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"9");				}
		else if(command.equals("0"))
                {
                    theView.setPasswordPanel(theView.getPasswordPanel()+"0");				}
		else if(command.equals("*"))
        	{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"*");				}
		else if(command.equals("#"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+"#");				}
		else if(command.equals("Dot"))
		{
                    theView.setPasswordPanel(theView.getPasswordPanel()+".");				}
		else if(command.equals("Back"))
		{
			//theView.changePanel(new PasswordPanel());
                }		
		else if(command.equals("Login")||command.equals("Enter"))
		{
                    String aa= theModel.login(theView.getUserPanel(),theView.getPasswordPanel());
                    System.out.println(aa);
                    System.out.println(theView.getUserPanel());
                    System.out.println(theView.getPasswordPanel());
                    //System.out.print(aa);

                    System.out.println("Controller.LoginController.listenerLogin.actionPerformed()");
                    if(aa.equals("Correct password"))
                    {
                           System.out.println("1");
                         String accNo=theModel.getAccNo();
                         String name = theModel.getName();
                         String balance= theModel.getBalance();
                         new InfoController(name,accNo,balance);
                         theView.closeFrame();
                         
                    }
                    else if(aa.equals("Wrong password"))   
                    {
                        System.out.println("2");
                        theView.showMessage(aa);
                    }
                    else if(aa.equals("Wrong User"))
                            
                    {
                            System.out.println("3");
                        theView.showMessage(aa);
                    }
                   
                }
                   
		else if(command.equals("del"))
		{
                    String s = theView.getPasswordPanel();
                    if(s.length()>=1) 
                    {
                        theView.setPasswordPanel(s.substring(0,s.length()-1));
		    }
		}
                else if(command.equals("reset"))
		{
			theView.setPasswordPanel("");
		}
	}
    }
       
}


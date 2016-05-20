/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mlogin;
import View.Panel.SuperPanels;
import View.inrFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author halo
 */
public class LoginController 
{
    inrFrame theView;
    Mlogin theModel;
    
    public LoginController(SuperPanels theView ,Mlogin theModel)
    {
        this.theModel=theModel;
        this.theView=new inrFrame(theView);
        this.theView.addListener(new listenerLogin());
        
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
                    theView.setUserPanel(theView.getUserPanel()+"1");
		}
		else if(command.equals("2"))
		{
                    theView.setUserPanel(theView.getUserPanel()+"2");				
                }
		else if(command.equals("3"))
                {
                    theView.setUserPanel(theView.getUserPanel()+"3");				
                }
		else if(command.equals("4"))
                {
                    theView.setUserPanel(theView.getUserPanel()+"4");				
                }
		else if(command.equals("5"))
		{
                    theView.setUserPanel(theView.getUserPanel()+"5");				
                }
		else if(command.equals("6"))
		{
                    theView.setUserPanel(theView.getUserPanel()+"6");				}
		else if(command.equals("7"))
		{
                    theView.setUserPanel(theView.getUserPanel()+"7");				}
		else if(command.equals("8"))
		{
                    theView.setUserPanel(theView.getUserPanel()+"8");				}
		else if(command.equals("9"))
		{
                    theView.setUserPanel(theView.getUserPanel()+"9");				}
		else if(command.equals("0"))
                {
                    theView.setUserPanel(theView.getUserPanel()+"0");				}
		else if(command.equals("*"))
        	{
                    theView.setUserPanel(theView.getUserPanel()+"*");				}
		else if(command.equals("#"))
		{
                    theView.setUserPanel(theView.getUserPanel()+"#");				}
		else if(command.equals("Dot"))
		{
                    theView.setUserPanel(theView.getUserPanel()+".");				}
		else if(command.equals("Back"))
		{
			//theView.changePanel(new PasswordPanel());
                }		
		else if(command.equals("Login")||command.equals("Enter"))
		{
		//createNewMainField(new PasswordPanel());
		}
		else if(command.equals("del"))
		{
                    String s = theView.getUserPanel();
                    if(s.length()>=1) 
                    {
                        theView.setUserPanel(s.substring(0,s.length()-1));
		    }
		}
                else if(command.equals("reset"))
		{
				theView.setUserPanel("");
		}
	}
    }
        
}
    

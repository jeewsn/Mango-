/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mpassword;
import View.Panel.SuperPanels;
import View.inrFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author halo
 */
public class PassController
{
    inrFrame theView ;
    Mpassword theModel;
    public PassController(SuperPanels theView , Mpassword theModel)
    {
        this.theModel=theModel;
        this.theView =new inrFrame(theView);
        this.theView.addListener(new listenerPassword());
    }
    class listenerPassword implements ActionListener
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
                else if(command.equals("Login")||command.equals("Enter"))
		{
		//createNewMainField(new PasswordPanel());
		}
                else if(command.equals("Back"))
		{
			//theView.changePanel(new PasswordPanel());
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
				
		
		else if(command.equals("del"))
		{
                    String s = theView.getUserPanel();
                    if(s.length()>=1) {
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
        
    
    


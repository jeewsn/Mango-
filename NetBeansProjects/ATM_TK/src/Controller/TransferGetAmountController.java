/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MtrangetAmount;
import Model.MtrangetID;
import View.Panel.SuperPanels;
import View.inrFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.Panel.SuperPanels;
import View.inrFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.applet.Main;


/**
 *
 * @author halo
 */

public class TransferGetAmountController {
     inrFrame theView ;
    MtrangetAmount theModel;
    public TransferGetAmountController(SuperPanels theView , MtrangetAmount theModel)
    {
        this.theModel=theModel;
        this.theView =new inrFrame(theView);
        this.theView.addListener(new TransferGetAmountController.listenerGetAmount());
    }
    class listenerGetAmount implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String command=e.getActionCommand();
                System.out.println(command+"  Deposit Panel");
                if(e.getActionCommand().equals("1"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"1");
                    }
                else if(command.equals("Back"))
                    {
                            //theView.changePanel(new PasswordPanel());
                    }		
                else if(command.equals("Login")||command.equals("Enter"))
                    {
                    //createNewMainField(new PasswordPanel());
                    }
                else if(command.equals("2"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"2");				
                    }
                else if(command.equals("3"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"3");				
                    }
                else if(command.equals("4"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"4");				
                    }
                else if(command.equals("5"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"5");				
                    }
                else if(command.equals("6"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"6");				}
                else if(command.equals("7"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"7");				}
                else if(command.equals("8"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"8");				}
                else if(command.equals("9"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"9");				}
                else if(command.equals("0"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"0");				}
                else if(command.equals("*"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"*");				}
                else if(command.equals("#"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+"#");				}
                else if(command.equals("Dot"))
                    {
                        theView.setTranIDPanel(theView.getTranIDPanel()+".");				}
                
                else if(command.equals("del"))
                    {
                        String s = theView.getUserPanel();
                        if(s.length()>=1) {
                               theView.setTranIDPanel(s.substring(0,s.length()-1));
                            }
                    }
                else if(command.equals("reset"))
                            {
                                    theView.setTranIDPanel("");
                            }
                    }
            }

    
}

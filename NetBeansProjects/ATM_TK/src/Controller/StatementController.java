/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import ModelV2.MStatement;
import View.Panel.StatementPanel;
import View.Panel.inrFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author halo
 */
public class StatementController 
{
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   
    MStatement theModel;
    String accNo,name,balance;
    inrFrame theView;
    ArrayList<String> arrList;
    public StatementController(String name,String accNo,String balance) //ArrayList<HashMap> aa )
    {
      
        
        this.balance = balance;
        this.accNo = accNo;
        this.name = name;
        
        System.out.println(accNo);
        this.theModel= new MStatement();
        arrList = theModel.statement(accNo);
        theView = new inrFrame(new StatementPanel(theModel.statement(accNo)));
        theView.addListener(new listenerStatement());
        
        
        
        
    }
    class listenerStatement implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            
            String command = e.getActionCommand();
            System.out.println(command);
           
             if(command.equals("Back"))
                    {
                            //theView.changePanel(new PasswordPanel());
                        new InfoController(name, accNo, balance);
                        theView.closeFrame();
   //theView.changePanel(new PasswordPanel());
                    } 
        }
        
    }

}
    

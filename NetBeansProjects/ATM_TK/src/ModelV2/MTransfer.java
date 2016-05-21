/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelV2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author halo
 */
public class MTransfer extends MGetDB implements MTransaction{
    String tranID;
    String tranBal;
    String output;
    String Balss; //Balance 
    public  boolean checkTranID(String tranID)
    {
        connect();
        boolean output = false;
        String sql = "SELECT * FROM `ATM_Customer` ";
        ArrayList<HashMap> list = db.queryRows(sql);
        for(HashMap l : list){
            if(l.get("Customer_ID").equals(tranID))
            {
                    output = true;
                    this.tranID = (""+l.get("Customer_ID"));
                    this.tranBal = (""+l.get("Customer_Balance"));
                    break;
            }
            else
            {
                    output = false;
                   
            }
            
           
        }
        disconnect();
        return output;
        
    }
   
    @Override
    
    public String doTransaction(String balance, String amount)
    {   
        
        double bal = Double.parseDouble(balance); 
        double amo = Double.parseDouble(amount);
        double amoTra = Double.parseDouble(tranBal);
       
        if(amo>100000) {
            output = "Can not transfer more than 100,000";
        } else {
            this.Balss = (bal - amo) + "";
            this.tranBal = (amoTra + amo) + "";
            output = "Done";
        }
        return output ;
    }

    @Override
    public void updateBalance(String accNo, String balance) {
        connect(); // from super class
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+Balss+"'"
                + "WHERE Customer_ID = '"+accNo+"'";
        db.executeQuery(sql_up);
        disconnect(); // from super class
    }

    @Override
    public void updateStatement(String accNo, String amount) {
        connect(); // from super class
        String sql_Trans = "INSERT INTO `ATM_Statement`"
                + " (`Customer_ID`, `Mode`, `Money`) "
                + " VALUES ('"+accNo+"','Transfer','"+amount+"')";
        db.executeQuery(sql_Trans);
        disconnect(); // from super class 
    }
    
    
     public  void updateTran()
    {
        connect();
         String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+this.tranBal+"'"
                + "WHERE Customer_ID = '"+this.tranID+"'";
        db.executeQuery(sql_up);
        disconnect();
    }
     public String getBalance()
     {
         return Balss;
     }
}

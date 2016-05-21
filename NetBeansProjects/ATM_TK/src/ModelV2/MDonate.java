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
public class MDonate extends MTransfer
{
    
     
     String DonateName;
     String output;
     @Override
     public  boolean checkTranID(String DonateName)
    {
        this.DonateName=DonateName;
        connect();
        boolean output = false;
        String sql = "SELECT * FROM `ATM_Customer` ";
        ArrayList<HashMap> list = db.queryRows(sql);
        for(HashMap l : list){
            if(l.get("Customer_Name").equals(DonateName))
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
     
}

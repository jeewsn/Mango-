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

public class MGetUserData extends MGetDB{
    private String accNo;
    private String name;
    private String balance;

    public MGetUserData()
    {
    }
    public void setInput(String accNo, String name, String balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    } 
    
    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return balance;
    }
    
    
    public String login(String user , String password)
    {
        super.connect(); // from super class
        String output = "";
        String sql = "SELECT * FROM `ATM_Customer` ";
        ArrayList<HashMap> list = db.queryRows(sql);
        for(HashMap l : list){
            if(l.get("Customer_ID").equals(user)){
                if(l.get("Customer_Pass").equals(password)){
                    output = "Correct password";
                    
                    
                    accNo = (""+l.get("Customer_ID"));
                    name =  (""+l.get("Customer_Name"));
                    balance = (""+l.get("Customer_Balance"));
                    break;
                }
                else{
                    output = "Wrong password";
                    break;
                }
            }
            else{
                output = "Wrong User";
            }
        }
        super.disconnect(); // from super class
        return output;
    }

}
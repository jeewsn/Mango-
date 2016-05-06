/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import edu.sit.cs.db.CSDbDelegate;
import java.util.ArrayList;
import java.util.HashMap;

public class MgetDB 
{
    private CSDbDelegate db;
    private MstoreData mstoreData;
    public MgetDB()
    {}
    
    public String checkPassword(String user , String password)
    {
        String output = "";
        String sql = "SELECT * FROM `ATM_Customer` ";
        ArrayList<HashMap> list = db.queryRows(sql);
        for(HashMap l : list){
            if(l.get("Customer_ID").equals(user)){
                if(l.get("Customer_Pass").equals(password)){
                    output = "Correct password";
                    mstoreData.info((""+l.get("Customer_ID")) , (""+l.get("Customer_Pass"))
                                  ,(""+l.get("Customer_Name")), (""+l.get("Customer_Balance")));
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
        return output;
    }
}


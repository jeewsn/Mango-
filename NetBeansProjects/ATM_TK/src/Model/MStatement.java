/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Tuk
 */
public class MStatement extends MGetDB{
    public ArrayList<String> statement(){ 
        connect();
        ArrayList<String> myArrList = new ArrayList<String>();
        String query = "SELECT * FROM `ATM_Statement` ";
        ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                myArrList.add(""+l.get("Statement_No"));
                myArrList.add(""+l.get("Customer_ID"));
                myArrList.add(""+l.get("Mode"));
                myArrList.add(""+l.get("Money")); 
            }
        disconnect();
        return myArrList;
    }
}

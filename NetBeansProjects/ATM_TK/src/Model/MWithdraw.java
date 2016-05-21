/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tuk
 */
public class MWithdraw extends MGetDB implements MTransaction{

    @Override
    public String doTransaction(String balance, String amount) {
        double bal = Double.parseDouble(balance); 
        double amo = Double.parseDouble(amount);
        
        balance = (bal - amo) + "";
        return balance;
    }

    @Override
    public void updateBalance(String accNo, String balance) {
        connect(); // from super class
        String sql_up = "UPDATE `ATM_Customer` "
                + "SET Customer_Balance= '"+balance+"'"
                + "WHERE Customer_ID = '"+accNo+"'";
        db.executeQuery(sql_up);
        disconnect(); // from super class
    }

    @Override
    public void updateStatement(String accNo, String amount) {
        connect(); // from super class
        String sql_Wi = "INSERT INTO `ATM_Statement`"
                + " (`Customer_ID`, `Mode`, `Money`) "
                + " VALUES ('"+accNo+"','Withdraw','"+amount+"')";
        db.executeQuery(sql_Wi);
        disconnect(); // from super class
    }
    
}

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
interface MTransaction {
    String doTransaction(String balance, String amount);
    void updateBalance(String accNo, String balance);
    void updateStatement(String accNo, String amount);
}

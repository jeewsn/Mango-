/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

// class เอามาเพื่อเก็บข้อมูล
public class MstoreData {

    private String accNo;
    private String password;
    private String balance;
    private String name;
    private String no;
    private String no_each;
    public MstoreData(String user,String password,
                        String balance, String name)
    {
        this.accNo=user;
        this.password=password;
        this.balance=balance;
        this.name=name;
    
    }
    public String getUser() {    return accNo;}
    public void setUser(String user) { this.accNo = user; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password;}
    public String getBalance() {
    return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo_each() {
        return no_each;
    }

    public void setNo_each(String no_each) {
        this.no_each = no_each;
    }

}

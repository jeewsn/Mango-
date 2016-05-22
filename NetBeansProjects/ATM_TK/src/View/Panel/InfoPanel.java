/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panel;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.jdesktop.beansbinding.BindingGroup;

/**
 *
 * @author halo
 */
public class InfoPanel extends SuperPanels
{
 
    private BindingGroup bindingGroup;
    private JPanel jPanel1;
    private JTextField jTextField2;
    private JPasswordField jPasswordField1;
    private JLabel Label_Login;
    private JLabel Label_Password;
    private JButton Deposit;
    private JButton Withdraw;
    private JButton Transfer;
    private JButton statement;
    private JButton LogoutBT;
    private JButton DonateBT;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField Text_ID;
    private JTextField Text_Name;
    private JTextField Balance;
    public InfoPanel()
    {
      initComponents();
        
    }
     private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Deposit = new javax.swing.JButton();
        DonateBT = new javax.swing.JButton();
        Transfer = new javax.swing.JButton();
        statement = new javax.swing.JButton();
        LogoutBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Text_ID = new javax.swing.JTextField();
        Text_Name = new javax.swing.JTextField();
        Balance = new javax.swing.JTextField();
        Withdraw = new javax.swing.JButton();

  

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Deposit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Deposit.setText("Deposit");

        DonateBT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DonateBT.setText("Donate");
      
        Transfer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Transfer.setText("Transfer");

        statement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        statement.setText("Statement");
      

        LogoutBT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LogoutBT.setText("LOGOUT");
     

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Account status");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Balance");

        Text_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Text_ID.setFont(new java.awt.Font("Tahoma", 0, 18));
        Text_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Text_Name.setFont(new java.awt.Font("Tahoma", 0, 18));
        Balance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Balance.setFont(new java.awt.Font("Tahoma", 0, 18));
         
        Withdraw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Withdraw.setText("Withdraw");
    
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_ID)
                            .addComponent(Text_Name)
                            .addComponent(Balance)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGap(0, 0, 0)
                        .addComponent(Withdraw)
                        .addGap(0, 0, 0)
                        .addComponent(Deposit)
                        .addGap(0, 0, 0)
                        .addComponent(Transfer)
                        .addGap(0, 0, 0)
                        .addComponent(statement)))
                .addGap(0, 0, 0)
                .addComponent(LogoutBT))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGap(0, 0, 0)
                .addComponent(DonateBT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(DonateBT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statement, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold> 
    
        public void addListener(ActionListener listener)
	{
            Withdraw.addActionListener(listener);
            Deposit.addActionListener(listener);
            Transfer.addActionListener(listener);
            statement.addActionListener(listener);
            LogoutBT.addActionListener(listener);
            DonateBT.addActionListener(listener);
            
           
        }
	public void setUser(String user)	
        {	
            Text_Name.setText(user);
        }
	public void setBalance(String balance)	
        {
            int i = 0;
            String s = "";
            // Delete DOT .
            while( i < balance.length())
            {
                if(balance.charAt(i)=='.'){ break; }
                else
                {
                    s += balance.charAt(i);
                }
                i++;
            }
            // Add , 
            String t = ""; 
            int cnt = 0;
            for(i = s.length()-1;i>=0;i--,cnt++) {
            if(cnt==3) {
               t = "," + t;
               cnt=0;
            }
            t = s.charAt(i)+t;
            }
            Balance.setText(t);
        }
	public void setID(String iD)            
        {
            Text_ID.setText(iD);
        }
	
        
}

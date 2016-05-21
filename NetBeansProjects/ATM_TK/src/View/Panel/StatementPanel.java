/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panel;

import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author halo
 */
public class StatementPanel extends SuperPanels
{

    private JScrollPane jScrollPane1;
    private JTable StatementTable;
    ArrayList<String> arr;
    public StatementPanel(ArrayList<String> t)
    {
        initComponents();
        Up_table(t);
    }
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        StatementTable = new javax.swing.JTable();

        StatementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "State_No.", "Acc_No.", "Transaction", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(StatementTable);
        if (StatementTable.getColumnModel().getColumnCount() > 0) {
            StatementTable.getColumnModel().getColumn(0).setResizable(false);
            StatementTable.getColumnModel().getColumn(1).setResizable(false);
            StatementTable.getColumnModel().getColumn(2).setResizable(false);
            StatementTable.getColumnModel().getColumn(3).setResizable(false);
        }
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>
    
    private void Up_table(ArrayList<String> t) 
    {
        DefaultTableModel model = (DefaultTableModel) StatementTable.getModel();
        model.setRowCount(0);
        //ArrayList<String> s = arr;
        for(int i=0,j=1;i < t.size();i+=4,j++) {
            model.addRow(new Object[]
            {
                j+"",//t.get(i),
                t.get(i+1),
                t.get(i+2),
                t.get(i+3)
            });
        }
    }
}

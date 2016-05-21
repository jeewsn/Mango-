
package Controller;

//import Model.Mdeposit;
//import Model.MinFo;
import ModelV2.MGetUserData;
import View.Panel.InfoPanel;
import View.Panel.inrFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author halo
 */
public class InfoController 
{;
    inrFrame theView;
    MGetUserData theModel;
    String accNo,name,balance;
    public InfoController( String name ,String accNo,String balance )
    {
        this.theView = new inrFrame(new InfoPanel());
        this.theModel = new MGetUserData();
        this.balance = balance;
        this.accNo = accNo;
        this.name = name;
        theView.setBalancePanel(balance);
        theView.setIdPanel(accNo);
        theView.setUserPanel(name);
        theView.addListener(new listenerDeposit());
    }
    class listenerDeposit implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
           String command=e.getActionCommand();
            System.out.println(command);
            if(command.equals("Withdraw"))
            {
                System.out.println("Withdraw");
                new WithdrawController(name, accNo, balance);
                theView.closeFrame();
                
            }
            else if(command.equals("Deposit"))
            {
                System.out.println("Deposit");
                new DepositController(name, accNo, balance);
                theView.closeFrame();
                
            }
            else if(command.equals("Transfer"))
            {
                System.out.println("1");
                new TransferController(name, accNo, balance);
                theView.closeFrame();
            }
            else if(command.equals("Statement"))
            {
                System.out.println("1");
                new StatementController(name, accNo, balance);
                theView.closeFrame();
            }  
            else if(command.equals("LOGOUT"))
            {
                System.out.println("1");
                new LoginController();
                theView.closeFrame();
            }
            else if(command.equals("Donate"))
            {
                System.out.println("1");
                new DonateController(name, accNo, balance);
                theView.closeFrame();
            }
        }
    }

}
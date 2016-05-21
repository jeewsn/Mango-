    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Controller;

    //import Model.Mdeposit;
    //import Model.Mwithdraw;
    import ModelV2.MWithdraw;
    import View.Panel.WithdrawPanel;
    import View.Panel.inrFrame;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    /**
     *
     * @author halo
     */
    public class WithdrawController
    {
    /**
     *
     * @author halo
     */
        

        inrFrame theView;
        MWithdraw theModel;
        String accNo,name,balance,output;
        public WithdrawController(String name, String accNo,String balance)
        {
            this.theView = new inrFrame(new WithdrawPanel());
            this.theModel= new MWithdraw();
            this.theView.addListener(new listenerWithDraw());
            this.accNo=accNo;
            this.balance=balance;
            this.name=name;
        }

   
        class listenerWithDraw implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String command=e.getActionCommand();
                System.out.println(command+"  Deposit Panel");
                if(e.getActionCommand().equals("1"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"1");
                    }
                else if(command.equals("Back"))
                    {
                        new InfoController(name, accNo, balance);
                        theView.closeFrame();
                    }		
                else if(command.equals("Login")||command.equals("Enter"))
                    {
                        balance=theModel.doTransaction(balance, theView.getAmountPanel());
                        theModel.updateBalance(accNo, balance);
                        theModel.updateStatement(accNo, theView.getAmountPanel());
                        theView.showMessage(theModel.getoutput());
                        if(theModel.getoutput().equals("Done")){
                            new InfoController(name, accNo, balance);
                            theView.closeFrame();
                        }
                        
                    }
                else if(command.equals("2"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"2");				
                    }
                else if(command.equals("3"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"3");				
                    }
                else if(command.equals("4"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"4");				
                    }
                else if(command.equals("5"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"5");				
                    }
                else if(command.equals("6"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"6");				}
                else if(command.equals("7"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"7");				}
                else if(command.equals("8"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"8");				}
                else if(command.equals("9"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"9");				}
                else if(command.equals("0"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"0");				}
                else if(command.equals("*"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"*");				}
                else if(command.equals("#"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+"#");				}
                else if(command.equals("Dot"))
                    {
                        theView.setAmountPanel(theView.getAmountPanel()+".");				}
                
                else if(command.equals("del"))
                    {
                        String s = theView.getAmountPanel();
                        if(s.length()>=1) {
                               theView.setAmountPanel(s.substring(0,s.length()-1));
                            }
                    }
                else if(command.equals("reset"))
                            {
                                    theView.setAmountPanel("");
                            }
                    }
        }

    }


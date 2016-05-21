
import View.Panel.DepositPanel;
import View.Panel.SuperPanels;
import View.inrFrame;


//import Model.MstoreData;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halo
 */
public class MainApplication 
{
  
    public static void main(String[]args)
    {
          //MstoreData storeDate = new MstoreData();
        SuperPanels u = new DepositPanel();
        inrFrame in = new inrFrame(u);
    }
}

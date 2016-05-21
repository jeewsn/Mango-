/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelV2;

/**
 *
 * @author halo
 */
import edu.sit.cs.db.CSDbDelegate;

/**
 *
 * @author Tuk
 */
public class MGetDB {
    CSDbDelegate db;
    public void connect() 
    {
        db = new CSDbDelegate ("localhost","8889","Test","root","root");
        db.connect();
    }
    public void disconnect()
    {
        db.disconnect();
    }
}

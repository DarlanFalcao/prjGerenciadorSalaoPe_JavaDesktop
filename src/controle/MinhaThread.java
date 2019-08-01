/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darlan
 */
public class MinhaThread implements Runnable{

    public MinhaThread(){
        threadHora();
    }
    public String threadHora(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return data.toString();
        
    }
    
    
    @Override
    public void run() {
        
        try {
            while(true){
                threadHora();
            Thread.sleep(1000);
            }
            } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas_intergalácticas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author megarokr
 */
public class Cocinero extends Thread{
    public Cocinero(int tiempo){
        this.tiempo = tiempo;
    }
    
    public Cocinero(){
        
    }
    
    public void setTiempo(int tiempo){
        this.tiempo = tiempo;
    }
    @Override
    public void run() {
        while(tiempo > 0){
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cocinero.class.getName()).log(Level.SEVERE, null, ex);
            }
            tiempo--;
        }
    }
    
    private int tiempo;
}

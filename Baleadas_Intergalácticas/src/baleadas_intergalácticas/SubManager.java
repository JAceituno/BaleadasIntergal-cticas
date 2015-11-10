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
public class SubManager extends Thread{

    public SubManager(boolean cierre, List cocineros_ocupados, Queue cocineros) {
        this.cierre = cierre;
        this.cocineros_ocupados = cocineros_ocupados;
        this.cocineros = cocineros;
    }

    @Override
    public void run() {
        while(!cierre){
            for (int i = 0; i < cocineros_ocupados.size(); i++) {
                if(((Cocinero)cocineros_ocupados.elementAt(i).getValue()).getState() == Thread.State.TERMINATED){
                    cocineros_ocupados.remove(i);
                    cocineros.queue(new Cocinero());
                }
            }
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SubManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean isCierre() {
        return cierre;
    }

    public void setCierre(boolean cierre) {
        this.cierre = cierre;
    }
    
    private boolean cierre;
    private List cocineros_ocupados;
    private Queue cocineros;
}

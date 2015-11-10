/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas_intergalácticas;

/**
 *
 * @author megarokr
 */
public class SubManager extends Thread{

    public SubManager(List cocineros_ocupados) {
        this.cocineros_ocupados = cocineros_ocupados;
    }

    @Override
    public void run() {
        while(!cierre){
            
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
}

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
public class Manager extends Thread{

    public Manager(boolean cierre, Queue ordenes, Queue cocineros, List almacen, List cocineros_ocupados, List ordenes_tomadas) {
        this.cierre = cierre;
        this.ordenes = ordenes;
        this.cocineros = cocineros;
        this.almacen = almacen;
        this.cocineros_ocupados = cocineros_ocupados;
        this.ordenes_tomadas = ordenes_tomadas;
    }

    public boolean isCierre() {
        return cierre;
    }

    public void setCierre(boolean cierre) {
        this.cierre = cierre;
    }

    @Override
    public void run() {
        while(!cierre){
            if(ordenes.size() > 0 && cocineros.size() > 0){
                
            }
        }
    }
    
    
    private boolean cierre;
    private Queue ordenes;
    private Queue cocineros;
    private List almacen;
    private List cocineros_ocupados;
    private List ordenes_tomadas;
}

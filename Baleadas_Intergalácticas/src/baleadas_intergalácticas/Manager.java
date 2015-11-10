/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas_intergalácticas;

import javax.swing.JOptionPane;

/**
 *
 * @author megarokr
 */
public class Manager extends Thread{

    public Manager(boolean cierre, Queue ordenes, Queue cocineros, List almacen, List cocineros_ocupados, List ordenes_tomadas, javax.swing.JDialog jd_ventana) {
        this.cierre = cierre;
        this.ordenes = ordenes;
        this.cocineros = cocineros;
        this.almacen = almacen;
        this.cocineros_ocupados = cocineros_ocupados;
        this.ordenes_tomadas = ordenes_tomadas;
        this.jd_ventana = jd_ventana;
    }

    public boolean isCierre() {
        return cierre;
    }

    public void setCierre(boolean cierre) {
        submanager.setCierre(cierre);
        this.cierre = cierre;
    }

    @Override
    public void run() {
        submanager.start();
        while(!cierre){
            if(ordenes.size() > 0 && cocineros.size() > 0){
                Orden temp = (Orden)ordenes.peek();
                for (int i = 0; i < temp.getList().size(); i++) {
                    for (int j = 0; j < ((Plato)temp.getList().elementAt(i).getValue()).getIngredientes().size(); j++) {
                        for(int k = 0; k < almacen.size(); k++){
                            if(((Ingrediente)((Plato)temp.getList().elementAt(i).getValue()).getIngredientes().elementAt(j).getValue()).getNombre().
                                    equals(((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).getNombre())){
                                if(((Ingrediente)((Plato)temp.getList().elementAt(i).getValue()).getIngredientes().elementAt(j).getValue()).getCantidad() < 
                                        ((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).getCantidad()){
                                    ((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).setCantidad(((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).getCantidad()-((Ingrediente)((Plato)temp.getList().elementAt(i).getValue()).getIngredientes().elementAt(j).getValue()).getCantidad() );
                                    ordenes_tomadas.push_back(ordenes.dequeue());
                                    cocineros_ocupados.push_back(new Cocinero(((Orden)ordenes_tomadas.last().getValue()).getPreparacion()));
                                    cocineros.dequeue();
                                } else if(((Ingrediente)((Plato)temp.getList().elementAt(i).getValue()).getIngredientes().elementAt(j).getValue()).getCantidad() == 
                                        ((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).getCantidad()){
                                    ((Stack)almacen.elementAt(k).getValue()).pop_back();
                                    ordenes_tomadas.push_back(ordenes.dequeue());
                                    cocineros_ocupados.push_back(new Cocinero(((Orden)ordenes_tomadas.last().getValue()).getPreparacion()));
                                    cocineros.dequeue();
                                } else if (((Ingrediente)((Plato)temp.getList().elementAt(i).getValue()).getIngredientes().elementAt(j).getValue()).getCantidad() > 
                                        ((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).getCantidad()){
                                    double tempIngredientePlato = ((Ingrediente)((Plato)temp.getList().elementAt(i).getValue()).getIngredientes().elementAt(j).getValue()).getCantidad();
                                    while (tempIngredientePlato>=0){
                                        if (tempIngredientePlato-((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).getCantidad()<0){
                                            ((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).setCantidad(((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).getCantidad()- tempIngredientePlato);
                                            tempIngredientePlato=0;
                                        }else{
                                            tempIngredientePlato-=((Ingrediente)((Stack)almacen.elementAt(k).getValue()).peek()).getCantidad();
                                            ((Stack)almacen.elementAt(k).getValue()).pop_back();
                                        }   
                                    }                                    
                                    ordenes_tomadas.push_back(ordenes.dequeue());
                                    cocineros_ocupados.push_back(new Cocinero(((Orden)ordenes_tomadas.last().getValue()).getPreparacion()));
                                    cocineros.dequeue();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "¡¡¡¡¡¡¡Ingrese ingredientes!!!!!!!","Error", JOptionPane.ERROR_MESSAGE);
                                    openDialog(jd_ventana);
                                    
                                    k--;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void openDialog(javax.swing.JDialog jd_ventana){
        jd_ventana.setLocationRelativeTo(null);
        jd_ventana.setModal(true);
        jd_ventana.pack();
        jd_ventana.setVisible(true);
        
    }
    private boolean cierre;
    private Queue ordenes;
    private Queue cocineros;
    private List almacen;
    private List cocineros_ocupados;
    private List ordenes_tomadas;//falta dequeue a la orden y mandarla a ordenes tomadas y asignarla a un cocinero
    private SubManager submanager = new SubManager(cierre, cocineros_ocupados, cocineros);
    javax.swing.JDialog jd_ventana;
}

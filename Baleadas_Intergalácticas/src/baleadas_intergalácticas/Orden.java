/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baleadas_intergalácticas;

/**
 *
 * @author rick
 */
public class Orden {
    
    private int numOrden;
    private String nombreCliente;
    private double precioTotal=0;
    private int preparacion=0;
    // Lista de Platos pedidas TDA lista
    private List platos;

    public Orden(int numOrden, String nombreCliente, double precioTotal, int preparacion) {
        this.numOrden = numOrden;
        this.nombreCliente = nombreCliente;
        this.precioTotal = precioTotal;
        this.preparacion = preparacion;
        platos = new List();
    }
    public Orden(int numOrden, String nombreCliente, List platos) {
        this.numOrden = numOrden;
        this.nombreCliente = nombreCliente;
        this.platos = platos;
        
        
        for(int i = 0; i < platos.size(); ++i){
            precioTotal += ((Plato)platos.elementAt(i).getValue()).getPrecio();
            preparacion += ((Plato)platos.elementAt(i).getValue()).getPreparacion();
        }
    }

    public Orden() {
        platos = new List();
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(int preparacion) {
        this.preparacion = preparacion;
    }

    public List getList() {
        return platos;
    }

    public void setList(List list) {
        this.platos = list;
    }
    
    @Override
    public String toString(){
        return "Nombre del cliente:    "+ nombreCliente + "\n" +
               "Número de orden:       "+ numOrden + "\n" +
               "Tiempo de preparación: "+ preparacion +"s\n"+
               "Precio total:          "+ precioTotal;
    }
    
    
    
    
    
    
    
    
    
}

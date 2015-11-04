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
    private double precioTotal;
    private int preparacion;
    // Lista de Platos pedidas TDA lista
    private List list;

    public Orden(int numOrden, String nombreCliente, double precioTotal, int preparacion) {
        this.numOrden = numOrden;
        this.nombreCliente = nombreCliente;
        this.precioTotal = precioTotal;
        this.preparacion = preparacion;
        list = new List();
    }
    public Orden(int numOrden, String nombreCliente, double precioTotal, int preparacion, Object value) {
        this.numOrden = numOrden;
        this.nombreCliente = nombreCliente;
        this.precioTotal = precioTotal;
        this.preparacion = preparacion;
        list = new List(value);
    }

    public Orden() {
        list = new List();
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
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
    
    
    
    
    
    
    
    
    
}

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
public class Plato {
    
    private String nombre;
    private String descripcion;
    private double precio;
    private int preparacion;
    // lista de ingredientes TDA pila
    private Stack stack;

    public Plato(String nombre, String descripcion, double precio, int preparacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.preparacion = preparacion;
        this.stack = new Stack();
    }
    
    public Plato(String nombre, String descripcion, double precio, int preparacion, Object value) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.preparacion = preparacion;
        this.stack = new Stack(value);
    }
    
    

    public Plato() {
        this.stack = new Stack();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(int preparacion) {
        this.preparacion = preparacion;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }
    
    
    
    
}

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
    private int tiempoPreparacion;
    // lista de ingredientes TDA pila
    private List ingredientes;

    public Plato(String nombre, String descripcion, double precio, int preparacion, List list) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tiempoPreparacion = preparacion;
        this.ingredientes = list;
    }
    /*
    public Plato(String nombre, String descripcion, double precio, int preparacion, Object value) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.preparacion = preparacion;
        this.ingredientes = new Stack(value);
    }
    
    

    public Plato() {
        this.ingredientes = new Stack();
    }
    */
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
        return tiempoPreparacion;
    }

    public void setPreparacion(int preparacion) {
        this.tiempoPreparacion = preparacion;
    }

    public List getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void addIngrediente(Ingrediente ingrediente){
        this.ingredientes.push_back(ingrediente);
    }
    
    
}

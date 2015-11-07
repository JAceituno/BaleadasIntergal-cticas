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
public class Almacén {
 
    // TDA lista de ingredientes
    private List ingredientes;

    public Almacén(Object value) {
        this.ingredientes = new List(value);
    }

    public Almacén() {
        ingredientes = new List();
    }

    public List getList() {
        return ingredientes;
    }

    public void setList(List list) {
        this.ingredientes = list;
    }
    
    
    
    
    
    
}

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
public class Menú {
    
    // TDA pila de platos
    private List lista;

    public Menú() {
        
    }

    public Menú(Object value) {
        lista = new List(value);
    }
 
    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }
    
    
    
    
    
}

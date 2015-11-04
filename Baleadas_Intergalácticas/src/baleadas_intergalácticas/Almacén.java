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
    private List list;

    public Almacén(Object value) {
        this.list = new List(value);
    }

    public Almacén() {
        list = new List();
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
    
    
    
    
    
    
}

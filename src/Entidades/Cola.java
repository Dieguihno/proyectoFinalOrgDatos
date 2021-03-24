/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;
        
public class Cola {
    
    private Queue anulado = new LinkedList();
    private Queue entregado = new LinkedList();

    

    public Queue getAnulado() {
        return anulado;
    }

    public void setAnulado(Queue anulado) {
        this.anulado = anulado;
    }

    public Queue getEntregado() {
        return entregado;
    }

    public void setEntregado(Queue entregado) {
        this.entregado = entregado;
    }
    
    
    
    
}

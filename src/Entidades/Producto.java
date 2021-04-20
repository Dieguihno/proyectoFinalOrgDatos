/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Producto {
    
    private Pedido pedido; //en este viene toda la informacion del cliente
    ArrayList<Producto> producto; //lista de productos que adquiere la persona

    public Producto(Pedido pedido, ArrayList<Producto> producto) {
        this.pedido = pedido;
        this.producto = producto;
    }

    public Producto() {
    }
    
    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }
    
    
    
    
}

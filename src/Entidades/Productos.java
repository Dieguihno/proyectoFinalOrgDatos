/*
 Esta clase incluye los productos de catalogo previamente quemados
 */
package Entidades;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author diego
 */
public class Productos {
    
    //primero crear los productos quemados
    
    ArrayList<String> producto = new ArrayList<>();
    ArrayList<Double> precio = new ArrayList<>();
    ArrayList<String> codigo = new ArrayList<>();
    
    LinkedList<Object> listaProductos = new LinkedList<>();
    
    //luego fijar los productos, precios y codigos

    public Productos() {
        
        //productos, precio y codigo
        producto.add("Bebida natural");
        producto.add("Bebida gaseosa");
        producto.add("Bebida caliente");
        producto.add("leche");
        producto.add("desayuno");
        producto.add("Almuerzo");
        producto.add("gallo");
        producto.add("guarnicion");
        
        precio.add(700.0);
        precio.add(1000.0);
        precio.add(500.0);
        precio.add(500.0);
        precio.add(3000.0);
        precio.add(3500.0);
        precio.add(1500.0);
        precio.add(400.0);
        
        codigo.add("1");
        codigo.add("2");
        codigo.add("3");
        codigo.add("4");
        codigo.add("5");
        codigo.add("6");
        codigo.add("7");
        codigo.add("8");
        
        //lista de productos
        
        listaProductos.add(codigo);
        listaProductos.add(producto);
        listaProductos.add(precio);
        
        System.out.println(listaProductos);
        
        
    }
    
    

    
    
    
    
    
    
}

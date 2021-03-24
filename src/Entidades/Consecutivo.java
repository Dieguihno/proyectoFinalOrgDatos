/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Consecutivo {

    private int dato;
    private final int contador = 1;
    private String numero = "";

    public void generar(int dato) {

        this.dato = dato;
        if ((this.dato > 9) || (this.dato < 100)) {
            int cantidad = contador + this.dato;
            numero = ""+cantidad;

        }
        if  (this.dato < 9) {
            int cantidad = contador + this.dato;
            numero = "0"+cantidad;

        }
        
        
    }

}

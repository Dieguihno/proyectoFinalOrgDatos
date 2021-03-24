/*
 • Se capturará el nombre del cliente y cédula en el pedido.
• Se capturará la información principal del pedido. Datos sugeridos: Fecha, Hora,
Cantidad de productos, Total de Venta, Motorizado, Distancia y fecha y hora
de entrega.
• Se capturará la información sobre los productos que pide el cliente y los almacena en
una lista simple de productos relacionada con la factura
• Una vez capturados los datos el pedimentador autoriza el envío y se almacena en un
árbol de pedidos. (Similar a la clase Pedido que almacena lo general y 5 productos
máximo). Este árbol se ordena por número de pedido. 
 */
package Entidades;

import java.sql.Time;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class TomarPedido {

    private Consecutivo consecutivo;
    private String nombreCliente;
    private String cedula;
    private Date fecha;
    private int cantidadProducto;
    private double total;
    private String nombreMotorizado;
    private double distancia;
    private Time tiempoEntrega; //revisar este
    ArrayList<TomarPedido> pedido = new ArrayList<>();

    public TomarPedido(Consecutivo consecutivo, String nombreCliente, String cedula, Date fecha, int cantidadProducto, double total, String nombreMotorizado, double distancia, Time tiempoEntrega) {
        this.consecutivo = consecutivo;
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.fecha = fecha;
        this.cantidadProducto = cantidadProducto;
        this.total = total;
        this.nombreMotorizado = nombreMotorizado;
        this.distancia = distancia;
        this.tiempoEntrega = tiempoEntrega;
    }
    
    

    public Consecutivo getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Consecutivo consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        nombreCliente = JOptionPane.showInputDialog("Digite el nombre del cliente");
        nombreCliente = this.nombreCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        cedula = JOptionPane.showInputDialog("Digite la cedula del cliente");
        cedula = this.cedula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        JOptionPane.showInputDialog("Ingrese los productos que solicita el cliente");
        cantidadProducto = this.cantidadProducto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNombreMotorizado() {
        return nombreMotorizado;
    }

    public void setNombreMotorizado(String nombreMotorizado) {
        JOptionPane.showInputDialog("digite el nombre del motorizado que hace la entrega");
        nombreMotorizado = this.nombreMotorizado;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Time getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(Time tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public ArrayList<TomarPedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<TomarPedido> pedido) {
        this.pedido = pedido;
    }

}

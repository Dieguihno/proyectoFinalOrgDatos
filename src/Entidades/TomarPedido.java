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


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class TomarPedido {

    private int consecutivo;
    private String nombreCliente;
    private String cedula;
    private String fecha;
    private int cantidadProducto;
    private double total;
    private String nombreMotorizado;
    private double distancia;
    private String tiempoEntrega; //revisar este
    private String orden;
    ArrayList<TomarPedido> pedido = new ArrayList<>();

    public TomarPedido(int consecutivo, String nombreCliente, String cedula, String fecha, int cantidadProducto, double total, String nombreMotorizado, double distancia, String tiempoEntrega, String orden) {
        this.consecutivo = consecutivo;
        this.nombreCliente = nombreCliente;
        this.cedula = cedula;
        this.fecha = fecha;
        this.cantidadProducto = cantidadProducto;
        this.total = total;
        this.nombreMotorizado = nombreMotorizado;
        this.distancia = distancia;
        this.tiempoEntrega = tiempoEntrega;
        this.orden = orden;
    }

    public TomarPedido() {
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(String tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public ArrayList<TomarPedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<TomarPedido> pedido) {
        this.pedido = pedido;
    }

}

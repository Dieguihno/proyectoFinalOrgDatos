/*
En caso de que haya anulado por error un pedido puede hacer que un pedido
se vuelva activo de nuevo, se hace copia del pedido al árbol de pedidos activos y luego
se borra del árbol de pedidos anulados.
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Activar {
    
    /*
    1. buscar el pedido en la cola "anulado" mediante el consecutivo
    2. copiarlo a la cola de "pedido"
    3. eliminarlo de la cola "anulado"
    */
    
}

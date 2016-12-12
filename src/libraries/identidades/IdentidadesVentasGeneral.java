/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.identidades;
import java.sql.Date;
/**
 *
 * @author Ellet
 */
public class IdentidadesVentasGeneral{
    int id_ventas_general;
    String codigo_venta;
    String descripcio_venta;
    String nombre_cliente;
    double descuento;
    double total;

    public IdentidadesVentasGeneral(int id_ventas_general, String codigo_venta, String descripcio_venta, String nombre_cliente, double descuento, double total) {
        this.id_ventas_general = id_ventas_general;
        this.codigo_venta = codigo_venta;
        this.descripcio_venta = descripcio_venta;
        this.nombre_cliente = nombre_cliente;
        this.descuento = descuento;
        this.total = total;
    }

    public int getId_ventas_general() {
        return id_ventas_general;
    }

    public void setId_ventas_general(int id_ventas_general) {
        this.id_ventas_general = id_ventas_general;
    }

    public String getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(String codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public String getDescripcio_venta() {
        return descripcio_venta;
    }

    public void setDescripcio_venta(String descripcio_venta) {
        this.descripcio_venta = descripcio_venta;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}




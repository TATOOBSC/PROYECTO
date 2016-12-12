/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.identidades;

import java.util.Date;

/**
 *
 * @author Ellet
 */
public class IdentidadesVentasProducto {
    int id_ventas_producto;
    Date fecha;
    String codigo_producto;
    String nombre_producto;
    double precio_unitario;
    int cantidad;
    double descuento;
    double total;
    int id_ventas_general;

    public IdentidadesVentasProducto(int id_ventas_producto, Date fecha, String codigo_producto, String nombre_producto, double precio_unitario, int cantidad, double descuento, double total, int id_ventas_general) {
        this.id_ventas_producto = id_ventas_producto;
        this.fecha = fecha;
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.total = total;
        this.id_ventas_general = id_ventas_general;
    }

    public int getId_ventas_producto() {
        return id_ventas_producto;
    }

    public void setId_ventas_producto(int id_ventas_producto) {
        this.id_ventas_producto = id_ventas_producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public int getId_ventas_general() {
        return id_ventas_general;
    }

    public void setId_ventas_general(int id_ventas_general) {
        this.id_ventas_general = id_ventas_general;
    }
    
    
}

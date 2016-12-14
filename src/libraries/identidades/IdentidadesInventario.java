/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries.identidades;

/**
 *
 * @author Ellet
 */
public class IdentidadesInventario {
    private int id_inventario;
    private String codigo_producto;
    private String nombre_producto;
    private String descripcion;
    private String tipo;
    private double precio_unitario;
    private int cantidad;
    private IdentidadesProveedores proveedores;

    public IdentidadesInventario(int id_inventario, String codigo_producto, String nombre_producto, String descripcion, String tipo, double precio_unitario, int cantidad, IdentidadesProveedores proveedores) {
        this.id_inventario = id_inventario;
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.proveedores = proveedores;
    }

    public IdentidadesInventario(String codigo_producto, String nombre_producto, String descripcion, String tipo, double precio_unitario, int cantidad, IdentidadesProveedores proveedores) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio_unitario = precio_unitario;
        this.cantidad = cantidad;
        this.proveedores = proveedores;
    }
     
    
      
    
    public int getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public IdentidadesProveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(IdentidadesProveedores proveedores) {
        this.proveedores = proveedores;
    }
    
    
    
}

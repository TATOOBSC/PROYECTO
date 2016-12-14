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
public class IdentidadesEmpleados {
    private int id_empleado;
    private String codigo_empleado;
    private String cedula;
    private String nombres_empleado;
    private String apellidos_empleado;
    private Date fechanacimiento;
    private String direccion;
    private String telefono;
    private IdentidadesUsers user;
    private IdentidadesCargos cargos; 

    public IdentidadesEmpleados(int id_empleado, String codigo_empleado, String cedula, String nombres_empleado, String apellidos_empleado, Date fechanacimiento, String direccion, String telefono, IdentidadesUsers user, IdentidadesCargos cargos) {
        this.id_empleado = id_empleado;
        this.codigo_empleado = codigo_empleado;
        this.cedula = cedula;
        this.nombres_empleado = nombres_empleado;
        this.apellidos_empleado = apellidos_empleado;
        this.fechanacimiento = fechanacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.user = user;
        this.cargos = cargos;
    }

    public IdentidadesEmpleados(String codigo_empleado, String cedula, String nombres_empleado, String apellidos_empleado, Date fechanacimiento, String direccion, String telefono, IdentidadesUsers user, IdentidadesCargos cargos) {
        this.codigo_empleado = codigo_empleado;
        this.cedula = cedula;
        this.nombres_empleado = nombres_empleado;
        this.apellidos_empleado = apellidos_empleado;
        this.fechanacimiento = fechanacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.user = user;
        this.cargos = cargos;
    }

    
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres_empleado() {
        return nombres_empleado;
    }

    public void setNombres_empleado(String nombres_empleado) {
        this.nombres_empleado = nombres_empleado;
    }

    public String getApellidos_empleado() {
        return apellidos_empleado;
    }

    public void setApellidos_empleado(String apellidos_empleado) {
        this.apellidos_empleado = apellidos_empleado;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public IdentidadesUsers getUser() {
        return user;
    }

    public void setUser(IdentidadesUsers user) {
        this.user = user;
    }

    public IdentidadesCargos getCargos() {
        return cargos;
    }

    public void setCargos(IdentidadesCargos cargos) {
        this.cargos = cargos;
    }
    
}



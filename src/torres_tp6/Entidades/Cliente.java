/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres_tp6.Entidades;

/**
 *
 * @author Jannete
 */
public class Cliente {
    String nombre;
    String apellido;
    String ciudad;
    String direccion;
    Long dni;

    public Cliente(String nombre, String apellido, String ciudad, String direccion, Long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public Long getDni() {
        return dni;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pgy.business;
import com.pgy.dataaccess.ClienteDA;
import com.pgy.dataaccess.CuentaDA;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.pgy.ui.*;
import javax.swing.JButton;

/**
 *
 * @author adsan
 */
public class Cliente {
    private int numeroSocio; // PK
    private String rut; // NOT NULL
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correo;
    private String domicilio;
    private String region;
    private String ciudad;
    private String comuna;
    private String telefono;

    public Cliente(){
    }
    
    public Cliente(int numeroSocio, String rut, String nombre, String apellidoPaterno, String apellidoMaterno,
                   String correo, String domicilio, String region, String ciudad, String comuna, String telefono) {
        
        
        this.numeroSocio = numeroSocio;
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.domicilio = domicilio;
        this.region = region;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.telefono = telefono;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Cliente obtenerCliente(String rut) throws SQLException{
        ResultSet rs = new ClienteDA().getCliente(rut);
        
        while (rs != null){
            this.rut = rs.getString("rut");
            this.numeroSocio = rs.getInt("numero_socio");
            this.apellidoMaterno = rs.getString("apellido_materno");
            this.apellidoPaterno = rs.getString("apellido_paterno");
            return this;
        }
        return null;
    }
    
    public Cuenta actualizarCliente(int numeroSocio,
                                    String nombre,
                                    String rut
                                    /*String apellidoPaterno,
                                    String apellidoMaterno,
                                    String comuna,
                                    String region,
                                    String telefono,
                                    String domicilio,
                                    String correo,
                                    String ciudad*/
    )throws Exception{
        System.out.println("nice");
    
        return null;
    
    }
    
    /*public Cliente obtener(int numero_socio){
        ResultSet rs = new ClienteDA().get(numero_socio);
        if(rs != null){
            try{
                if (rs.next()){
                    this.numeroSocio = numeroSocio;
                    this.rut = rut;
                    this.nombre = nombre;
                    this.apellidoPaterno = apellidoPaterno;
                    this.apellidoMaterno = apellidoMaterno;
                    this.correo = correo;
                    this.domicilio = domicilio;
                    this.region = region;
                    this.ciudad  = ciudad;
                    this.comuna = comuna;
                    this.telefono = telefono;
                    return this;
                }else{
                    return null;
                }
            }catch(Exception ex){
                System.out.println("Error al recuperar el producto:" + ex.getMessage());
                return null;
            }
        }else {return null; }
    }*/
    
}

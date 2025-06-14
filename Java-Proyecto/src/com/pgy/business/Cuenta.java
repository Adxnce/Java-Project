/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pgy.business;

import com.pgy.dataaccess.CuentaDA;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.pgy.dataaccess.ClienteDA;
import com.pgy.dataaccess.DBContext;
import com.pgy.business.Cliente;
/**
 *
 * @author adsan
 */
public class Cuenta extends Cliente{
    private ArrayList<Cuenta> cuentaArray;
    private int numeroSocio;
    private double valorCuota;
    private double cantidadAportada;

    public Cuenta(){
        super();
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public double getCantidadAportada() {
        return cantidadAportada;
    }

    public void setCantidadAportada(double cantidadAportada) {
        this.cantidadAportada = cantidadAportada;
    }
    
    public Cuenta obtenerCuenta(String rut)throws Exception{
        ResultSet rs = new CuentaDA().getCuenta(rut);
        while (rs != null){
            this.numeroSocio = rs.getInt("numero_socio");
            this.valorCuota = rs.getDouble("valor_socio");
            this.cantidadAportada = rs.getDouble("cantidad_aportada");
            return this;
        }return null;
    }
    
    public boolean girar (Double dato, String rut)throws Exception{
        ResultSet rs = new CuentaDA().getCuenta(rut);
        Double cantidadAportada = rs.getDouble("cantidad_aportada");
        
        while (rs != null){
            if (cantidadAportada >= dato && dato > 0){
            cantidadAportada = cantidadAportada - dato;
            return true;
            }
        }
        return true;
    }

    /*public boolean depositar(Double dato, Cuenta cuenta)throws Exception{
        ResultSet rsupdate = new CuentaDA().updateCuenta();
        Double cantidadAportada = rs.getDouble("cantidad_aportada");
        if (dato > 0){
            dato =  + dato;
            cuenta.setCantidadAportada(dato);
            return true;
        }
        return true;
    }*/
    
    
}

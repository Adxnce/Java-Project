/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pgy.dataaccess;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.pgy.business.Cuenta;
import java.sql.*;

/**
 *
 * @author adsan
 */
public class CuentaDA {
    
    public ResultSet getCuenta(String rut)throws Exception{
        DBContext dbCtx = new DBContext();
        String st = "SELECT cu.numero_socio, cu.valor_cuota, cu.cantidad_aportada FROM cuenta cu JOIN cliente c ON c.numero_socio = cu.numero_socio WHERE rut = ?";
        ResultSet rs;
        PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
        pst.setString(1, rut);
        rs = pst.executeQuery();
        return rs;
    }
    
    
    public int updateCuenta(Cuenta cuenta) {
        DBContext dbCtx = new DBContext();
        String st = "UPDATE cuenta cu JOIN cliente c ON c.numero_socio = cu.numero_socio SET cu.numero_socio = ?, cu.valor_socio = ?, cu.cantidad_aportada = ? WHERE rut = ? ";
        int rs;
        try{
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setInt(1, cuenta.getNumeroSocio());
            pst.setDouble(2, cuenta.getValorCuota());
            pst.setDouble(3, cuenta.getCantidadAportada());
            pst.setString(4, cuenta.getRut());
            rs = pst.executeUpdate();
            return rs;
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
            return 0;
        }
    }
    
    public int deleteCuenta(Cuenta cuenta){
        DBContext dbCtx = new DBContext();
        String st = "DELETE cu FROM cuenta cu JOIN cliente c ON cu.numero_socio = c.numero_socio WHERE rut = ?";
        int rs;
        try{
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setString(1, cuenta.getRut());
            rs = pst.executeUpdate();
            return rs;
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
            return 0;
        }
    }
    
    public int addCuenta(Cuenta cuenta){
        DBContext dBContext = new DBContext();
        String st = "INSERT cu INTO cuenta (numero_socio, valor_cuota, cantidad_aportada) VALUES (?, ?, ?)";
        int rs;
        try{
            PreparedStatement pst = dBContext.getConexion().prepareStatement(st);
            pst.setInt(1, cuenta.getNumeroSocio());
            pst.setDouble(2, cuenta.getValorCuota());
            pst.setDouble(3, cuenta.getCantidadAportada());
            rs = pst.executeUpdate();
            return rs;
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
            return 0;
        }
    }
}
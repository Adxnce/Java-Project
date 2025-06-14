package com.pgy.dataaccess;
import com.pgy.business.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.pgy.business.Cuenta;

public class ClienteDA {

    
    public ResultSet getCliente(String rut){
        DBContext dbCtx = new DBContext();
        String st = "SELECT numero_socio, rut, apellido_paterno, apellido_materno, correo, domicilio, region, ciudad, comuna, telefono FROM cliente WHERE rut = ?";
        ResultSet rs;
        try{
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setString(1, rut);
            rs = pst.executeQuery();
            return rs;
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }
    
    
    public int updateCliente(Cuenta cuenta) {
        DBContext dbCtx = new DBContext();
        String st = "UPDATE cliente SET numero_socio = ?, rut = ?, apellido_paterno = ?, apellido_materno = ?, correo = ?, domicilio = ?, region = ?, ciudad = ?, comuna = ?, telefono = ? WHERE rut = ? ";
        int rs;
        try{
            PreparedStatement pst = dbCtx.getConexion().prepareStatement(st);
            pst.setInt(1, cuenta.getNumeroSocio());
            pst.setString(2, cuenta.getRut());
            pst.setString(3, cuenta.getApellidoPaterno());
            pst.setString(4, cuenta.getApellidoMaterno());
            pst.setString(5, cuenta.getCorreo());
            pst.setString(6, cuenta.getDomicilio());
            pst.setString(7, cuenta.getRegion());
            pst.setString(8, cuenta.getCiudad());
            pst.setString(9, cuenta.getComuna());
            pst.setString(10, cuenta.getTelefono());
            pst.setInt(11, cuenta.getNumeroSocio());
            rs = pst.executeUpdate();
            return rs;
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
            return 0;
        }
    }
    
    public int deleteCliente(Cuenta cuenta){
        DBContext dbCtx = new DBContext();
        String st = "DELETE c FROM cliente c JOIN cuenta cu ON c.numero_socio = cu.numero_socio WHERE rut = ?";
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
    
    public int addCliente(Cuenta cuenta){
        DBContext dBContext = new DBContext();
        String st = "INSERT INTO cliente (numero_socio, rut, nombre, apellido_paterno, apellido_materno, correo, domicilio, region, ciudad, comuna, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int rs;
        try{
            PreparedStatement pst = dBContext.getConexion().prepareStatement(st);
            pst.setInt(1, cuenta.getNumeroSocio());
            pst.setString(2, cuenta.getRut());
            pst.setString(3, cuenta.getApellidoPaterno());
            pst.setString(4, cuenta.getApellidoMaterno());
            pst.setString(5, cuenta.getCorreo());
            pst.setString(6, cuenta.getDomicilio());
            pst.setString(7, cuenta.getRegion());
            pst.setString(8, cuenta.getCiudad());
            pst.setString(9, cuenta.getComuna());
            pst.setString(10, cuenta.getTelefono());
            pst.setInt(11, cuenta.getNumeroSocio());
            rs = pst.executeUpdate();
            return rs;
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
            return 0;
        }
    }
}

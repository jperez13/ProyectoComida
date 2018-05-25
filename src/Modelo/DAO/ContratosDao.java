/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Contrato;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author jackw
 */
public class ContratosDao {
    Conexion conn;
    
    public ContratosDao()
    {
        conn = new Conexion();
    }
    
    public boolean agregarContrato(String nombreEmpresa , int tipoContrato,
                                    String ruta)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall("{call contrato.pkg.prc_agregar_contrato(?,?,?)}");
            cs.setString(1, nombreEmpresa);
            cs.setInt(2, tipoContrato);
            cs.setString(3, ruta);
            cs.execute();
            return true;
            
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }        
        return true;
    }
    
    public boolean EliminarContrato(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        try {
            cs = (OracleCallableStatement)cn.prepareCall("{call contrato.pkg.prc_eliminar_contrato(?,?)}");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public Contrato buscarContrato(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        Contrato cont = new Contrato();
        try {
            cs = (OracleCallableStatement)cn.prepareCall(" { call contrato_pkg.prc_mostrar_contrato(?,?) } ");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            while (rs.next()) 
            {   
                cont.setId_contrato(rs.getInt("ID_CONTRATO"));
                cont.setId_convenio(rs.getInt("ID_CONVENIO"));
                cont.setId_tipo_contrato(rs.getInt("ID_TIPÖ_CONTRATO"));
                cont.setRuta(rs.getString("RUTA"));
            }   
        } catch (Exception mensaje) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, mensaje);
        }
        return cont;
    }
    
    public List<Contrato> listarContrato()
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        List<Contrato> contList = new ArrayList<>();
        Contrato cont = new Contrato();
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall(" { call contrato_pkg.prc_mostrar_todo(?) } ");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(1);
            
            while (rs.next()) 
            {
                cont.setId_contrato(rs.getInt("ID_CONTRATO"));
                cont.setId_convenio(rs.getInt("ID_CONVENIO"));
                cont.setId_tipo_contrato(rs.getInt("ID_TIPÖ_CONTRATO"));
                cont.setRuta(rs.getString("RUTA"));
                contList.add(cont);
            }
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return contList;         
    }
}

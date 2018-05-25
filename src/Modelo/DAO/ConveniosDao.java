/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Convenio;
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
public class ConveniosDao {
    Conexion conn;
    
    public ConveniosDao()
    {
        conn = new Conexion();
    }
    
    public boolean agregarConvenio(String nombreEmpresa , int estadoConvenio, 
                                    String tiempoInicio, String timpoTermino )
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall("{call convenio.pkg.prc_agregar_convenio(?,?,?,?)}");
            cs.setString(1, nombreEmpresa);
            cs.setInt(2, estadoConvenio);
            cs.setString(3, tiempoInicio);
            cs.setString(4, timpoTermino);
            
            cs.execute();
            return true;
            
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }        
        return true;
    }
    
    public boolean EliminarConvenio(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        try {
            cs = (OracleCallableStatement)cn.prepareCall("{call convenio.pkg.prc_eliminar_convenio(?,?)}");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public Convenio buscarConvenio(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        Convenio conv = new Convenio();
        try {
            cs = (OracleCallableStatement)cn.prepareCall(" { call convenio_pkg.prc_mostrar_convenio(?,?) } ");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            while (rs.next()) 
            {   
                conv.setId_convenio(rs.getInt("ID_CONVENIO"));
                conv.setNombre_empresa(rs.getString("NOMBRE_EMPRESA"));
                conv.setId_estado_conve(rs.getInt("ID_ESTADO_CONV"));
                conv.setTiempo_inicio(rs.getString("TIEMPO_INICIO"));
                conv.setTiempo_final(rs.getString("TIEMPO_FINAL"));
            }   
        } catch (Exception mensaje) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, mensaje);
        }
        return conv;
    }
    
    public List<Convenio> listarConvenio()
    {
        OracleCallableStatement cs = null;
        Connection cn =     conn.getCnn();
        ResultSet rs = null;
        List<Convenio> convList = new ArrayList<>();
        Convenio conv = new Convenio();
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall(" { call usuario_pkg.prc_mostrar_todo(?) } ");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(1);
            
            while (rs.next()) 
            {
                conv.setId_convenio(rs.getInt("ID_CONVENIO"));
                conv.setNombre_empresa(rs.getString("NOMBRE_EMPRESA"));
                conv.setId_estado_conve(rs.getInt("ID_ESTADO_CONV"));
                conv.setTiempo_inicio(rs.getString("TIEMPO_INICIO"));
                conv.setTiempo_final(rs.getString("TIEMPO_FINAL"));
                convList.add(conv);
            }
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return convList;         
    }
}

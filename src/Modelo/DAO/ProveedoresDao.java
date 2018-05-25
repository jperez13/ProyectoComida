/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Proveedor;
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
public class ProveedoresDao {
     Conexion conn;
    
    public ProveedoresDao()
    {
        conn = new Conexion();
    }
    
    public boolean agregarProveedor(String nombreProveedor  )
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall("{call proveedor.pkg.prc_agregar_proveedor(?)}");
            cs.setString(1, nombreProveedor);
            cs.execute();
            return true;
            
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }        
        return true;
    }
    
    public boolean eliminarProveedor(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        try {
            cs = (OracleCallableStatement)cn.prepareCall("{call proveedor.pkg.prc_eliminar_proveedor(?,?)}");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public Proveedor buscarProveedor(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        Proveedor pro = new Proveedor();
        try {
            cs = (OracleCallableStatement)cn.prepareCall(" { call proveedor_pkg.prc_mostrar_proveedor(?,?) } ");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            while (rs.next()) 
            {   
                pro.setId_proveedor(rs.getInt("ID_PROVEEDOR"));
                pro.setNombre_proveedor(rs.getString("NOMBRE_PROVEEDOR"));
            }   
        } catch (Exception mensaje) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, mensaje);
        }
        return pro;
    }
    
    public List<Proveedor> listarProveedor()
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        List<Proveedor> proList = new ArrayList<>();
        Proveedor pro = new Proveedor();
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall(" { call proveedor_pkg.prc_mostrar_todo(?,?) } ");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(1);
            
            while (rs.next()) 
            {
                pro.setId_proveedor(rs.getInt("ID_PROVEEDOR"));
                pro.setNombre_proveedor(rs.getString("NOMBRE_PROVEEDOR"));
                proList.add(pro);
            }
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return proList;         
    }
}

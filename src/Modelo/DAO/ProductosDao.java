/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Producto;
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
public class ProductosDao {

    Conexion conn;
    
    public ProductosDao()
    {
        conn = new Conexion();
    }
    
    public boolean agregarProducto(String nombre , int precio, 
                                    int minPreparacion,String ruta 
                                    ,int disponibilidad, String descripcion)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall("{call producto.pkg.prc_agregar_producto(?,?,?,?,?,?)}");
            cs.setString(1, nombre);
            cs.setInt(2, precio);
            cs.setInt(3, minPreparacion);
            cs.setString(4, ruta);
            cs.setInt(5, disponibilidad);
            cs.setString(6, descripcion);
            cs.execute();
            return true;
            
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }        
        return true;
    }
    
    public boolean EliminarProducto(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        try {
            cs = (OracleCallableStatement)cn.prepareCall("{call producto.pkg.prc_eliminar_producto(?,?)}");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public Producto buscarProducto(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        Producto pro = new Producto();
        try {
            cs = (OracleCallableStatement)cn.prepareCall(" { call producto_pkg.prc_mostrar_producto(?,?) } ");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            while (rs.next()) 
            {   
                pro.setId_producto(rs.getInt("ID_PRODUCTO"));
                pro.setNombre_producto(rs.getString("NOMBRE_PRODUCTO"));
                pro.setPrecio(rs.getInt("PRECIO"));
                pro.setMin_preparacion(rs.getInt("MIN_PREPARACION"));
                pro.setImagen(rs.getString("IMAGEN"));
                pro.setId_disponibilidad(rs.getInt("ID_DISPONIBILIDAD"));
                pro.setDescripcion(rs.getString("DESCRIPCION"));
            }   
        } catch (Exception mensaje) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, mensaje);
        }
        return pro;
    }
    
    public List<Producto> listarProducto()
    {
        OracleCallableStatement cs = null;
        Connection cn =     conn.getCnn();
        ResultSet rs = null;
        List<Producto> proList = new ArrayList<>();
        Producto pro = new Producto();
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall(" { call producto_pkg.prc_mostrar_todo(?) } ");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(1);
            
            while (rs.next()) 
            {
                 pro.setId_producto(rs.getInt("ID_PRODUCTO"));
                pro.setNombre_producto(rs.getString("NOMBRE_PRODUCTO"));
                pro.setPrecio(rs.getInt("PRECIO"));
                pro.setMin_preparacion(rs.getInt("MIN_PREPARACION"));
                pro.setImagen(rs.getString("IMAGEN"));
                pro.setId_disponibilidad(rs.getInt("ID_DISPONIBILIDAD"));
                pro.setDescripcion(rs.getString("DESCRIPCION"));
                proList.add(pro);
            }
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return proList;         
    }
}

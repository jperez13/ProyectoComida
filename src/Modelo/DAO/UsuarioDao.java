    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.*;

/**
 *
 * @author jackw
 */
public class UsuarioDao {
    
    Conexion conn;
    
    public UsuarioDao()
    {
        conn = new Conexion();
    }
    
    public boolean agregarUsuario(String nombreUsuario , String apellidoPaterno,
                                    String apellidoMaterno,
                                  String email,String password ,
                                  Convenio convenio , Rol rol )
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall("{call usuario.pkg.prc_agregar_usuario(?,?,?,?,?,?,?)}");
            cs.setString(1, nombreUsuario);
            cs.setString(2, apellidoPaterno);
            cs.setString(3, apellidoMaterno);
            cs.setString(4, email);
            cs.setString(5, password);
            cs.setObject(6, convenio);
            cs.setObject(7, rol);
            
            cs.execute();
            return true;
            
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }        
        return true;
    }
    
    public boolean EliminarUsuario(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        try {
            cs = (OracleCallableStatement)cn.prepareCall("{call usuario.pkg.prc_eliminar_usuario(?,?)}");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public Usuario buscarUsuario(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        Usuario usu = new Usuario();
        try {
            cs = (OracleCallableStatement)cn.prepareCall(" { call usuario_pkg.prc_mostrar_usuario(?,?) } ");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            while (rs.next()) 
            {   
                usu.setId_usuario(rs.getInt("ID_USUARIO"));
                usu.setNombre_usuario(rs.getString("NOMBRE_USUARIO"));
                usu.setApellido_paterno(rs.getString("APELLIDO_PATERNO"));
                usu.setApellido_materno(rs.getString("APELLIDO_MATERNO"));
                usu.setEmail(rs.getString("EMAIL"));
                usu.setTelefono(rs.getString("TELEFONO"));
                usu.setId_rol(rs.getInt("ROL_ID_ROL")); 
            }   
        } catch (Exception mensaje) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, mensaje);
        }
        return usu;
    }
    
    public List<Usuario> listarUSuario()
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        List<Usuario> usuList = new ArrayList<>();
        Usuario usu = new Usuario();
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall(" { call usuario_pkg.prc_mostrar_todo(?) } ");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(1);
            
            while (rs.next()) 
            {
                usu.setId_usuario(rs.getInt("ID_USUARIO"));
                usu.setNombre_usuario(rs.getString("NOMBRE_USUARIO"));
                usu.setApellido_paterno(rs.getString("APELLIDO_PATERNO"));
                usu.setApellido_materno(rs.getString("APELLIDO_MATERNO"));
                usu.setEmail(rs.getString("EMAIL"));
                usu.setTelefono(rs.getString("TELEFONO"));
                usu.setPassword(rs.getString("PASSWORD"));
                usu.setId_rol(rs.getInt("ROL_ID_ROL")); 
                usuList.add(usu);
            }
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return usuList;         
    }
}

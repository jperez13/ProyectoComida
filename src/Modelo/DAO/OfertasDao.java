/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Oferta;
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
public class OfertasDao {
    Conexion conn;
    
    public OfertasDao()
    {
        conn = new Conexion();
    }
    
    public boolean agregarOfertas(String tiempoInicio , String tiempoTermino, 
                                    int precioOferta )
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall("{call oferta.pkg.prc_agregar_oferta(?,?,?)}");
            cs.setString(1, tiempoInicio);
            cs.setString(2, tiempoTermino);
            cs.setInt(3, precioOferta);
            cs.execute();
            return true;
            
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }        
        return true;
    }
    
    public boolean EliminarOfertas(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        try {
            cs = (OracleCallableStatement)cn.prepareCall("{call oferta.pkg.prc_eliminar_oferta(?,?)}");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public Oferta buscarConvenio(int id)
    {
        OracleCallableStatement cs = null;
        Connection cn = conn.getCnn();
        ResultSet rs = null;
        Oferta ofer = new Oferta();
        try {
            cs = (OracleCallableStatement)cn.prepareCall(" { call oferta_pkg.prc_mostrar_oferta(?,?) } ");
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(2);
            
            while (rs.next()) 
            {   
                ofer.setId_oferta(rs.getInt("ID_OFERTA"));
                ofer.setTiempo_inicio(rs.getString("TIEMPO_INICIO"));
                ofer.setTiempo_termino(rs.getString("TIEMPO_TERMINO"));
                ofer.setPrecio(rs.getInt("PRECIO"));
            }   
        } catch (Exception mensaje) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, mensaje);
        }
        return ofer;
    }
    
    public List<Oferta> listarConvenio()
    {
        OracleCallableStatement cs = null;
        Connection cn =     conn.getCnn();
        ResultSet rs = null;
        List<Oferta> oferList = new ArrayList<>();
        Oferta ofer = new Oferta();
        try 
        {
            cs = (OracleCallableStatement)cn.prepareCall(" { call oferta_pkg.prc_mostrar_todo(?) } ");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            rs = (ResultSet) cs.getObject(1);
            
            while (rs.next()) 
            {
                ofer.setId_oferta(rs.getInt("ID_OFERTA"));
                ofer.setTiempo_inicio(rs.getString("TIEMPO_INICIO"));
                ofer.setTiempo_termino(rs.getString("TIEMPO_TERMINO"));
                ofer.setPrecio(rs.getInt("PRECIO"));
                oferList.add(ofer);
            }
        } catch (Exception e) 
        {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return oferList;         
    }
}

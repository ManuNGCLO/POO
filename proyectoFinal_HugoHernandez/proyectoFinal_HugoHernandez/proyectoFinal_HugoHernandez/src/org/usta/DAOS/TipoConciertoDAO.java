
package org.usta.DAOS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.usta.configuracion.conexion;
import org.usta.interfaces.OperacionesBasicas;
import org.usta.modelos.TipoConcierto;

public class TipoConciertoDao extends conexion implements OperacionesBasicas<TipoConcierto>{

    @Override
    public Boolean agregar(TipoConcierto miObjeto) {

        try {
            cadenaSql = "INSERT INTO tipos_conciertos(nombre_tipo_concierto) VALUES (?)";
            consulta= objConexion.prepareStatement(cadenaSql);
            consulta.setString(1, miObjeto.getNombreTipoConcierto());
            
           int filitas = consulta.executeUpdate();
           objConexion.close();
           return filitas>0;
           
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
      
    }

    @Override
    public List<TipoConcierto> consultar(String orden) {

        try {
            if (orden.equals("")){
                orden = "cod_tipo_concierto";
            }
            
            cadenaSql = "SELECT cod_tipo_concierto, nombre_tipo_concierto "
                    + "FROM tipos_conciertos ORDER BY " + orden;
            List<TipoConcierto> arregloTC = new ArrayList<>();
            consulta = objConexion.prepareStatement(cadenaSql);
            registro = consulta.executeQuery();
            while (registro.next()) {
                
                Integer codiguito = registro.getInt(1);
                String nombrecito = registro.getString(2);
                TipoConcierto obj = new TipoConcierto(codiguito, nombrecito);
                arregloTC.add(obj);
                
            }
            
            objConexion.close();
            return arregloTC;
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public Boolean eliminar(TipoConcierto miObjeto) {
        try {
            cadenaSql = " DELETE FROM tipos_conciertos WHERE cod_tipo_concierto = ?";
            consulta = objConexion.prepareStatement(cadenaSql);
            
            consulta.setInt(1, miObjeto.getCodTipoConcierto()); //inyeccion
            
            filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
            
        }       

    }

    @Override
    public Boolean actualizar(TipoConcierto miObjeto) {
    
        
        try {
            cadenaSql = "UPDATE tipos_conciertos SET nombre_tipo_concierto = ? "
                    + "WHERE cod_tipo_concierto = ?" ;
            consulta = objConexion.prepareStatement(cadenaSql);
            
            consulta.setString(1, miObjeto.getNombreTipoConcierto());
            consulta.setInt(2, miObjeto.getCodTipoConcierto());
            
            
            filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    
    
    }

    @Override
    public TipoConcierto buscar(Integer llavePrimaria) {
        
             try {
            cadenaSql = "SELECT t.cod_tipo_concierto, t.nombre_tipo_concierto "
                    + "FROM tipos_conciertos t WHERE t.cod_tipo_concierto=? ";

            consulta = objConexion.prepareStatement(cadenaSql);

            consulta.setInt(1, llavePrimaria);

            registro = consulta.executeQuery();

            TipoConcierto objEncontrada = null;

            if (registro.next()) {

                Integer codi1 = registro.getInt(1);
                String nom = registro.getString(2);
                

                objEncontrada = new TipoConcierto(codi1, nom);

            }
            objConexion.close();

            return objEncontrada;

        } catch (SQLException ex) {
            Logger.getLogger(TipoConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Integer cantidadFilas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

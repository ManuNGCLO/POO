package org.usta.DAOS;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.usta.configuracion.conexion;
import org.usta.interfaces.OperacionesBasicas;
import org.usta.modelos.Genero;

public class GeneroDao extends conexion implements OperacionesBasicas<Genero> {

    @Override
    public Boolean agregar(Genero miObjeto) {
       
         try {
            cadenaSql = "INSERT INTO generos(nombre_genero "
                    + ") VALUES (?)";
            consulta = objConexion.prepareStatement(cadenaSql);
            consulta.setString(1, miObjeto.getNombre_genero());
            


            int filitas = consulta.executeUpdate();
            objConexion.close();
            return filitas > 0;

        } catch (SQLException ex) {
            Logger.getLogger(ConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        
    }

    @Override
    public List<Genero> consultar(String orden) {

        try {
            if (orden.equals("")) {
                orden = "cod_genero";
            }

            cadenaSql = "SELECT cod_genero, nombre_genero "
                    + "FROM generos ORDER BY " + orden;
            List<Genero> arregloGC = new ArrayList<>();
            consulta = objConexion.prepareStatement(cadenaSql);
            registro = consulta.executeQuery();
            while (registro.next()) {

                Integer codiguito = registro.getInt(1);
                String nombrecito = registro.getString(2);
                Genero obj = new Genero(codiguito, nombrecito);
                arregloGC.add(obj);

            }

            objConexion.close();
            return arregloGC;

        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public Boolean eliminar(Genero miObjeto) {
       
         try {
            cadenaSql = " DELETE FROM generos WHERE cod_genero = ?";
            consulta = objConexion.prepareStatement(cadenaSql);
            
            consulta.setInt(1, miObjeto.getCod_genero()); //inyeccion
            
            filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
            
        }       
    }

    @Override
    public Boolean actualizar(Genero miObjeto) {
      
         try {
            cadenaSql = "UPDATE generos SET nombre_genero = ? "
                    + "WHERE cod_genero = ?" ;
            consulta = objConexion.prepareStatement(cadenaSql);
            
            consulta.setString(1, miObjeto.getNombre_genero());
            consulta.setInt(2, miObjeto.getCod_genero());
            
            
            filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    @Override
    public Genero buscar(Integer llavePrimaria) {
        
         try {
            cadenaSql = "SELECT g.cod_genero, g.nombre_genero "
                    + "FROM generos g WHERE g.cod_genero=? ";

            consulta = objConexion.prepareStatement(cadenaSql);

            consulta.setInt(1, llavePrimaria);

            registro = consulta.executeQuery();

            Genero objEncontrada = null;

            if (registro.next()) {

                Integer codi1 = registro.getInt(1);
                String nom = registro.getString(2);
                

                objEncontrada = new Genero(codi1, nom);

            }
            objConexion.close();

            return objEncontrada;

        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }

    @Override
    public Integer cantidadFilas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

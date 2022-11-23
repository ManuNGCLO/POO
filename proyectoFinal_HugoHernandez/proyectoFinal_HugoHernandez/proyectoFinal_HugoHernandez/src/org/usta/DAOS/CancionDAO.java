package org.usta.DAOS;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.usta.configuracion.conexion;
import org.usta.interfaces.OperacionesBasicas;
import org.usta.modelos.Cancion;
import org.usta.modelos.Genero;

public class CancionDAO extends  conexion implements OperacionesBasicas<Cancion>{

    @Override
    public Boolean agregar(Cancion miObjeto) {
  try {
            cadenaSql = "INSERT INTO canciones(nombre_cancion, "
                    + "cod_genero, fecha_publicacion_cancion) VALUES (?,?,?)";
            consulta = objConexion.prepareStatement(cadenaSql);
            consulta.setString(1, miObjeto.getNombre_cancion());
            consulta.setInt(2, miObjeto.getCod_genero_cancion().getCod_genero());

            long milisegundos = miObjeto.getFechapublicacion_cancion().getTime();
            Date fechaBien = new Date(milisegundos);
            consulta.setDate(3, fechaBien);

            int filitas = consulta.executeUpdate();
            objConexion.close();
            return filitas > 0;

        } catch (SQLException ex) {
            Logger.getLogger(CancionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }       
        
    }

    @Override
    public List<Cancion> consultar(String orden) {

        try {
            if (orden.equals("")) {
                orden = "c.cod_cancion";
            }

            cadenaSql = "SELECT c.cod_cancion, c.nombre_cancion, c.fecha_publicacion_cancion, "
                    + " gc.cod_genero, gc.nombre_genero "
                    + " FROM canciones c "
                    + "INNER JOIN generos gc "
                    + " ON c.cod_genero = gc.cod_genero "
                    + " ORDER BY " + orden;

            List<Cancion> arregloC = new ArrayList<>();
            consulta = objConexion.prepareStatement(cadenaSql);
            registro = consulta.executeQuery();
            while (registro.next()) {

                Integer codigo = registro.getInt(1);
                String nombre = registro.getString(2);
                Date fecha = registro.getDate(3);

                //********************************
                Integer codGenero = registro.getInt(4);
                String nomGenero= registro.getString(5);

                Genero objGeneroc = new Genero(codGenero, nomGenero);
                //********************************

                Cancion objC = new Cancion(codigo, nombre, fecha, objGeneroc);
                arregloC.add(objC);

            }

            objConexion.close();
            return arregloC;

        } catch (SQLException ex) {
            Logger.getLogger(CancionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        
    }

    @Override
    public Boolean eliminar(Cancion miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(Cancion miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cancion buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer cantidadFilas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    

}

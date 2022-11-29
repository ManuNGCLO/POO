package org.usta.DAOS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.usta.configuracion.conexion;
import org.usta.interfaces.OperacionesBasicas;
import org.usta.modelos.Artista;
import org.usta.modelos.ArtistaCancion;

public class ArtistaCancionDAO extends conexion implements OperacionesBasicas<ArtistaCancion> {

    @Override
    public Boolean agregar(ArtistaCancion miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ArtistaCancion> consultar(String orden) {

        try {
            if (orden.equals("")) {
                orden = "cod_artista";
            }

            cadenaSql = "SELECT a.cod_artista, a.nombre_completo_artista, a.condiciones_artista,  c.nombre_cancion, g.nombre_genero "
                    + "FROM artistas a"
                    + "INNER JOIN artistas_canciones ac ON ac.cod_artista = a.cod_artista "
                    + "INNER JOIN canciones c ON c.cod_cancion = ac.cod_cancion "
                    + "INNER JOIN generos g ON g.cod_genero = c.cod_genero "
                    + "WHERE a.cod_artista LIKE '?' "
                    + "ORDER BY " + orden;
            List<ArtistaCancion> arregloA = new ArrayList<>();
            consulta = objConexion.prepareStatement(cadenaSql);
            registro = consulta.executeQuery();
            while (registro.next()) {

                Integer codiguito = registro.getInt(1);
                String nombrecito = registro.getString(2);
                String condiciones = registro.getString(3);
                String nomCancion = registro.getString(4);
                String nomGenero = registro.getString(5);
                ArtistaCancion obj = new ArtistaCancion(codiguito, nombrecito, condiciones, nomCancion, nomGenero);
                arregloA.add(obj);

            }

            objConexion.close();
            return arregloA;

        } catch (SQLException ex) {
            Logger.getLogger(ArtistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public Boolean eliminar(ArtistaCancion miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(ArtistaCancion miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArtistaCancion buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer cantidadFilas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

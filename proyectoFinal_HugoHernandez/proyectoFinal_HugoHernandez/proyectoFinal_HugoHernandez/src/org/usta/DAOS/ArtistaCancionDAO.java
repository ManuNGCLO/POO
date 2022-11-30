package org.usta.DAOS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.usta.configuracion.conexion;
import org.usta.interfaces.OperacionesBasicas;
import org.usta.modelos.Artista;
import org.usta.modelos.ArtistaCancion;
import org.usta.modelos.Cancion;

public class ArtistaCancionDAO extends conexion implements OperacionesBasicas<ArtistaCancion> {

    @Override
    public Boolean agregar(ArtistaCancion miObjeto) {
        
        try {
            cadenaSql ="INSERT INTO artistas_canciones (cod_cancion ,cod_artista) VALUES(?,?)  ";
            consulta = objConexion.prepareStatement(cadenaSql);
            consulta.setInt(1,miObjeto.getCancion().getCod_cancion());
            consulta.setInt(2, miObjeto.getArtista().getCodArtista());
            int filas = consulta.executeUpdate();
            objConexion.close();
            return filas>0;
        } catch (SQLException ex) {
            Logger.getLogger(ArtistaCancionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public List<ArtistaCancion> consultar(String orden) {

        try {
            if (orden.equals("")) {
                orden = "a.cod_artista";
            }

            cadenaSql = "SELECT a.cod_artista, a.nombre_completo_artista, a.condiciones_artista,c.cod_cancion, c.nombre_cancion "
                    + "FROM artistas a "
                    + "INNER JOIN artistas_canciones ac ON ac.cod_artista = a.cod_artista "
                    + "INNER JOIN canciones c ON c.cod_cancion = ac.cod_cancion "
                    + "ORDER BY " + orden;
            
            List<ArtistaCancion> arregloA = new ArrayList<>();
            consulta = objConexion.prepareStatement(cadenaSql);
            registro = consulta.executeQuery();

            while (registro.next()) {

                Integer codiguito = registro.getInt(1);
                String nombrecito = registro.getString(2);
                String condiciones = registro.getString(3);
                Integer codigoC = registro.getInt(4);
                String nomCancion = registro.getString(5);

                Artista objA = new Artista(codiguito, nombrecito, condiciones);
                Cancion objC = new Cancion(codigoC , nomCancion, new Date(), null);
                ArtistaCancion objAC = new ArtistaCancion(objC, objA);
                arregloA.add(objAC);

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


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
import org.usta.modelos.Concierto;


import org.usta.modelos.ConciertoArtista;


public class ConciertoArtistaDAO extends conexion implements OperacionesBasicas<ConciertoArtista>{

    @Override
    public Boolean agregar(ConciertoArtista miObjeto) {
        
        try {
            cadenaSql ="INSERT INTO conciertos_artistas (cod_concierto ,cod_artista) VALUES(?,?)  ";
            consulta = objConexion.prepareStatement(cadenaSql);
            consulta.setInt(1,miObjeto.getConcierto().getCodConcierto());
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
    public List<ConciertoArtista> consultar(String orden) {
        
           try {
            if (orden.equals("")) {
                orden = "a.cod_artista";
            }

            cadenaSql = "SELECT a.cod_artista, a.nombre_completo_artista, a.condiciones_artista,co.cod_concierto, co.nombre_concierto "
                    + "FROM artistas a "
                    + "INNER JOIN conciertos_artistas ca ON ca.cod_artista = a.cod_artista "
                    + "INNER JOIN conciertos co ON co.cod_concierto = ca.cod_concierto "
                    + "ORDER BY " + orden;
            
            List<ConciertoArtista> arregloA = new ArrayList<>();
            consulta = objConexion.prepareStatement(cadenaSql);
            registro = consulta.executeQuery();

            while (registro.next()) {

                Integer codiguito = registro.getInt(1);
                String nombrecito = registro.getString(2);
                String condiciones = registro.getString(3);
                Integer codigoCo = registro.getInt(4);
                String nomConcierto = registro.getString(5);

                Artista objA = new Artista(codiguito, nombrecito, condiciones);
                Concierto objCo = new Concierto(codigoCo , nomConcierto, new Date(), null);
                ConciertoArtista objAC = new ConciertoArtista(objCo, objA);
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
    public Boolean eliminar(ConciertoArtista miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(ConciertoArtista miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ConciertoArtista buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer cantidadFilas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

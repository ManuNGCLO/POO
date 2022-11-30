
package org.usta.DAOS;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.usta.configuracion.conexion;
import org.usta.interfaces.OperacionesBasicas;
import org.usta.modelos.Artista;



public class ArtistaDAO extends conexion implements OperacionesBasicas<Artista>{

    @Override
    public Boolean agregar(Artista miObjeto) {
      
        try {
            cadenaSql = "INSERT INTO artistas(nombre_completo_artista, "
                    + "condiciones_artista) VALUES (?,?)";
            consulta = objConexion.prepareStatement(cadenaSql);
            consulta.setString(1, miObjeto.getNombreCompletoArtista());
            consulta.setString(2, miObjeto.getCondicionesArtista());

           

            int filitas = consulta.executeUpdate();
            objConexion.close();
            return filitas > 0;

        } catch (SQLException ex) {
            Logger.getLogger(ArtistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }       
        
        
    }

    @Override
    public List<Artista> consultar(String orden) {
        
         try {
            if (orden.equals("")){
                orden = "cod_artista";
            }
            
            cadenaSql = "SELECT cod_artista , nombre_completo_artista, condiciones_artista "
                    + " FROM artistas ORDER BY " + orden;
            List<Artista> arregloA = new ArrayList<>();
            consulta = objConexion.prepareStatement(cadenaSql);
            registro = consulta.executeQuery();
            while (registro.next()) {
                
                Integer codiguito = registro.getInt(1);
                String nombrecito = registro.getString(2);
                String condiciones = registro.getString(3);
                Artista obj = new Artista(codiguito, nombrecito,condiciones);
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
    public Boolean eliminar(Artista miObjeto) {
        
         try {
            cadenaSql = " DELETE FROM artistas WHERE cod_artista = ?";
            consulta = objConexion.prepareStatement(cadenaSql);
            
            consulta.setInt(1, miObjeto.getCodArtista()); //inyeccion
            
            filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ArtistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
            
        }       
        
    }

    @Override
    public Boolean actualizar(Artista miObjeto) {
       
         try {
            cadenaSql = "UPDATE artistas SET nombre_completo_artista = ? "
                    + ", condiciones_artista = ? "
                    + "WHERE cod_artista = ?" ;
            consulta = objConexion.prepareStatement(cadenaSql);
            
            consulta.setString(1, miObjeto.getNombreCompletoArtista());
            consulta.setString(2, miObjeto.getCondicionesArtista());
            consulta.setInt(3, miObjeto.getCodArtista());
            
            
            filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(ArtistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }

    @Override
    public Artista buscar(Integer llavePrimaria) {
       
         try {
            cadenaSql = "SELECT a.cod_artista, a.nombre_completo_artista, a.condiciones_artista "
                    + " FROM artistas a WHERE a.cod_artista=? ";

            consulta = objConexion.prepareStatement(cadenaSql);

            consulta.setInt(1, llavePrimaria);

            registro = consulta.executeQuery();

            Artista objEncontrada = null;

            if (registro.next()) {

                Integer codi1 = registro.getInt(1);
                String nom = registro.getString(2);
                String cond = registro.getString(3);
                

                objEncontrada = new Artista(codi1, nom, cond);

            }
            objConexion.close();

            return objEncontrada;

        } catch (SQLException ex) {
            Logger.getLogger(ArtistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }

    @Override
    public Integer cantidadFilas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

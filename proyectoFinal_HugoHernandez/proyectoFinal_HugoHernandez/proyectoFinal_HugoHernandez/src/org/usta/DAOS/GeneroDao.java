package org.usta.DAOS;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(Genero miObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Genero buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer cantidadFilas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

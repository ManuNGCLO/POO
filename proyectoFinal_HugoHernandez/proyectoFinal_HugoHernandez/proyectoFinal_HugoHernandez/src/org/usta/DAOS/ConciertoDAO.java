package org.usta.DAOS;

import java.sql.SQLException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import java.util.ArrayList;

import org.usta.configuracion.conexion;
import org.usta.interfaces.OperacionesBasicas;
import org.usta.modelos.Concierto;
import org.usta.modelos.TipoConcierto;

public class ConciertoDao extends conexion implements OperacionesBasicas<Concierto> {

    @Override
    public Boolean agregar(Concierto miObjeto) {

        try {
            cadenaSql = "INSERT INTO conciertos(nombre_concierto, "
                    + "cod_tipo_concierto, fecha_concierto) VALUES (?,?,?)";
            consulta = objConexion.prepareStatement(cadenaSql);
            consulta.setString(1, miObjeto.getNombreConcierto());
            consulta.setInt(2, miObjeto.getTipoConcierto().getCodTipoConcierto());

            long milisegundos = miObjeto.getFechaConcierto().getTime();
            Date fechaBien = new Date(milisegundos);
            consulta.setDate(3, fechaBien);

            int filitas = consulta.executeUpdate();
            objConexion.close();
            return filitas > 0;

        } catch (SQLException ex) {
            Logger.getLogger(ConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    @Override
    public List<Concierto> consultar(String orden) {

        try {
            if (orden.equals("")) {
                orden = "c.cod_concierto";
            }

            cadenaSql = "SELECT c.cod_concierto, c.nombre_concierto, c.fecha_concierto, "
                    + " tc.cod_tipo_concierto, tc.nombre_tipo_concierto "
                    + " FROM conciertos c "
                    + "INNER JOIN tipos_conciertos tc "
                    + " ON c.cod_tipo_concierto = tc.cod_tipo_concierto "
                    + " ORDER BY " + orden;

            List<Concierto> arregloC = new ArrayList<>();
            consulta = objConexion.prepareStatement(cadenaSql);
            registro = consulta.executeQuery();
            while (registro.next()) {

                Integer codigo = registro.getInt(1);
                String nombre = registro.getString(2);
                Date fecha = registro.getDate(3);

                //********************************
                Integer codTipo = registro.getInt(4);
                String nomTipo = registro.getString(5);

                TipoConcierto objTipoC = new TipoConcierto(codTipo, nomTipo);
                //********************************

                Concierto objC = new Concierto(codigo, nombre, fecha, objTipoC);
                arregloC.add(objC);

            }

            objConexion.close();
            return arregloC;

        } catch (SQLException ex) {
            Logger.getLogger(ConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public Boolean eliminar(Concierto miObjeto) {
        try {
            cadenaSql = "delete from conciertos where cod_concierto = ?";
            consulta = objConexion.prepareStatement(cadenaSql);
            consulta.setInt(1, miObjeto.getCodConcierto());
            
            filas = consulta.executeUpdate();
            objConexion.close();
            return filas > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Boolean actualizar(Concierto miObjeto) {

        try {
            cadenaSql = "UPDATE conciertos SET nombre_concierto = ?, cod_tipo_concierto = ?,"
                    + "fecha_concierto = ? "
                    + "WHERE cod_concierto = ?";

            consulta = objConexion.prepareStatement(cadenaSql);

            consulta.setString(1, miObjeto.getNombreConcierto());

            consulta.setInt(2, miObjeto.getTipoConcierto().getCodTipoConcierto());

            long milisegundos = miObjeto.getFechaConcierto().getTime();
            Date fechaBien = new Date(milisegundos);
            consulta.setDate(3, fechaBien);
            
            consulta.setInt(4, miObjeto.getCodConcierto());

            int filitas = consulta.executeUpdate();
            objConexion.close();
            return filitas > 0;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Concierto buscar(Integer llavePrimaria) {

        try {
            cadenaSql = "SELECT c.cod_concierto, c.nombre_concierto, c.fecha_concierto, "
                    + " tc.cod_tipo_concierto, tc.nombre_tipo_concierto "
                    + " FROM conciertos c "
                    + " INNER JOIN tipos_conciertos tc "
                    + " ON c.cod_tipo_concierto = tc.cod_tipo_concierto "
                    + " WHERE c.cod_concierto = ?";

            consulta = objConexion.prepareStatement(cadenaSql);

            consulta.setInt(1, llavePrimaria);

            registro = consulta.executeQuery();

            Concierto objEncontrado = null;

            if (registro.next()) {

                Integer codigo = registro.getInt(1);
                String nombre = registro.getString(2);
                Date fecha = registro.getDate(3);

                //********************************
                Integer codTipo = registro.getInt(4);
                String nomTipo = registro.getString(5);

                TipoConcierto objTipoC = new TipoConcierto(codTipo, nomTipo);
                //********************************

                objEncontrado = new Concierto(codigo, nombre, fecha, objTipoC);

            }
            objConexion.close();

            return objEncontrado;

        } catch (SQLException ex) {
            Logger.getLogger(TipoConciertoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    @Override
    public Integer cantidadFilas() {
        return null;
    }

}

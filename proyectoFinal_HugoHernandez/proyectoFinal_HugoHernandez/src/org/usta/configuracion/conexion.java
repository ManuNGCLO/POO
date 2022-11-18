
package org.usta.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class conexion {
    
    private String usuario;
    private String clave;
    private String url ;
    private String driver;
    
    protected Integer filas;    
    protected ResultSet registro;
    protected Connection objConexion;
    protected Integer cantidadRegistros;
    protected PreparedStatement consulta;
    protected String cadenaSql;

    public conexion() {
        
        usuario= "user_usuario";
        clave = "123456";
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/bd_proyectoFinal";
        
        activarConexion();
    }
    
    private void activarConexion(){
    
         try {
             Class.forName(driver);
             objConexion = DriverManager.getConnection(url, usuario, clave);
             System.out.println("Nos Conectamos pa");
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    
}

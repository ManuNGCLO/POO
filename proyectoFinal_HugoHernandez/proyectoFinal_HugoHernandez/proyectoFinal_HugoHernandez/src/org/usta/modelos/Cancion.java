package org.usta.modelos;

import java.util.Date;
import java.util.Objects;

public class Cancion {
    

    
    
    
    private Integer cod_cancion ;
    private String nombre_cancion ;
    private Date fecha_publicacion_cancion  ; 
    private Genero cod_genero_cancion;

    public Cancion() {
    }

    public Cancion(Integer cod_cancion, String nombre_cancion, Date fechapublicacion_cancion, Genero cod_genero_cancion) {
        this.cod_cancion = cod_cancion;
        this.nombre_cancion = nombre_cancion;
        this.fecha_publicacion_cancion = fechapublicacion_cancion;
        this.cod_genero_cancion = cod_genero_cancion;
    }

    public Integer getCod_cancion() {
        return cod_cancion;
    }

    public void setCod_cancion(Integer cod_cancion) {
        this.cod_cancion = cod_cancion;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    public Date getFechapublicacion_cancion() {
        return fecha_publicacion_cancion;
    }

    public void setFechapublicacion_cancion(Date fechapublicacion_cancion) {
        this.fecha_publicacion_cancion = fechapublicacion_cancion;
    }

    public Genero getCod_genero_cancion() {
        return cod_genero_cancion;
    }

    public void setCod_genero_cancion(Genero cod_genero_cancion) {
        this.cod_genero_cancion = cod_genero_cancion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "cod_cancion=" + cod_cancion + ", nombre_cancion=" + nombre_cancion + ", fechapublicacion_cancion=" + fecha_publicacion_cancion + ", cod_genero_cancion=" + cod_genero_cancion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.cod_cancion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        return Objects.equals(this.cod_cancion, other.cod_cancion);
    }
    
    
    
    
    

}

package org.usta.modelos;

import java.util.Objects;

public class Genero {

    private Integer cod_genero;
    private String nombre_genero;

    public Genero() {
    }

    public Genero(Integer cod_genero, String nombre_genero) {
        this.cod_genero = cod_genero;
        this.nombre_genero = nombre_genero;
    }

    public Integer getCod_genero() {
        return cod_genero;
    }

    public void setCod_genero(Integer cod_genero) {
        this.cod_genero = cod_genero;
    }

    public String getNombre_genero() {
        return nombre_genero;
    }

    public void setNombre_genero(String nombre_genero) {
        this.nombre_genero = nombre_genero;
    }

    @Override
    public String toString() {
        return "Genero{" + "cod_genero=" + cod_genero + ", nombre_genero=" + nombre_genero + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.cod_genero);
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
        final Genero other = (Genero) obj;
        return Objects.equals(this.cod_genero, other.cod_genero);
    }

    
    
}

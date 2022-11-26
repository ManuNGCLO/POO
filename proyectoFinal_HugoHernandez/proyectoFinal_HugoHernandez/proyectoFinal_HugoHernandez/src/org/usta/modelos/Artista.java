
package org.usta.modelos;

import java.util.Objects;


public class Artista {
    
    private Integer codArtista;
    private String nombreCompletoArtista;
    private String condicionesArtista;

    public Artista() {
    }

    public Artista(Integer codArtista, String nombreCompletoArtista, String condicionesArtista) {
        this.codArtista = codArtista;
        this.nombreCompletoArtista = nombreCompletoArtista;
        this.condicionesArtista = condicionesArtista;
    }

    public Integer getCodArtista() {
        return codArtista;
    }

    public void setCodArtista(Integer codArtista) {
        this.codArtista = codArtista;
    }

    public String getNombreCompletoArtista() {
        return nombreCompletoArtista;
    }

    public void setNombreCompletoArtista(String nombreCompletoArtista) {
        this.nombreCompletoArtista = nombreCompletoArtista;
    }

    public String getCondicionesArtista() {
        return condicionesArtista;
    }

    public void setCondicionesArtista(String condicionesArtista) {
        this.condicionesArtista = condicionesArtista;
    }

    @Override
    public String toString() {
        return "Artista{" + "codArtista=" + codArtista + ", nombreCompletoArtista=" + nombreCompletoArtista + ", condicionesArtista=" + condicionesArtista + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.codArtista);
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
        final Artista other = (Artista) obj;
        return Objects.equals(this.codArtista, other.codArtista);
    }
    
    
    
    
}

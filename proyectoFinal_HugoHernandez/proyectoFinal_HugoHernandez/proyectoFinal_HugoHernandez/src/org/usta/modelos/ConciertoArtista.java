
package org.usta.modelos;

import java.util.Objects;


public class ConciertoArtista {
    
    private Concierto concierto;
    private Artista artista;

    public ConciertoArtista() {
    }

    public ConciertoArtista(Concierto concierto, Artista artista) {
        this.concierto = concierto;
        this.artista = artista;
    }

    public Concierto getConcierto() {
        return concierto;
    }

    public void setConcierto(Concierto concierto) {
        this.concierto = concierto;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "ConciertoArtista{" + "concierto=" + concierto + ", artista=" + artista + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.concierto);
        hash = 67 * hash + Objects.hashCode(this.artista);
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
        final ConciertoArtista other = (ConciertoArtista) obj;
        if (!Objects.equals(this.concierto, other.concierto)) {
            return false;
        }
        return Objects.equals(this.artista, other.artista);
    }
    
    
    
}

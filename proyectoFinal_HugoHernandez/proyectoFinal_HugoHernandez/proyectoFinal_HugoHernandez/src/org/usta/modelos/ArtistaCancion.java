
package org.usta.modelos;

import java.util.Objects;

public class ArtistaCancion {
    
    private Cancion cancion;
    private Artista artista;    

    public ArtistaCancion() {
    }

    public ArtistaCancion(Cancion cancion, Artista artista) {
        this.cancion = cancion;
        this.artista = artista;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "ArtistasCanciones{" + "cancion=" + cancion + ", artista=" + artista + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cancion);
        hash = 97 * hash + Objects.hashCode(this.artista);
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
        final ArtistaCancion other = (ArtistaCancion) obj;
        if (!Objects.equals(this.cancion, other.cancion)) {
            return false;
        }
        return Objects.equals(this.artista, other.artista);
    }
    
       
}


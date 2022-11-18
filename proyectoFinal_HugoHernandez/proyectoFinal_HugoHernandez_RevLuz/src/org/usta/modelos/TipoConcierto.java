
package org.usta.modelos;


public class TipoConcierto {
    
    private Integer codTipoConcierto;
    private String nombreTipoConcierto;

    public TipoConcierto() {
    }

    public TipoConcierto(Integer codTipoConcierto, String nombreTipoConcierto) {
        this.codTipoConcierto = codTipoConcierto;
        this.nombreTipoConcierto = nombreTipoConcierto;
    }

    public Integer getCodTipoConcierto() {
        return codTipoConcierto;
    }

    public void setCodTipoConcierto(Integer codTipoConcierto) {
        this.codTipoConcierto = codTipoConcierto;
    }

    public String getNombreTipoConcierto() {
        return nombreTipoConcierto;
    }

    public void setNombreTipoConcierto(String nombreTipoConcierto) {
        this.nombreTipoConcierto = nombreTipoConcierto;
    }
    
    
    
}

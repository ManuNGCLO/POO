package org.usta.modelos;

import java.util.Date;


public class Concierto {

    private Integer codConcierto;    
    //private LocalTime horaConcierto;
    private String nombreConcierto;    
    private Date fechaConcierto;
    private TipoConcierto TipoConcierto; //llave foranea de tipo concierto
    //ponga aca la llave forane a ubicacion

    public Concierto() {
    }

    public Concierto(Integer codConcierto, String nombreConcierto, Date fechaConcierto, TipoConcierto TipoConcierto) {
        this.codConcierto = codConcierto;
        this.nombreConcierto = nombreConcierto;
        this.fechaConcierto = fechaConcierto;
        this.TipoConcierto = TipoConcierto;
    }

    public Integer getCodConcierto() {
        return codConcierto;
    }

    public void setCodConcierto(Integer codConcierto) {
        this.codConcierto = codConcierto;
    }

    public String getNombreConcierto() {
        return nombreConcierto;
    }

    public void setNombreConcierto(String nombreConcierto) {
        this.nombreConcierto = nombreConcierto;
    }

    public Date getFechaConcierto() {
        return fechaConcierto;
    }

    public void setFechaConcierto(Date fechaConcierto) {
        this.fechaConcierto = fechaConcierto;
    }

    public TipoConcierto getTipoConcierto() {
        return TipoConcierto;
    }

    public void setTipoConcierto(TipoConcierto TipoConcierto) {
        this.TipoConcierto = TipoConcierto;
    }

   

}

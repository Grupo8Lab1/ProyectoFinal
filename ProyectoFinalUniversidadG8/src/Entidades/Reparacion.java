package Entidades;

import java.time.LocalDate;

public class Reparacion {

    private int idReparacion;
    private Servicio servicio;
    private Bicicleta bicicleta;
    private LocalDate fechaEntrada;
    private float costoFinal;
    private boolean estado, activo;

    public Reparacion() {
    }

    public Reparacion(Servicio servicio, Bicicleta bicicleta, LocalDate fechaEntrada, float costoFinal, boolean estado, boolean activo) {
        this.servicio = servicio;
        this.bicicleta = bicicleta;
        this.fechaEntrada = fechaEntrada;
        this.costoFinal = costoFinal;
        this.estado = estado;
        this.activo = activo;
    }

    public Reparacion(int idReparacion, Servicio servicio, Bicicleta bicicleta, LocalDate fechaEntrada, float costoFinal, boolean estado, boolean activo) {
        this.idReparacion = idReparacion;
        this.servicio = servicio;
        this.bicicleta = bicicleta;
        this.fechaEntrada = fechaEntrada;
        this.costoFinal = costoFinal;
        this.estado = estado;
        this.activo = activo;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public float getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(float costoFinal) {
        this.costoFinal = costoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Reparacion{" + "idReparacion=" + idReparacion + ", servicio=" + servicio + ", bicicleta=" + bicicleta + ", fechaEntrada=" + fechaEntrada + ", costoFinal=" + costoFinal + ", estado=" + estado + ", activo=" + activo + '}';
    }

}

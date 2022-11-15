package Entidades;

import java.time.LocalDate;

public class Reparacion {

    private int idReparacion, idServicio, idUsuario, idBicicleta, idRepuestos;
    private LocalDate fechaEntrada;
    private float costoFinal;
    private boolean estado;

    public Reparacion() {
    }

    public Reparacion(int idReparacion, int idServicio, int idUsuario, int idBicicleta, int idRepuestos, LocalDate fechaEntrada, float costoFinal, boolean estado) {
        this.idReparacion = idReparacion;
        this.idServicio = idServicio;
        this.idUsuario = idUsuario;
        this.idBicicleta = idBicicleta;
        this.idRepuestos = idRepuestos;
        this.fechaEntrada = fechaEntrada;
        this.costoFinal = costoFinal;
        this.estado = estado;
    }

    public Reparacion(int idServicio, int idUsuario, int idBicicleta, int idRepuestos, LocalDate fechaEntrada, float costoFinal, boolean estado) {
        this.idServicio = idServicio;
        this.idUsuario = idUsuario;
        this.idBicicleta = idBicicleta;
        this.idRepuestos = idRepuestos;
        this.fechaEntrada = fechaEntrada;
        this.costoFinal = costoFinal;
        this.estado = estado;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdBicicleta() {
        return idBicicleta;
    }

    public void setIdBicicleta(int idBicicleta) {
        this.idBicicleta = idBicicleta;
    }

    public int getIdRepuestos() {
        return idRepuestos;
    }

    public void setIdRepuestos(int idRepuestos) {
        this.idRepuestos = idRepuestos;
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

    @Override
    public String toString() {
        return "Reparacion{" + "idReparacion=" + idReparacion + ", idServicio=" + idServicio + ", idUsuario=" + idUsuario + ", idBicicleta=" + idBicicleta + ", idRepuestos=" + idRepuestos + ", fechaEntrada=" + fechaEntrada + ", costoFinal=" + costoFinal + ", estado=" + estado + '}';
    }

}

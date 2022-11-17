package Entidades;

public class Servicio {

    private int codigo;
    private String descripcion;
    private float precio;
    private boolean activo;

    @Override
    public String toString() {
        return "Servicio{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", activo=" + activo + '}';
    }

    public Servicio(int codigo, String descripcion, float precio, boolean activo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;
    }

    public Servicio(String descripcion, float precio, boolean activo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;
    }

    public Servicio() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}

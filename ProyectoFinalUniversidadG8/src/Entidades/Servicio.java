package Entidades;

public class Servicio {

    private int codigo;
    private String descripcion;
    private float precio;

    public Servicio(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Servicio() {
    }

    public Servicio(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
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

    @Override
    public String toString() {
        return "Servicio{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
}

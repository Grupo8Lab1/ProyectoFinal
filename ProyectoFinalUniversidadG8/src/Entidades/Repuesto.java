package Entidades;

public class Repuesto {

    private int numSerie;
    private String descripcion;
    private float precio;

    @Override
    public String toString() {
        return "Repuesto{" + "numSerie=" + numSerie + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
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

    public Repuesto(int numSerie, String descripcion, float precio) {
        this.numSerie = numSerie;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Repuesto() {
    }

}

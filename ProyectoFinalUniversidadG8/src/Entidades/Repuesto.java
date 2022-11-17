package Entidades;

public class Repuesto {

    private int numSerie;
    private String descripcion;
    private float precio;
    private boolean activo;

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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Repuesto{" + "numSerie=" + numSerie + ", descripcion=" + descripcion + ", precio=" + precio + ", activo=" + activo + '}';
    }

    
    
    public Repuesto(int numSerie, String descripcion, float precio, boolean activo) {
        this.numSerie = numSerie;
        this.descripcion = descripcion;
        this.precio = precio;
        this.activo = activo;
    }

    public Repuesto() {
    }


}
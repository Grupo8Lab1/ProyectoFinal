package Entidades;

public class Bicicleta {

    private int numSerie;
    private String tipo, color;
    private Cliente dueño;
    private boolean activo;

    @Override
    public String toString() {
        return "Bicicleta{" + "numSerie=" + numSerie + ", tipo=" + tipo + ", color=" + color + ", due\u00f1o=" + dueño + ", activo=" + activo + '}';
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cliente getDueño() {
        return dueño;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Bicicleta() {
    }

    public Bicicleta(int numSerie, String tipo, String color, Cliente dueño, boolean activo) {
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.color = color;
        this.dueño = dueño;
        this.activo = activo;
    }

}

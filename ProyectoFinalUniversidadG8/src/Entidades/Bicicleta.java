package Entidades;

public class Bicicleta {

    private int numSerie;
    private String tipo, color;
    private Cliente dueño;

    @Override
    public String toString() {
        return "Bicicleta{" + "num_serie=" + numSerie + ", tipo=" + tipo + ", color=" + color + ", due\u00f1o=" + dueño + '}';
    }

    public int getNum_serie() {
        return numSerie;
    }

    public void setNum_serie(int num_serie) {
        this.numSerie = num_serie;
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

    public Bicicleta(int num_serie, String tipo, String color, Cliente dueño) {
        this.numSerie = num_serie;
        this.tipo = tipo;
        this.color = color;
        this.dueño = dueño;
    }

    public Bicicleta() {
    }

}

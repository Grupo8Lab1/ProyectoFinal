package Entidades;

public class Cliente {

    private String nombreCompleto, domicilio;
    private int dni, telefono;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String domicilio, int dni, int telefono) {
        this.nombreCompleto = nombreCompleto;
        this.domicilio = domicilio;
        this.dni = dni;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", domicilio=" + domicilio + ", dni=" + dni + ", telefono=" + telefono + '}';
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}

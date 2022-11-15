package Entidades;

public class ItemRepuesto {

    private int idItemRepuesto, numSerie, idReparacion, cantidad;

    public ItemRepuesto() {
    }

    public ItemRepuesto(int idItemRepuesto, int numSerie, int idReparacion, int cantidad) {
        this.idItemRepuesto = idItemRepuesto;
        this.numSerie = numSerie;
        this.idReparacion = idReparacion;
        this.cantidad = cantidad;
    }

    public ItemRepuesto(int numSerie, int idReparacion, int cantidad) {
        this.numSerie = numSerie;
        this.idReparacion = idReparacion;
        this.cantidad = cantidad;
    }

    public int getIdItemRepuesto() {
        return idItemRepuesto;
    }

    public void setIdItemRepuesto(int idItemRepuesto) {
        this.idItemRepuesto = idItemRepuesto;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ItemRepuesto{" + "idItemRepuesto=" + idItemRepuesto + ", numSerie=" + numSerie + ", idReparacion=" + idReparacion + ", cantidad=" + cantidad + '}';
    }
}

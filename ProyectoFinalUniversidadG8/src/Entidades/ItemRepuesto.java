package Entidades;

public class ItemRepuesto {

    private int idItemRepuesto, cantidad;
    private Repuesto repuesto;
    private Reparacion reparacion;

    public ItemRepuesto() {
    }

    @Override
    public String toString() {
        return "ItemRepuesto{" + "idItemRepuesto=" + idItemRepuesto + ", cantidad=" + cantidad + ", repuesto=" + repuesto + ", reparacion=" + reparacion + '}';
    }

    public ItemRepuesto(int idItemRepuesto, int cantidad, Repuesto repuesto, Reparacion reparacion) {
        this.idItemRepuesto = idItemRepuesto;
        this.cantidad = cantidad;
        this.repuesto = repuesto;
        this.reparacion = reparacion;
    }

    public ItemRepuesto(int cantidad, Repuesto repuesto, Reparacion reparacion) {
        this.cantidad = cantidad;
        this.repuesto = repuesto;
        this.reparacion = reparacion;
    }

    public int getIdItemRepuesto() {
        return idItemRepuesto;
    }

    public void setIdItemRepuesto(int idItemRepuesto) {
        this.idItemRepuesto = idItemRepuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
    }

    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

}

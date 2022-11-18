package Entidades;

public class ItemRepuesto {

    private int idItemRepuesto, cantidad;
    private boolean activo;
    private Repuesto repuesto;
    private Reparacion reparacion;

    public ItemRepuesto() {
    }

    public ItemRepuesto(int cantidad, boolean activo, Repuesto repuesto, Reparacion reparacion) {
        this.cantidad = cantidad;
        this.activo = activo;
        this.repuesto = repuesto;
        this.reparacion = reparacion;
    }

    public ItemRepuesto(int idItemRepuesto, int cantidad, boolean activo, Repuesto repuesto, Reparacion reparacion) {
        this.idItemRepuesto = idItemRepuesto;
        this.cantidad = cantidad;
        this.activo = activo;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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

    @Override
    public String toString() {
        return "ItemRepuesto{" + "idItemRepuesto=" + idItemRepuesto + ", cantidad=" + cantidad + ", activo=" + activo + ", repuesto=" + repuesto + ", reparacion=" + reparacion + '}';
    }

}

package Persistencia;

import Entidades.ItemRepuesto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ItemRepuestoData {

    private Connection con;

    public ItemRepuestoData() {
        this.con = Conexion.getConexion();
    }

    public void guardarItemRepuesto(ItemRepuesto irep) {
        String sql = "INSERT INTO itemrepuesto (id_itemrepuesto, num_serie, id_reparacion, cantidad, precio_item, activo) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, irep.getIdItemRepuesto());
            ps.setInt(2, irep.getRepuesto().getNumSerie());
            ps.setInt(3, irep.getReparacion().getIdReparacion());
            ps.setInt(4, irep.getCantidad());
            ps.setFloat(5, irep.getPrecioItem());
            ps.setBoolean(6, irep.isActivo());
            int agrego = ps.executeUpdate();//insert, update, delete
            String aviso;
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                irep.setIdItemRepuesto(rs.getInt(1));
            }
            if (agrego > 0) {
                aviso = "Se agregó el item correctamente";
            } else {
                aviso = "No se pudo agregar el item repuesto";
            }
            JOptionPane.showMessageDialog(null, aviso);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ItemRepuestoData Sentencia SQL erronea-guardarItemRepuesto");
        }
    }

    public ArrayList<ItemRepuesto> obtenerItemRepuestos() {

        ArrayList<ItemRepuesto> listaTemp = new ArrayList();
        RepuestoData rsd = new RepuestoData();
        ReparacionData rpd = new ReparacionData();
        String sql = "SELECT * FROM itemrepuesto WHERE activo = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                ItemRepuesto ir = new ItemRepuesto();

                ir.setIdItemRepuesto(rs.getInt("id_itemrepuesto"));
                ir.setRepuesto(rsd.obtenerRepuestoPorId(rs.getInt("id_repuesto")));
                ir.setReparacion(rpd.obtenerReparacionPorId(rs.getInt("id_reparacion")));
                ir.setCantidad(rs.getInt("cantidad"));
                ir.setPrecioItem(rs.getFloat("precio_item"));
                ir.setActivo(rs.getBoolean("activo"));

                listaTemp.add(ir);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ItemRepuestoData Sentencia SQL erronea-ObtenerItemRepuestos");
        }
        return listaTemp;
    }

    public ItemRepuesto obtenerItemRepuestoPorId(int idItemRepuesto) {
        String sql = "SELECT * FROM itemrepuesto WHERE activo = 1 AND id_itemrepuesto = ?";
        ItemRepuesto ir = new ItemRepuesto();
        RepuestoData rsd = new RepuestoData();
        ReparacionData rpd = new ReparacionData();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idItemRepuesto);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {

                ir.setIdItemRepuesto(rs.getInt("id_itemrepuesto"));
                ir.setRepuesto(rsd.obtenerRepuestoPorId(rs.getInt("id_repuesto")));
                ir.setReparacion(rpd.obtenerReparacionPorId(rs.getInt("id_reparacion")));
                ir.setCantidad(rs.getInt("cantidad"));
                ir.setPrecioItem(rs.getFloat("precio_item"));
                ir.setActivo(rs.getBoolean("activo"));

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ItemRepuestoData Sentencia SQL erronea-obtenerItemRepuestoPorId");
        }
        return ir;
    }

    public void borrarItemRepuesto(int idItemRepuesto) {
        String sql = "UPDATE itemrepuesto SET activo = 0 WHERE id_itemrepuesto = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idItemRepuesto);
            int borro = ps.executeUpdate(); //Update
            String aviso;
            if (borro > 0) {
                aviso = "Se elimino el Itemrepuesto correctamente";
            } else {
                aviso = "No se pudo eliminar el Itemrespuesto";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ItemRepuestoData Sentencia SQL erronea-borrarItemRepuesto");
        }
    }

    public void actualizaItemRepuesto(ItemRepuesto irep) {
        String sql = "UPDATE itemrepuesto SET id_itemrepuesto=?, num_serie=?, id_reparacion=?, cantidad =?, precio_item = ?, activo = ? WHERE id_itemrepuesto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, irep.getIdItemRepuesto());
            ps.setInt(2, irep.getRepuesto().getNumSerie());
            ps.setInt(3, irep.getReparacion().getIdReparacion());
            ps.setInt(4, irep.getCantidad());
            ps.setFloat(5, irep.getPrecioItem());
            ps.setBoolean(6, irep.isActivo());
            int actualizo = ps.executeUpdate(); //Update
            String aviso;
            if (actualizo > 0) {
                aviso = "Datos del Itemrepuesto actualizados correctamente";
            } else {
                aviso = "No se pudo actualizar el Itemrepuesto";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ItemRepuestoData Sentencia SQL erronea-actualizarItemRepuesto");
        }
    }

}

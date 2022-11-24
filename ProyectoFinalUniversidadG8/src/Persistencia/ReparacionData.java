package Persistencia;

import Entidades.Reparacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReparacionData {

    private Connection con;

    public ReparacionData() {
        this.con = Conexion.getConexion();
    }

    public void guardarReparacion(Reparacion reparacion) {
        String sql = "INSERT INTO reparacion (id_reparacion, id_bicicleta, fecha_entrada, costo_final, estado, activo) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, reparacion.getIdReparacion());
            ps.setInt(2, reparacion.getBicicleta().getNumSerie());
            ps.setDate(3, Date.valueOf(reparacion.getFechaEntrada()));
            ps.setFloat(4, reparacion.getCostoFinal());
            ps.setBoolean(5, reparacion.isEstado());
            ps.setBoolean(6, reparacion.isActivo());
            ps.executeUpdate();//insert, update, delete

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reparacion.setIdReparacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reparacion agregada exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ReparacionData Sentencia SQL erronea-guardarReparacion");
        }
    }

    public ArrayList<Reparacion> obtenerReparaciones() {

        ArrayList<Reparacion> listaTemp = new ArrayList();

        String sql = "SELECT * FROM reparacion WHERE activo= 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                BicicletaData bd = new BicicletaData();
                ServicioData sd = new ServicioData();

                Reparacion r = new Reparacion();

                r.setServicio(sd.obtenerServicioPorId(rs.getInt("id_servicio")));
                r.setBicicleta(bd.obtenerBicicletaPorId(rs.getInt("id_bicicleta")));
                r.setFechaEntrada(rs.getDate("fecha_entrada").toLocalDate());
                r.setCostoFinal(rs.getInt("costo_final"));
                r.setEstado(rs.getBoolean("estado"));
                r.setActivo(rs.getBoolean("activo"));

                listaTemp.add(r);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ReparacionData Sentencia SQL erronea-ObtenerReparaciones");
        }
        return listaTemp;
    }

    public Reparacion obtenerReparacionPorId(int id) {
        String sql = "SELECT * FROM reparacion WHERE activo= 1 AND id_reparacion = ?";
        Reparacion r = new Reparacion();
        BicicletaData bd = new BicicletaData();
        ServicioData sd = new ServicioData();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {
                r.setServicio(sd.obtenerServicioPorId(rs.getInt("id_servicio")));
                r.setBicicleta(bd.obtenerBicicletaPorId(rs.getInt("id_bicicleta")));
                r.setFechaEntrada(rs.getDate("fecha_entrada").toLocalDate());
                r.setCostoFinal(rs.getInt("costo_final"));
                r.setEstado(rs.getBoolean("estado"));
                r.setActivo(rs.getBoolean("activo"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ReparacionData Sentencia SQL erronea-obtenerReparacionPorId");
        }
        return r;
    }

    public void borrarReparacion(int idReparacion) {
        String sql = "UPDATE reparacion SET activo = 0 WHERE id_reparacion = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idReparacion);
            int agrego = ps.executeUpdate(); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Se elimino la reparacion correctamente";
            } else {
                aviso = "No se pudo eliminar la reparacion";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ReparacionData Sentencia SQL erronea-borrarReparacion");
        }
    }

    public void actualizarReparacion(Reparacion reparacion) {
        String sql = "UPDATE reparacion SET id_reparacion=?, id_bicicleta=?, fecha_entrada=?, costo_final=?, estado=?, activo=? WHERE id_reparacion=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reparacion.getIdReparacion());
            ps.setInt(2, reparacion.getBicicleta().getNumSerie());
            ps.setDate(3, Date.valueOf(reparacion.getFechaEntrada()));
            ps.setFloat(4, reparacion.getCostoFinal());
            ps.setBoolean(5, reparacion.isEstado());
            ps.setBoolean(6, reparacion.isActivo());
            int agrego = ps.executeUpdate(); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Datos de la reparacion actualizados correctamente";
            } else {
                aviso = "No se pudo actualizar la reparacion";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ReparacionData Sentencia SQL erronea-actualizarReparacion");
        }
    }

}

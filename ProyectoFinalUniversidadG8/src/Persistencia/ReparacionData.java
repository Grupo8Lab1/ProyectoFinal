package Persistencia;

import Entidades.Reparacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReparacionData {

    private Connection con;

    public ReparacionData() {
        this.con = Conexion.getConexion();
    }

    public void guardarReparacion(Reparacion reparacion) {
        String sql = "INSERT INTO reparación (id_reparacion, id_servicio, id_bicicleta, fecha_entrada, costo_final, estado, activo) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);

            ps.setInt(1, reparacion.getIdReparacion());
            ps.setInt(2, reparacion.getServicio().getCodigo());
            ps.setInt(3, reparacion.getBicicleta().getNumSerie());
            ps.setDate(4, Date.valueOf(reparacion.getFechaEntrada()));
            ps.setFloat(5, reparacion.getCostoFinal());
            ps.setBoolean(6, reparacion.isEstado());
            ps.setBoolean(7, reparacion.isActivo());

            int agrego = ps.executeUpdate();//insert, update, delete
            String aviso;

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reparacion.setIdReparacion(rs.getInt(1));
            }
            if (agrego > 0) {
                aviso = "Se agregó la reparación correctamente";
            } else {
                aviso = "No se pudo agregar la reparación";
            }
            JOptionPane.showMessageDialog(null, aviso);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ReparacionData Sentencia SQL erronea-guardarReparacion");
        }
    }

    public ArrayList<Reparacion> obtenerReparaciones() {

        ArrayList<Reparacion> listaTemp = new ArrayList();

        String sql = "SELECT * FROM reparación WHERE activo= 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                BicicletaData bd = new BicicletaData();
                ServicioData sd = new ServicioData();

                Reparacion r = new Reparacion();
                r.setIdReparacion(rs.getInt("id_reparacion"));
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
        String sql = "SELECT * FROM reparación WHERE activo= 1 AND id_reparacion = ?";

        Reparacion r = new Reparacion();
        BicicletaData bd = new BicicletaData();
        ServicioData sd = new ServicioData();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {
                r.setIdReparacion(rs.getInt("id_reparacion"));
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

    public ArrayList<Reparacion> obtenerReparacionesPorFecha(LocalDate fecha1, LocalDate fecha2) {
        String sql = "SELECT * FROM reparación WHERE activo= 1 AND (fecha_entrada BETWEEN '? 00:00:00' AND '? 00:00:00');";
        ArrayList<Reparacion> listaTemp = new ArrayList();
        System.out.println(sql);
        BicicletaData bd = new BicicletaData();
        ServicioData sd = new ServicioData();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println(fecha1);
            System.out.println(fecha2);
            ps.setDate(1, Date.valueOf(fecha1));
            ps.setDate(2, Date.valueOf(fecha2));
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reparacion r = new Reparacion();
                r.setIdReparacion(rs.getInt("id_reparacion"));
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
            JOptionPane.showMessageDialog(null, "ReparacionData Sentencia SQL erronea-obtenerReparacionPorFecha");
        }
        return listaTemp;
    }

    public void borrarReparacion(int idReparacion) {
        String sql = "UPDATE reparación SET activo = 0 WHERE id_reparacion = ?;";
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

    public void actualizarReparacion(Reparacion reparacion, int id) {
        String sql = "UPDATE reparación SET id_reparacion=?, id_servicio=?, id_bicicleta=?, fecha_entrada=?, costo_final=?, estado=?, activo=? WHERE id_reparacion=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reparacion.getIdReparacion());
            ps.setInt(2, reparacion.getServicio().getCodigo());
            ps.setInt(3, reparacion.getBicicleta().getNumSerie());
            ps.setDate(4, Date.valueOf(reparacion.getFechaEntrada()));
            ps.setFloat(5, reparacion.getCostoFinal());
            ps.setBoolean(6, reparacion.isEstado());
            ps.setBoolean(7, reparacion.isActivo());
            ps.setInt(8, id);
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

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
        String sql = "INSERT INTO cliente (idReparacion, bicicleta, fechaEntrada, costoFinal, estado, activo) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, reparacion.getIdReparacion());
            ps.setBicicleta(2, reparacion.getBicicleta());
            ps.setDate(3,Date.valueOf(reparacion.getFechaEntrada()));
            ps.setFloat(4, reparacion.getCostoFinal());
            ps.setBoolean(5, reparacion.isEstado());
            ps.setBoolean(6, reparacion.isActivo());
            ps.executeUpdate();//insert, update, delete

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reparacion.setIdReparacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reparacion agregado exitosamente");
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

                Reparacion c = new Reparacion();
                c.setServicio(rs.getInt("servicio"));
                c.setBicicleta(rs.getString("bicicleta"));
                c.setFechaEntrada(rs.getDate("Fecha").toLocalDate());
                c.setCostoFinal(rs.getInt("domicilio"));
                c.setEstado(rs.getBoolean("activo"));
                c.setActivo(rs.getBoolean("activo"));

                listaTemp.add(c);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-ObtenerClientes");
        }
        return listaTemp;
    }

    public Reparacion obtenerReparacionPorId(int dni) {
        String sql = "SELECT * FROM cliente WHERE activo= 1 AND idReparacion = ?";
        Reparacion c = new Reparacion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {
                c.setServicio(rs.getInt("servicio"));
                c.setBicicleta(rs.getString("bicicleta"));
                c.setFechaEntrada(rs.getDate("Fecha").toLocalDate());
                c.setCostoFinal(rs.getInt("domicilio"));
                c.setEstado(rs.getBoolean("activo"));
                c.setActivo(rs.getBoolean("activo"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ReparacionData Sentencia SQL erronea-obtenerReparacionPorId");
        }
        return c;
    }

    public void borrarReparacion(int idReparacion) {
        String sql = "UPDATE reparacion SET activo = 0 WHERE idReparacion = ?;";
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

    public void actualizarCliente(Reparacion reparacion) {
        String sql = "UPDATE Reparacion SET idReparacion=?, bicicleta=?, fecha_entrada=?, costo_final=?, estado=?, activo=? WHERE  idReparacion=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reparacion.getIdReparacion());
            ps.setBicicleta(2, reparacion.getBicicleta());
            ps.setDate(3, Date.valueOf( reparacion.getFechaEntrada()));
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

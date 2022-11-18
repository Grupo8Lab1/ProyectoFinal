package Persistencia;

import Entidades.Repuesto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RepuestoData {

    private Connection con;

    public RepuestoData() {
        this.con = Conexion.getConexion();
    }

    public void guardarRepuesto(Repuesto rep) {
        String sql = "INSERT INTO repuesto (num_serie, descripcion, precio, activo) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, rep.getNumSerie());
            ps.setString(2, rep.getDescripcion());
            ps.setFloat(3, rep.getPrecio());
            ps.setBoolean(5, rep.isActivo());
            ps.executeUpdate();//insert, update, delete

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                rep.setNumSerie(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Repuesto agregado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "RepuestoData Sentencia SQL erronea-guardarRepuesto");
        }
    }

    public ArrayList<Repuesto> obtenerRepuestos() {

        ArrayList<Repuesto> listaTemp = new ArrayList();

        String sql = "SELECT * FROM repuesto WHERE activo = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                Repuesto r = new Repuesto();

                r.setNumSerie(rs.getInt("num_serie"));
                r.setDescripcion(rs.getString("descripcion"));
                r.setPrecio(rs.getFloat("precio"));
                r.setActivo(rs.getBoolean("activo"));

                listaTemp.add(r);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "RepuestoData Sentencia SQL erronea-ObtenerRepuestos");
        }
        return listaTemp;
    }

    public Repuesto obtenerRepuestoPorId(int numSerie) {
        String sql = "SELECT * FROM repuesto WHERE activo = 1 AND num_serie = ?";
        Repuesto rep = new Repuesto();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numSerie);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {

                rep.setNumSerie(numSerie);
                rep.setDescripcion(rs.getString("descripcion"));
                rep.setPrecio(rs.getFloat("precio"));
                rep.setActivo(rs.getBoolean("activo"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "RepuestoData Sentencia SQL erronea-obtenerRepuestoPorId");
        }
        return rep;
    }

    public void borrarRepuesto(int numSerie) {
        String sql = "UPDATE repuesto SET activo = 0 WHERE num_serie = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numSerie);
            int borro = ps.executeUpdate(); //Update
            String aviso;
            if (borro > 0) {
                aviso = "Se elimino el repuesto correctamente";
            } else {
                aviso = "No se pudo eliminar el respuesto";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "RepuestoData Sentencia SQL erronea-borrarRepuesto");
        }
    }

    public void actualizaRepuesto(Repuesto rep) {
        String sql = "UPDATE repuesto SET num_serie=?, descripcion=?, precio=?, activo=? WHERE num_serie=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rep.getNumSerie());
            ps.setString(2, rep.getDescripcion());
            ps.setFloat(3, rep.getPrecio());
            ps.setBoolean(4, rep.isActivo());
            int actualizo = ps.executeUpdate(); //Update
            String aviso;
            if (actualizo > 0) {
                aviso = "Datos del repuesto actualizados correctamente";
            } else {
                aviso = "No se pudo actualizar el repuesto";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "RepuestoData Sentencia SQL erronea-actualizarRepuesto");
        }
    }

}

package Persistencia;

import Entidades.Bicicleta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BicicletaData {

    private Connection con;

    public BicicletaData() {
        this.con = Conexion.getConexion();
    }

    public void guardarBicicleta(Bicicleta bici) {
        String sql = "INSERT INTO bicicleta (num_serie, tipo, color, dni_dueño, activo) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, bici.getNumSerie());
            ps.setString(2, bici.getTipo());
            ps.setString(3, bici.getColor());
            ps.setInt(4, bici.getDueño().getDni());
            ps.setBoolean(5, bici.isActivo());
            ps.executeUpdate();//insert, update, delete

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                bici.setNumSerie(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Bicicleta agregada exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BicicletaData Sentencia SQL erronea-guardarBicicleta");
        }
    }

    public ArrayList<Bicicleta> obtenerBicicletas() {

        ArrayList<Bicicleta> listaTemp = new ArrayList();

        String sql = "SELECT * FROM bicileta WHERE activo = 1";
        Bicicleta b = new Bicicleta();
        ClienteData c = new ClienteData();

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                b.setNumSerie(rs.getInt("num_serie"));
                b.setTipo(rs.getString("tipo"));
                b.setColor(rs.getString("color"));
                b.setDueño(c.obtenerClientePorDni(rs.getInt("dni_dueño")));
                b.setActivo(rs.getBoolean("activo"));

                listaTemp.add(b);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BicicletaData Sentencia SQL erronea-ObtenerBicicletas");
        }
        return listaTemp;
    }

    public Bicicleta obtenerBicicletaPorId(int numSerie) {
        String sql = "SELECT * FROM bicicleta WHERE activo = 1 AND num_serie = ?";
        Bicicleta b = new Bicicleta();
        ClienteData c = new ClienteData();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numSerie);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {
                b.setNumSerie(rs.getInt("num_serie"));
                b.setTipo(rs.getString("tipo"));
                b.setColor(rs.getString("color"));
                b.setDueño(c.obtenerClientePorDni(rs.getInt("dni_dueño")));
                b.setActivo(rs.getBoolean("activo"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BicicletaData Sentencia SQL erronea-obtenerBicicletaPorId");
        }
        return b;
    }

    public void borrarBicicleta(int numSerie) {
        String sql = "UPDATE alumno SET activo = 0 WHERE num_serie = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numSerie);
            int borro = ps.executeUpdate(); //Update
            String aviso;
            if (borro > 0) {
                aviso = "Se elimino la bicicletacorrectamente";
            } else {
                aviso = "No se pudo eliminar la bicicleta";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BicicletaData Sentencia SQL erronea-borrarBicicleta");
        }
    }

    public void actualizaBicicleta(Bicicleta b) {
        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fecha_nacimiento=?, estado=? WHERE id_alumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, b.getNumSerie());
            ps.setString(2, b.getTipo());
            ps.setString(3, b.getColor());
            ps.setInt(4, b.getDueño().getDni());
            ps.setBoolean(5, b.isActivo());
            ps.executeUpdate();//insert, update, delete
            int actualizo = ps.executeUpdate(); //Update
            String aviso;
            if (actualizo > 0) {
                aviso = "Datos de la bicicleta actualizados correctamente";
            } else {
                aviso = "No se pudo actualizar la Bicicleta";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BicicletaData Sentencia SQL erronea-actualizarBicicleta");
        }
    }

}

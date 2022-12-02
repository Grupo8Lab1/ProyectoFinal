package Persistencia;

import Entidades.Bicicleta;
import Entidades.Cliente;
import java.sql.Connection;
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
            int agrego = ps.executeUpdate();//insert, update, delete
            String aviso;
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                bici.setNumSerie(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Bicicleta agregada exitosamente");
            }
            if (agrego > 0) {
                aviso = "Se agregó la bicicleta correctamente";
            } else {
                aviso = "No se pudo agregar la bicicleta";
            }
            JOptionPane.showMessageDialog(null, aviso);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BicicletaData Sentencia SQL erronea-guardarBicicleta");
        }
    }

    public ArrayList<Bicicleta> obtenerBicicletas() {

        ArrayList<Bicicleta> listaTemp = new ArrayList();

        String sql = "SELECT * FROM bicicleta WHERE activo = 1";
        ClienteData cd = new ClienteData();
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                Bicicleta b = new Bicicleta();
                b.setNumSerie(rs.getInt("num_serie"));
                b.setTipo(rs.getString("tipo"));
                b.setColor(rs.getString("color"));
                b.setDueño(cd.obtenerClientePorDni(rs.getInt("dni_dueño")));
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

    public ArrayList<Bicicleta> obtenerBicicletasPorCliente(Cliente dueño) {
        String sql = "SELECT * FROM bicicleta WHERE activo = 1 AND dni_dueño = ?";

        ArrayList<Bicicleta> listaTemp = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dueño.getDni());
            ResultSet rs = ps.executeQuery(); //Select
            while (rs.next()) {
                Bicicleta b = new Bicicleta();
                b.setDueño(dueño);
                b.setNumSerie(rs.getInt("num_serie"));
                b.setTipo(rs.getString("tipo"));
                b.setColor(rs.getString("color"));
                b.setActivo(rs.getBoolean("activo"));
                listaTemp.add(b);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BicicletaData Sentencia SQL erronea-obtenerBicicletaPorId");
        }
        return listaTemp;
    }

    public void borrarBicicleta(int numSerie) {
        String sql = "UPDATE bicicleta SET activo = 0 WHERE num_serie = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numSerie);
            int borro = ps.executeUpdate(); //Update
            String aviso;
            if (borro > 0) {
                aviso = "Se elimino la bicicleta correctamente";
            } else {
                aviso = "No se pudo eliminar la bicicleta";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BicicletaData Sentencia SQL erronea-borrarBicicleta");
        }
    }

    public void actualizaBicicleta(Bicicleta b, int numSerie) {
        String sql = "UPDATE bicicleta SET num_serie=?, tipo=?, color=?, dni_dueño=?, activo=? WHERE num_serie=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, b.getNumSerie());
            ps.setString(2, b.getTipo());
            ps.setString(3, b.getColor());
            ps.setInt(4, b.getDueño().getDni());
            ps.setBoolean(5, b.isActivo());
            ps.setInt(6, numSerie);

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

package Persistencia;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection con;

    public ClienteData() {
        this.con = Conexion.getConexion();
    }

    public void guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (dni, nombre, apellido, domicilio, telefono, activo) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setLong(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDomicilio());
            ps.setInt(5, cliente.getTelefono());
            ps.setBoolean(6, cliente.isActivo());
            ps.executeUpdate();//insert, update, delete

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cliente.setDni(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-guardarCliente");
        }
    }

    public ArrayList<Cliente> obtenerClientes() {

        ArrayList<Cliente> listaTemp = new ArrayList();

        String sql = "SELECT * FROM cliente WHERE activo= 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                Cliente c = new Cliente();

                c.setDni(rs.getInt("dni"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setDomicilio(rs.getString("domicilio"));
                c.setTelefono(rs.getInt("telefono"));
                c.setActivo(rs.getBoolean("activo"));

                listaTemp.add(c);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-ObtenerClientes");
        }
        return listaTemp;
    }

    public Cliente obtenerClientePorDni(int dni) {
        String sql = "SELECT * FROM cliente WHERE activo= 1 AND dni = ?";
        Cliente c = new Cliente();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {
                c.setDni(rs.getInt("dni"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setDomicilio(rs.getString("domicilio"));
                c.setTelefono(rs.getInt("telefono"));
                c.setActivo(rs.getBoolean("activo"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-obtenerClientePorDni");
        }
        return c;
    }
    
    public Cliente obtenerClienteConEstado0() {
        String sql = "SELECT * FROM cliente WHERE activo= 0";
        Cliente c = new Cliente();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); //Select
            if (rs.next()) {
                c.setDni(rs.getInt("dni"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setDomicilio(rs.getString("domicilio"));
                c.setTelefono(rs.getInt("telefono"));
                c.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-obtenerClienteconEstado0");
        }
        return c;
    }

    public void borrarCliente(int dni) {
        String sql = "UPDATE cliente SET activo = 0 WHERE dni = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int agrego = ps.executeUpdate(); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Se elimino el cliente correctamente";
            } else {
                aviso = "No se pudo eliminar el cliente";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-borrarCliente");
        }
    }

    public void actualizarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET dni=?, nombre=?, apellido=?, domicilio=?, telefono=?, activo=? WHERE dni=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDomicilio());
            ps.setInt(5, cliente.getTelefono());
            ps.setBoolean(6, cliente.isActivo());
            int agrego = ps.executeUpdate(); //Update
            String aviso;
            if (agrego > 0) {
                aviso = "Datos del cliente actualizados correctamente";
            } else {
                aviso = "No se pudo actualizar el cliente";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-actualizarCliente");
        }
    }

}

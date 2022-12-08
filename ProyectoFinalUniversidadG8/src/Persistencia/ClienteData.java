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
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDomicilio());
            ps.setInt(5, cliente.getTelefono());
            ps.setBoolean(6, cliente.isActivo());
            int agrego = ps.executeUpdate();//insert, update, delete

            String aviso;
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cliente.setDni(rs.getInt(1));
            }
            if (agrego > 0) {
                aviso = "Se agregó el cliente correctamente";
            } else {
                aviso = "No se pudo agregar al cliente";
            }
            JOptionPane.showMessageDialog(null, aviso);
            ps.close();
        } catch (SQLException ex) {
            if (ex.getLocalizedMessage().contains("Duplicate entry") && ex.getLocalizedMessage().contains("for key 'PRIMARY'")) {
                JOptionPane.showMessageDialog(null, "Error: Ya hay otro cliente registrado con este DNI.");
                JOptionPane.showMessageDialog(null, "Para actualizar datos o recuperar clientes borrados vaya a Actualizar datos.");
            } else {
                JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-guardarCliente");
            }

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
            if (obtenerClienteConEstado0(dni).getNombre() != null) {
                JOptionPane.showMessageDialog(null, "Este n° de documento pertenece a un cliente previamente borrado de nombre: " + obtenerClienteConEstado0(dni).getNombre() + " " + obtenerClienteConEstado0(dni).getApellido());
                if (JOptionPane.showConfirmDialog(null, "¿Desea recuperar los datos de este cliente?") == 0) {
                    Cliente aux = obtenerClienteConEstado0(dni);
                    aux.setActivo(true);
                    actualizarCliente(aux, dni);
                }
            }
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

    public Cliente obtenerClienteConEstado0(int dni) {
        String sql = "SELECT * FROM cliente WHERE activo= 0 AND dni = ?";
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
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-obtenerClienteBorrado");
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

    public void actualizarCliente(Cliente cliente, int dni) {
        String sql = "UPDATE cliente SET dni=?, nombre=?, apellido=?, domicilio=?, telefono=?, activo=? WHERE dni=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDomicilio());
            ps.setInt(5, cliente.getTelefono());
            ps.setBoolean(6, cliente.isActivo());
            ps.setInt(7, dni);
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

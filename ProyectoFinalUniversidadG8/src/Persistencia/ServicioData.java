package Persistencia;

import Entidades.Servicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ServicioData {

    private Connection con;

    public ServicioData() {
        this.con = Conexion.getConexion();
    }

    public void guardarServicio(Servicio serv) {
        String sql = "INSERT INTO servicio (codigo, descripcion, precio, activo) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, serv.getCodigo());
            ps.setString(2, serv.getDescripcion());
            ps.setFloat(3, serv.getPrecio());
            ps.setBoolean(4, serv.isActivo());
            int agrego = ps.executeUpdate();//insert, update, delete
            String aviso;
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                serv.setCodigo(rs.getInt(1));
            }
            if (agrego > 0) {
                aviso = "Se agregó el servicio correctamente";
            } else {
                aviso = "No se pudo agregar el servicio";
            }
            JOptionPane.showMessageDialog(null, aviso);
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ServicioData Sentencia SQL erronea-guardarServicio");
        }
    }

    public ArrayList<Servicio> obtenerServicios() {

        ArrayList<Servicio> listaTemp = new ArrayList();

        String sql = "SELECT * FROM servicio WHERE activo = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();//select

            while (rs.next()) {

                Servicio s = new Servicio();

                s.setCodigo(rs.getInt("codigo"));
                s.setDescripcion(rs.getString("descripcion"));
                s.setPrecio(rs.getFloat("precio"));
                s.setActivo(rs.getBoolean("activo"));

                listaTemp.add(s);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ServicioData Sentencia SQL erronea-ObtenerServicios");
        }
        return listaTemp;
    }

    public Servicio obtenerServicioPorId(int codigo) {
        String sql = "SELECT * FROM servicio WHERE activo = 1 AND codigo = ?";
        Servicio s = new Servicio();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery(); //Select

            if (rs.next()) {

                s.setCodigo(rs.getInt("codigo"));
                s.setDescripcion(rs.getString("descripcion"));
                s.setPrecio(rs.getFloat("precio"));
                s.setActivo(rs.getBoolean("activo"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ServicioData Sentencia SQL erronea-obtenerServicioPorId");
        }
        return s;
    }

    public void borrarServicio(int codigo) {
        String sql = "UPDATE servicio SET activo = 0 WHERE codigo = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            int borro = ps.executeUpdate(); //Update
            String aviso;
            if (borro > 0) {
                aviso = "Se elimino el servicio correctamente";
            } else {
                aviso = "No se pudo eliminar el servicio";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ServicioData Sentencia SQL erronea-borrarServicio");
        }
    }

    public void actualizaServicio(Servicio serv, int codigo) {
        String sql = "UPDATE servicio SET codigo=?, descripcion=?, precio=?, activo=? WHERE codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, serv.getCodigo());
            ps.setString(2, serv.getDescripcion());
            ps.setFloat(3, serv.getPrecio());
            ps.setBoolean(4, serv.isActivo());
            ps.setInt(5, codigo);
            int actualizo = ps.executeUpdate(); //Update
            String aviso;
            if (actualizo > 0) {
                aviso = "Datos del Servicio actualizados correctamente";
            } else {
                aviso = "No se pudo actualizar el servicio";
            }
            JOptionPane.showMessageDialog(null, aviso);

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ServicioData Sentencia SQL erronea-actualizarServicio");
        }
    }

}

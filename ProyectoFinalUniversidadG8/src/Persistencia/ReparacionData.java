package Persistencia;

import java.sql.Connection;

public class ReparacionData {

    private Connection con;

    public ReparacionData() {
        this.con = Conexion.getConexion();
    }

}

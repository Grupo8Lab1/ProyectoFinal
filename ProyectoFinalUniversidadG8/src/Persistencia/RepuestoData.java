/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;

/**
 *
 * @author tcnlu
 */
public class RepuestoData {

    private Connection con;

    public RepuestoData(Connection con) {
        this.con = Conexion.getConexion();
    }

}

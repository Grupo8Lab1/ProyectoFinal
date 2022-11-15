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
public class BicicletaData {

    private Connection con;

    public BicicletaData(Connection con) {
        this.con = Conexion.getConexion();
    }

}

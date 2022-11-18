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
public class ItemRepuestoData {

    private Connection con;

    public ItemRepuestoData() {
        this.con = Conexion.getConexion();
    }

}

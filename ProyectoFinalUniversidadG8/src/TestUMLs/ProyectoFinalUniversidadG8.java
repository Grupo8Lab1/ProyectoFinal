/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestUMLs;

import Entidades.Bicicleta;
import Entidades.Cliente;
import Entidades.Reparacion;
import Entidades.Repuesto;
import Entidades.Servicio;
import Persistencia.ClienteData;
import Persistencia.ReparacionData;
import Persistencia.RepuestoData;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProyectoFinalUniversidadG8 {

    public static ClienteData adata = new ClienteData();
    public static RepuestoData mdata = new RepuestoData();
    public static ReparacionData idata = new ReparacionData();
    public static ArrayList<Cliente> listaAlumnos;
    public static ArrayList<Reparacion> listaMaterias;

    public static void main(String[] args) {
//        JfIndex jf = new JfIndex();
//        jf.setVisible(true);
        Cliente c = new Cliente("Satiago","Lucero","B Cerro de la Cruz",43072560, 4562767,true);
        Repuesto r = new Repuesto(3, "Tornillo 10", 20, true);
        Servicio s = new Servicio(2, "Falta de hardware", 30, true);
        Bicicleta b = new Bicicleta(002, "MTB", "Verde", c, true);
        Reparacion e = new Reparacion(s,b, LocalDate.now(), 30, true, true);
        
        c.setActivo(false);
        r.getDescripcion();
        System.out.println(r.getDescripcion()+"");
        
     
    }
}

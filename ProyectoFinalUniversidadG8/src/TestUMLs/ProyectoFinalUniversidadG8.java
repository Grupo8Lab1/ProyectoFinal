/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestUMLs;

import Entidades.Bicicleta;
import Entidades.Cliente;
import Entidades.ItemRepuesto;
import Entidades.Reparacion;
import Entidades.Repuesto;
import Entidades.Servicio;
import Persistencia.BicicletaData;
import Persistencia.ClienteData;
import Persistencia.RepuestoData;
import Persistencia.ServicioData;
import java.time.LocalDate;

public class ProyectoFinalUniversidadG8 {

    /*  public static ClienteData adata = new ClienteData();
    public static RepuestoData mdata = new RepuestoData();
    public static ReparacionData idata = new ReparacionData();
    public static ArrayList<Cliente> listaAlumnos;
    public static ArrayList<Reparacion> listaMaterias;
     */
    public static void main(String[] args) {
//        JfIndex jf = new JfIndex();
//        jf.setVisible(true);
        Cliente c = new Cliente(40000, "Satiago", "Lucero", "B Cerro de la Cruz", 41111, true);
        Repuesto repu = new Repuesto(3, "Tornillo 10", 20f, true);
        Repuesto repu2 = new Repuesto(364, "Aceite de maquina", 200f, true);
        Servicio s = new Servicio("Falta de hardware", 30f, true);
        Bicicleta b = new Bicicleta(002, "MTB", "Verde", c, true);
        Reparacion repa = new Reparacion(s, b, LocalDate.now(), 30, true, true);
        ItemRepuesto ir = new ItemRepuesto(repu, repa, 10, 500f, true);

        ServicioData sd = new ServicioData();
        
        sd.guardarServicio(s);
        /*
        
        Funcionan: 
        
        - ClienteData:
        todos.
        
        - BicicletaData:
        Todos
        
        - RepuestoData:
        Todos
        
        - ServicioData:
        
        
         */
    }
}

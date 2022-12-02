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
import Persistencia.BicicletaData;
import Persistencia.ClienteData;
import Persistencia.ItemRepuestoData;
import Persistencia.ReparacionData;
import Persistencia.RepuestoData;
import Persistencia.ServicioData;
<<<<<<< Updated upstream
import java.util.ArrayList;
=======
import java.sql.Date;
import java.time.LocalDate;
>>>>>>> Stashed changes

public class ProyectoFinalUniversidadG8 {

        public static ClienteData cd = new ClienteData();
        public static BicicletaData bd = new BicicletaData();
        public static RepuestoData repud = new RepuestoData();
        public static ServicioData sd = new ServicioData();
        public static ItemRepuestoData irepud = new ItemRepuestoData();
        public static ReparacionData repad = new ReparacionData();
        public static ArrayList<Cliente> listaClientes;
        public static ArrayList<Bicicleta> listaBicicleta;
        public static ArrayList<Repuesto> listaRepuesto;
        public static ArrayList<Servicio> listaServicio;
        public static ArrayList<Reparacion> listaReparacion;
        
    public static void main(String[] args) {
        


        //NOTA: AGREGAR LA LIBRERIA DE mariadb-java-client.2.3.0.jar
<<<<<<< Updated upstream
       
=======
        /*  ClienteData cd = new ClienteData();
        BicicletaData bd = new BicicletaData();
        RepuestoData repud = new RepuestoData();
        ServicioData sd = new ServicioData();
        ItemRepuestoData irepud = new ItemRepuestoData();
         */ ReparacionData repad = new ReparacionData();
>>>>>>> Stashed changes

        /*System.out.println(cd.obtenerClientes());
        System.out.println(bd.obtenerBicicletas());
        System.out.println(repud.obtenerRepuestos());
        System.out.println(irepud.obtenerItemRepuestos());
        System.out.println(sd.obtenerServicios());
        System.out.println(repad.obtenerReparaciones());
         */
        LocalDate fecha = LocalDate.now();
        repad.obtenerReparacionesPorFecha(fecha.minusDays(5), fecha);

        /*
        
        Testing realizado con anterioridad, falta chequear la implementación de los ultimos metodos
        (Bicicleta por Cliente, repuesto por Descripcion, y reparacion por Fecha)
        
        Metodos basicos funcionando: 
        
        - ClienteData:
        todos.
        
        - BicicletaData:
        Todos
        
        - RepuestoData:
        Todos
        
        -ItemRepuestoData:
        
        Todos
        
        - ServicioData:
        Todos
        
        -ReparacionData:
        Todos
        
        
         */
    }
}

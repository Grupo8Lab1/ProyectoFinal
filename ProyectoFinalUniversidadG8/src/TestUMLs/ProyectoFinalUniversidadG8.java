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

import java.util.ArrayList;

import java.sql.Date;
import java.time.LocalDate;

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
        //    ClienteData cd = new ClienteData();
        //cd.borrarCliente(11223355);
         Cliente c = new Cliente(11223355, "Firu", "Lais", "La Cucha 700", 987654321, true);
        //Cliente c = new Cliente();
    cd.guardarCliente(c);

        //  System.out.println(cd.obtenerClientePorDni(11223355));

        /*   LocalDate fecha = LocalDate.now();
        System.out.println(repad.obtenerReparacionesPorFecha(fecha.minusDays(5), fecha));

        Reparacion r = new Reparacion(sd.obtenerServicioPorId(5), bd.obtenerBicicletaPorId(131325), fecha.minusDays(7), 5000, false, true);

        repad.guardarReparacion(r);

        System.out.println(repad.obtenerReparaciones());

        System.out.println(repad.obtenerReparacionesPorFecha(fecha.minusDays(5), fecha));
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

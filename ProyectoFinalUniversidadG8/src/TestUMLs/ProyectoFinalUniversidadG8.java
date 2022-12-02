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
import Persistencia.ItemRepuestoData;
import Persistencia.ReparacionData;
import Persistencia.RepuestoData;
import Persistencia.ServicioData;
import java.time.LocalDate;

public class ProyectoFinalUniversidadG8 {

    public static void main(String[] args) {

        //NOTA: AGREGAR LA LIBRERIA DE mariadb-java-client.2.3.0.jar
        ClienteData cd = new ClienteData();
        BicicletaData bd = new BicicletaData();
        RepuestoData repud = new RepuestoData();
        ServicioData sd = new ServicioData();
        ItemRepuestoData irepud = new ItemRepuestoData();
        ReparacionData repad = new ReparacionData();

        System.out.println(cd.obtenerClientes());
        System.out.println(bd.obtenerBicicletas());
        System.out.println(repud.obtenerRepuestos());
        System.out.println(irepud.obtenerItemRepuestos());
        System.out.println(sd.obtenerServicios());
        System.out.println(repad.obtenerReparaciones());

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

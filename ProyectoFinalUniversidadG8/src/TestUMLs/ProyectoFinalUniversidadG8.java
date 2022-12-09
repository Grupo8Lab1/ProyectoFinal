/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestUMLs;

import Persistencia.BicicletaData;
import Persistencia.ClienteData;
import Persistencia.ItemRepuestoData;
import Persistencia.ReparacionData;
import Persistencia.RepuestoData;
import Persistencia.ServicioData;
import Vistas.JFIndex;

public class ProyectoFinalUniversidadG8 {

    public static ClienteData cd = new ClienteData();
    public static BicicletaData bd = new BicicletaData();
    public static RepuestoData repud = new RepuestoData();
    public static ServicioData sd = new ServicioData();
    public static ItemRepuestoData irepud = new ItemRepuestoData();
    public static ReparacionData repad = new ReparacionData();

    public static void main(String[] args) {
        JFIndex jf = new JFIndex();
        jf.setVisible(true);

        /* for (int i = 0; i < 100; i++) {
            c++;
            System.out.println(repad.obtenerTodasLasReparaciones());
            System.out.println(c);
        }*/

        //NOTA: AGREGAR LA LIBRERIA DE mariadb-java-client.2.3.0.jar
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

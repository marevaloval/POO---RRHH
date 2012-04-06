/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.Empleado;

public class BDEmpleado {
    
    public ArrayList<Empleado> simulaDataEmpleados() {        
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado("Betty Párraga");
        Empleado empleado2 = new Empleado("Miguel Arévalo");
        Empleado empleado3 = new Empleado("Marcos Levano");
        Empleado empleado4 = new Empleado("Luis Caiguaraico");
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        return empleados;                        
    }    
    
}

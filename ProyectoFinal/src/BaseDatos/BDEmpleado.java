/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.Empleado;

public class BDEmpleado {

    static ArrayList<Empleado> arEmpleados = new ArrayList<Empleado>();    
    
    public static ArrayList<Empleado> simularDataEmpleados() {        
        return arEmpleados;
    }
    
    public static void agregarEmpleadoBD(Empleado empleado) {
        arEmpleados.add(empleado);
    }            
    
    public static void eliminarEmpleadoBD(Empleado empleado) {
        for (Empleado empleados : arEmpleados) {
            if (empleados == empleado) {
                arEmpleados.remove(empleado);
                return;
            }
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Empleado;
import modelos.Tarea;

public class AdmNotificacionUsuarios {
    
    public String notificacionTarea(String fecha, String empleado) {
        String postit="";
        for (Tarea objTareas : Empleado.getTareas(empleado)) {
            if (objTareas.getFechaVencimiento().equals(fecha)) {
                postit = objTareas.getNombreTarea()+"\n"+objTareas.getFechaVencimiento()+"\n"+objTareas.getFechaVencimiento();
                return postit;
            }
        }
        return "";
        
    }
    
    public int cantidadTareasEmpleado(String empleado) {
        return Empleado.getTareas(empleado).size();
    }
    
    
    
}

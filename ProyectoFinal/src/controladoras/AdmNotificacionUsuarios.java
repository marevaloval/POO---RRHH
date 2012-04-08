/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Usuario;
import modelos.Tarea;

public class AdmNotificacionUsuarios {
    
    public String notificacionTarea(String fecha, String empleado) {
        String postit="";
        for (Tarea objTareas : Usuario.getTareas(empleado)) {
            if (objTareas.getFechaVencimiento().equals(fecha)) {
                postit = objTareas.getNombreTarea()+"\n"+objTareas.getFechaVencimiento()+"\n"+objTareas.getFechaVencimiento();
                return postit;
            }
        }
        return "";
        
    }
    
    public int cantidadTareasEmpleado(String empleado) {
        return Usuario.getTareas(empleado).size();
    }
    
    
    
}

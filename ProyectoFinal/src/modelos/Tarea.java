/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Sebas
 */
public class Tarea {
    
    private String nombreTarea;
    private String fechaVencimiento;
    private String responsable;

    public Tarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }        
    
}

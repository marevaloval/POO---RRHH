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
    private boolean asignada;

    public Tarea(String nombreTarea, String fechaVencimiento, String responsable) {
        this.nombreTarea = nombreTarea;
        this.fechaVencimiento = fechaVencimiento;
        this.responsable = responsable;
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

    public boolean getAsignada() {
        return asignada;
    }

    public void setAsignada(boolean asignada) {
        this.asignada = asignada;
    }        
    
}

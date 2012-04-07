package modelos;

import BaseDatos.BDTareasGenerales;
import java.util.ArrayList;

public class TareasGenerales extends Tarea {
    
    private int numeroTareaGeneral;
    private String asunto;
    private String fechaVencimiento;
    private String responsable;
    private String comentario;
    private ArrayList<Empleado> arEmpleadoNotificacion;

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public TareasGenerales(int numeroTareaGeneral, String asunto, String fechaVencimiento, String responsable) {
        super("Tareas Generales");
        this.numeroTareaGeneral = numeroTareaGeneral;
        this.asunto = asunto;
        this.fechaVencimiento = fechaVencimiento;
        this.responsable = responsable;
        arEmpleadoNotificacion = new ArrayList<Empleado>();
    }
    
    public static ArrayList<TareasGenerales> getTareasGenerales() {
        return BDTareasGenerales.simularDataTareasGenerales();
    }
    
    public static void elminarTareaGeneral(TareasGenerales tareaGeneral) {
        BDTareasGenerales.eliminarTareasGeneralesBD(tareaGeneral);
    }

    public int getNumeroTareaGeneral() {
        return numeroTareaGeneral;
    }
    
    public void registrarEmpleadoNotificacion(Empleado empleado) {
        arEmpleadoNotificacion.add(empleado);
    }
    
    public void elminarEmpleadoNotificacion(Empleado empleado) {
        for (Empleado empleadoLista : arEmpleadoNotificacion) {
            if (empleadoLista == empleado) {
                arEmpleadoNotificacion.remove(empleado);
                return;
            }
        }
    }
    
    public ArrayList<Empleado> getEmpleadoNotificacion() {
        return arEmpleadoNotificacion;
    }        
    
}
package controladoras;

import java.util.ArrayList;
import modelos.Empleado;
import modelos.TareasGenerales;

public class AdmTareasGenerales {
    private ArrayList<TareasGenerales> dbTareas = new ArrayList<TareasGenerales>();
        
    public boolean verificarAsunto(String asunto) {
        if (asunto!=null) {
            return true;
        }
        return false;
    }

    public boolean verificarFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento!=null) {
            return true;
        }
        return false;
    }

    public boolean verificarResponsable(String responsable) {
        if (responsable!=null) {
            return true;
        }
        return false;
    }
    
    public TareasGenerales existeAsunto(String asunto) {
        TareasGenerales asuntoEncontrado = null;
        for (TareasGenerales tareasGenerales : dbTareas) {
            if (tareasGenerales.getAsunto().equals(asunto)) {
                asuntoEncontrado = tareasGenerales;
            }
        }
        return asuntoEncontrado;
    }
    
    // Registrar un usuario en una tarea general
    public void registrarTareaGeneral(int numeroTareaGeneral, Empleado usuario) {
        buscaTareaGeneral(numeroTareaGeneral).registrarEmpleadoNotificacion(usuario);
    }
    
    // Eliminar usuario en una tarea general
    public void eliminarUsuarioTareaGeneral(int numeroTareaGeneral, Empleado usuario) {
        buscaTareaGeneral(numeroTareaGeneral).elminarEmpleadoNotificacion(usuario);
    }
    
    // Cantidad de usuario en una tarea general
    public int cantidadUsuariosTareaGeneral(int numeroTareaGeneral) {
        return buscaTareaGeneral(numeroTareaGeneral).getEmpleadoNotificacion().size();
    }
    
    // Mostrar usuarios de una tarea general
    private ArrayList<Empleado> mostrarUsuariosTareaGeneral(int numeroTareaGeneral) {
        return buscaTareaGeneral(numeroTareaGeneral).getEmpleadoNotificacion();
    }    
    
    private TareasGenerales buscaTareaGeneral(int numeroTareaGeneral) {
        for (TareasGenerales objTareaGeneral : TareasGenerales.getTareasGenerales()) {
            if (objTareaGeneral.getNumeroTareaGeneral() == numeroTareaGeneral) {
                return objTareaGeneral;
            }
        }
        return null;
    }    
    
}
package controladoras;

import java.util.ArrayList;
import modelos.Usuario;
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
    public void registrarTareaGeneral(int numeroTareaGeneral, String usuario) {
        buscaTareaGeneral(numeroTareaGeneral).registrarUsuariosNotificacion(usuario);
    }
    
    // Eliminar usuario en una tarea general
    public void eliminarUsuarioTareaGeneral(int numeroTareaGeneral, String usuario) {
        buscaTareaGeneral(numeroTareaGeneral).elminarUsuariosNotificacion(usuario);
    }
    
    // Cantidad de usuario en una tarea general
    public int cantidadUsuariosTareaGeneral(int numeroTareaGeneral) {
        return buscaTareaGeneral(numeroTareaGeneral).getUsuarioNotificacion().size();
    }
    
    // Mostrar usuarios de una tarea general
    private ArrayList<Usuario> mostrarUsuariosTareaGeneral(int numeroTareaGeneral) {
        return buscaTareaGeneral(numeroTareaGeneral).getUsuarioNotificacion();
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
package controladoras;

import java.util.ArrayList;
import modelos.DeclaracionesJuradas;
import modelos.Usuario;
import modelos.TareasGenerales;

public class AdmTareasGenerales {
    
    public void registrarTareaGeneral(int numeroTareaGeneral, String asunto, String fechaVencimiento, String responsable) {
        if (verificarAsunto(asunto) == false) {
            return;
        }
        if (verificarFechaVencimiento(fechaVencimiento) == false) {
            return;
        }        
        if (verificarResponsable(responsable) == false) {
            return;
        }               
        TareasGenerales objTareasGenerales = new TareasGenerales(numeroTareaGeneral, asunto, fechaVencimiento, responsable);        
    }
    
    public void eliminarTareaGeneral(int numeroTareaGeneral) {        
        TareasGenerales.elminarTareaGeneral(numeroTareaGeneral);
    }
    
    public int cantidadTareasGenerales() {
        return TareasGenerales.getTareasGenerales().size();
    }
        
    public boolean verificarAsunto(String asunto) {
        if (asunto.equals("") || asunto == null) {
            return false;
        }
        return true;
    }

    public boolean verificarFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento.equals("") || fechaVencimiento == null) {
            return false;
        }
        return true;
    }

    public boolean verificarResponsable(String responsable) {
        if (responsable.equals("") || responsable == null) {
            return false;
        }
        return true;
    }
    
    public void registrarUsuarioTareaGeneral(int numeroTareaGeneral, String usuario) {
        buscaTareaGeneral(numeroTareaGeneral).registrarUsuariosNotificacion(usuario);
    }
    
    public void eliminarUsuarioTareaGeneral(int numeroTareaGeneral, String usuario) {
        buscaTareaGeneral(numeroTareaGeneral).elminarUsuariosNotificacion(usuario);
    }
    
    public int cantidadUsuariosTareaGeneral(int numeroTareaGeneral) {
        return buscaTareaGeneral(numeroTareaGeneral).getUsuarioNotificacion().size();
    }
    
    // Mostrar usuarios de una declaración jurada
    private ArrayList<Usuario> mostrarUsuariosTareaGeneral(int numeroTareaGeneral) {
        return buscaTareaGeneral(numeroTareaGeneral).getUsuarioNotificacion();
    }
    
    /*// Mostrar usuarios de una tarea general
    private ArrayList<Usuario> mostrarUsuariosTareaGeneral(int numeroTareaGeneral) {
        return buscaTareaGeneral(numeroTareaGeneral).getUsuarioNotificacion();
    } */   
    
    private TareasGenerales buscaTareaGeneral(int numeroTareaGeneral) {
        for (TareasGenerales objTareaGeneral : TareasGenerales.getTareasGenerales()) {
            if (objTareaGeneral.getNumeroTareaGeneral() == numeroTareaGeneral) {
                return objTareaGeneral;
            }
        }
        return null;
    }    
    
}
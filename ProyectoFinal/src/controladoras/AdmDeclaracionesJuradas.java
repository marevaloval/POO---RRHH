package controladoras;

import java.util.ArrayList;
import modelos.DeclaracionesJuradas;

public class AdmDeclaracionesJuradas {
    
    private ArrayList<DeclaracionesJuradas> arDeclaraciones = new ArrayList<DeclaracionesJuradas>();    
    
    // Registrar una nueva declaración jurada
    public void registrarDeclaracionJurada(int numeroDeclaracionJurada, String responsable, String motivo, String fechaVencimiento) {
        if (verificarResponsable(responsable) == false) {
            return;
        }
        if (verificarMotivo(motivo) == false) {
            return;
        }
        if (verificarFechaVencimiento(fechaVencimiento) == false) {
            return;
        }                
        DeclaracionesJuradas objDeclaracionJurada = new DeclaracionesJuradas(numeroDeclaracionJurada, responsable, motivo, fechaVencimiento);
        arDeclaraciones.add(objDeclaracionJurada);
    }
    
    // Eliminar declaración jurada
    public void eliminarDeclaracionJurada(int numeroDeclaracionJurada) {
        arDeclaraciones.remove(buscaDeclaracionJurada(numeroDeclaracionJurada));
    }
    
    // Cantidad de declaraciones juradas
    public int cantidadDeclaracionesJuradas() {
        return arDeclaraciones.size();
    }        
    
    // Registrar un usuario en una declaración jurada
    public void registrarUsuarioDeclaracionJurada(int numeroDeclaracionJurada, String usuario) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).registrarUsuario(usuario);
    }
    
    // Eliminar usuario de declaración jurada
    public void eliminarUsuarioDeclaracionJurada(int numeroDeclaracionJurada, String usuario) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).elminarUsuario(usuario);
    }
    
    // Cantidad de usuario por declaración jurada
    public int cantidadUsuariosDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getUsuarios().size();
    }
    
    private DeclaracionesJuradas buscaDeclaracionJurada(int numero) {
        for (DeclaracionesJuradas objDC : arDeclaraciones) {
            if (objDC.getNumero() == numero) {
                return objDC;
            }
        }
        return null;
    }
    
    // Valida que el campo Responsable no sea vacío
    private boolean verificarResponsable(String responsable) {
        if (responsable != null) {
            return true;
        }
        return false;
    }

    // Valida que el campo Motivo no sea vacío
    private boolean verificarMotivo(String motivo) {
        if (motivo != null) {
            return true;
        }
        return false;
    }

    // Valida que el campo Fecha de Vencimiento no sea vacío
    private boolean verificarFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento!=null) {
            return true;
        }
        return false;
    }
}

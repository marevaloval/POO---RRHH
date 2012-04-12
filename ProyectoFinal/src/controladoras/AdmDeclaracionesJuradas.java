package controladoras;

import java.util.ArrayList;
import modelos.DeclaracionesJuradas;
import modelos.Usuario;

public class AdmDeclaracionesJuradas {    
    
    // Registrar una nueva declaración jurada
    public void registrarDeclaracionJurada(int numeroDeclaracionJurada, String responsable, String motivo, String fechaVencimiento) {
        if (verificarNumeroDeclaraionJurada(numeroDeclaracionJurada) == false) {
            return;
        }        
        if (verificarResponsable(responsable) == false) {
            return;
        }
        if (verificarMotivo(motivo) == false) {
            return;
        }
        if (verificarFechaVencimiento(fechaVencimiento) == false) {
            return;
        }                
        DeclaracionesJuradas objDeclaracionJurada = new DeclaracionesJuradas(numeroDeclaracionJurada, fechaVencimiento, responsable);
    }
    
    // Eliminar declaración jurada
    public void eliminarDeclaracionJurada(int numeroDeclaracionJurada) {        
        DeclaracionesJuradas.elminarDeclaracionJurada(numeroDeclaracionJurada);
    }
    
    // Cantidad de declaraciones juradas
    public int cantidadDeclaracionesJuradas() {
        return DeclaracionesJuradas.getDeclaracionesJuradas().size();
    }
    
    // Registrar un usuario en una declaración jurada
    public void registrarUsuarioDeclaracionJurada(int numeroDeclaracionJurada, String usuario) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).registrarUsuariosNotificacion(usuario);
    }
    
    // Eliminar usuario en una declaración jurada
    public void eliminarUsuarioDeclaracionJurada(int numeroDeclaracionJurada, String usuario) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).elminarUsuariosNotificacion(usuario);
    }
    
    // Cantidad de usuario en una declaración jurada
    public int cantidadUsuariosDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getUsuarioNotificacion().size();
    }
    
    // Mostrar usuarios de una declaración jurada
    private ArrayList<Usuario> mostrarUsuariosDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getUsuarioNotificacion();
    }
    
    private DeclaracionesJuradas buscaDeclaracionJurada(int numero) {
        for (DeclaracionesJuradas declaracionesJuradas : DeclaracionesJuradas.getDeclaracionesJuradas()) {
            if (declaracionesJuradas.getNumero() == numero) {
                return declaracionesJuradas;
            }
        }
        return null;
    }
    
    // Valida que el número de declaración jurada no sea cero
    private boolean verificarNumeroDeclaraionJurada(int numeroDeclaracionJurada) {
        if (numeroDeclaracionJurada == 0) {
            return false;
        }
        return true;
    }
    
    // Valida que el campo Responsable no sea vacío
    private boolean verificarResponsable(String responsable) {
        if (responsable.equals("")) {
            return false;
        }
        return true;
    }

    // Valida que el campo Motivo no sea vacío
    private boolean verificarMotivo(String motivo) {
        if (motivo.equals("")) {
            return false;
        }
       return true;
    }

    // Valida que el campo Fecha de Vencimiento no sea vacío
    private boolean verificarFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento.equals("")) {
            return false;
        }
        return true;
    }    
    
    // Devuelve el responsable en una declaración jurada
    public String mostrarResponsableDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getResponsable();
    }
    
    // Devuelve el motivo en una declaración jurada
    public String mostrarMotivoDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getMotivo();
    }    
    
    // Devuelve la fecha de vencimiento en una declaración jurada
    public String mostrarFechaVencimientoDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getFechaVencimiento();
    }        
    
    // Registra el cargo del responsable en una declaración jurada
    public void registrarCargoDeclaracionJurada(int numeroDeclaracionJurada, String cargo) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setCargo(cargo);
    }
    
    // Devuelve el cargo del responsable en una declaración jurada
    public String mostrarCargoDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getCargo();
    }
    
    // Registra la fecha de asumpcion en una declaración jurada
    public void registrarFechaAsumpcionDeclaracionJurada(int numeroDeclaracionJurada, String fechaAsumpcion) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setFechaAsumpcion(fechaAsumpcion);
    }
    
    // Devuelve la fecha de asumpción en una declaración jurada
    public String mostrarFechaAsumpacionDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getFechaAsumpcion();
    }
    
    // Registra el tipo en una declaración jurada
    public void registrarTipoDeclaracionJurada(int numeroDeclaracionJurada, String tipo) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setTipo(tipo);
    }
    
    // Devuelve el tipo en una declaración jurada
    public String mostrarTipoDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getTipo();
    }    
    
    // Registra la fecha de referencia en una declaración jurada
    public void registrarFechaReferenciaDeclaracionJurada(int numeroDeclaracionJurada, String fechaReferencia) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setFechaReferencia(fechaReferencia);
    }
    
    // Devuelve la fecha de referencia en una declaración jurada
    public String mostrarFechaReferenciaDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getFechaReferencia();
    }        

    // Registra el comentario en una declaración jurada
    public void registrarComentarioDeclaracionJurada(int numeroDeclaracionJurada, String comentario) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setComentario(comentario);
    }
    
    // Devuelve el comentario en una declaración jurada
    public String mostrarComentarioDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getComentario();
    }            

    // Registra la publicación en una declaración jurada
    public void registrarPublicacionDeclaracionJurada(int numeroDeclaracionJurada, String publicacion) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setPublicacion(publicacion);
    }
    
    // Devuelve la publicación en una declaración jurada
    public String mostrarPublicacionDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getPublicacion();
    }                

    // Registra la fecha de documento en una declaración jurada
    public void registrarFechaDocumentoDeclaracionJurada(int numeroDeclaracionJurada, String fechaDocumento) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setFechaDocumento(fechaDocumento);
    }
    
    // Devuelve la fecha de documento en una declaración jurada
    public String mostrarFechaDocumentoDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getFechaDocumento();
    }

    // Registra el número de documento en una declaración jurada
    public void registrarNumeroDocumentoDeclaracionJurada(int numeroDeclaracionJurada, String numeroDocumento) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setNumeroDocumento(numeroDocumento);
    }
    
    // Devuelve la fecha de documento en una declaración jurada
    public String mostrarNumeroDocumentoDeclaracionJurada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getNumeroDocumento();
    }    
    
    // Aginación de tarea de declaración jurada
    public void asignarTareaDeclaracionJurada(int numeroDeclaracionJurada) {
        buscaDeclaracionJurada(numeroDeclaracionJurada).setAsignada(true);
    }
    
    // Mostrar valor de verdad de la asignación de declaración jurada
    public boolean mostrarTareaAsignada(int numeroDeclaracionJurada) {
        return buscaDeclaracionJurada(numeroDeclaracionJurada).getAsignada();
    }
    
}

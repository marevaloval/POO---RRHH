package modelos;

import BaseDatos.BDTareasGenerales;
import java.util.ArrayList;

public class TareasGenerales extends Tarea {
    
    private int numeroTareaGeneral;
    private String asunto;
    private String comentario;
    private ArrayList<Usuario> arUsuariosNotificacion;

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
        super("Tareas Generales",fechaVencimiento,responsable);
        this.numeroTareaGeneral = numeroTareaGeneral;
        this.asunto = asunto;
        arUsuariosNotificacion = new ArrayList<Usuario>();
    }
    
    public static ArrayList<TareasGenerales> getTareasGenerales() {
        return BDTareasGenerales.simularDataTareasGenerales();
    }
    
    public static void elminarTareaGeneral(int tareaGeneral) {
        for (TareasGenerales objTareaGeneral : BDTareasGenerales.simularDataTareasGenerales()) {
            if (objTareaGeneral.getNumeroTareaGeneral() == tareaGeneral) {
                BDTareasGenerales.eliminarTareasGeneralesBD(objTareaGeneral);
                return;
            }
        }        
    }

    public int getNumeroTareaGeneral() {
        return numeroTareaGeneral;
    }
    
    public void registrarUsuariosNotificacion(String usuario) {        
        arUsuariosNotificacion.add(Usuario.buscarUsuario(usuario));
    }
    
    public void elminarUsuariosNotificacion(String usuario) {        
        for (Usuario objUsuarios : arUsuariosNotificacion) {
            if (objUsuarios.getUsuario().equals(usuario)) {
                arUsuariosNotificacion.remove(objUsuarios);
                return;
            }
        }
    }
    
    public ArrayList<Usuario> getUsuarioNotificacion() {
        return arUsuariosNotificacion;
    }        
    
}
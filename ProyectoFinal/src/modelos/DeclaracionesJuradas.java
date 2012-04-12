package modelos;

import BaseDatos.BDDeclaracionJurada;
import java.util.ArrayList;

public class DeclaracionesJuradas extends Tarea {
    
    private int numero;
    private String motivo;
    private ArrayList<Usuario> arUsuariosNotificacion;
    
    private String cargo;
    private String fechaAsumpcion;
    private String tipo;
    private String fechaReferencia;
    private String comentario;
    private String publicacion;
    private String fechaDocumento;
    private String numeroDocumento;

    public DeclaracionesJuradas(int numero, String fechaVencimiento, String responsable) {
        super("Tareas Generales",fechaVencimiento,responsable);
        super.setFechaVencimiento(fechaVencimiento);
        super.setResponsable(responsable);
        this.numero = numero;
        arUsuariosNotificacion = new ArrayList<Usuario>();
        BDDeclaracionJurada.agregarDeclaracionJuradaBD(this);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void registrarUsuariosNotificacion(String usuario) {
        arUsuariosNotificacion.add(Usuario.buscarUsuario(usuario));
    }
    
    public void elminarUsuariosNotificacion(String usuario) {
        for (Usuario objUsuario : arUsuariosNotificacion) {
            if (objUsuario.getUsuario().equals(usuario)) {
                arUsuariosNotificacion.remove(objUsuario);
                return;
            }
        }
    }
    
    public ArrayList<Usuario> getUsuarioNotificacion() {
        return arUsuariosNotificacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFechaAsumpcion() {
        return fechaAsumpcion;
    }

    public void setFechaAsumpcion(String fechaAsumpcion) {
        this.fechaAsumpcion = fechaAsumpcion;
    }

    public String getFechaDocumento() {
        return fechaDocumento;
    }

    public void setFechaDocumento(String fechaDocumento) {
        this.fechaDocumento = fechaDocumento;
    }

    public String getFechaReferencia() {
        return fechaReferencia;
    }

    public void setFechaReferencia(String fechaReferencia) {
        this.fechaReferencia = fechaReferencia;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static ArrayList<DeclaracionesJuradas> getDeclaracionesJuradas() {
        return BDDeclaracionJurada.simularDataDeclaracionJurada();
    }
    
    public static void elminarDeclaracionJurada(int declaracionJurada) {
        for (DeclaracionesJuradas objDeclaracionJurada : BDDeclaracionJurada.simularDataDeclaracionJurada()) {
            if (objDeclaracionJurada.getNumero() == declaracionJurada) {
                BDDeclaracionJurada.eliminarDeclaracionJuradaBD(objDeclaracionJurada);
                return;
            }
        }        
    }
        
}

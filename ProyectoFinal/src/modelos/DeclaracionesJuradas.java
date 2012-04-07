package modelos;

import BaseDatos.BDDeclaracionJurada;
import java.util.ArrayList;

public class DeclaracionesJuradas extends Tarea {
    
    private int numero;
    private String responsable;
    private String motivo;
    private ArrayList<Empleado> arEmpleadoNotificacion;
    
    private String cargo;
    private String fechaAsumpcion;
    private String tipo;
    private String fechaReferencia;
    private String comentario;
    private String publicacion;
    private String fechaDocumento;
    private String numeroDocumento;
    private boolean tareaAsignada;

    public DeclaracionesJuradas(int numero, String responsable, String motivo, String fechaVencimiento) {
        super("Declaración Jurada");
        super.setFechaVencimiento(fechaVencimiento);
        super.setResponsable(responsable);
        this.numero = numero;
        this.responsable = responsable;
        this.motivo = motivo;
        arEmpleadoNotificacion = new ArrayList<Empleado>();
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

    public boolean getTareaAsignada() {
        return tareaAsignada;
    }

    public void setTareaAsignada(boolean tareaAsignada) {
        this.tareaAsignada = tareaAsignada;
    }
    
    public static ArrayList<DeclaracionesJuradas> getDeclaracionesJuradas() {
        return BDDeclaracionJurada.simularDataDeclaracionJurada();
    }
    
    public static void elminarDeclaracionJurada(DeclaracionesJuradas declaracionJurada) {
        BDDeclaracionJurada.eliminarDeclaracionJuradaBD(declaracionJurada);
    }
        
}

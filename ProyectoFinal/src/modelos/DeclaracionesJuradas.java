package modelos;

import java.util.ArrayList;

public class DeclaracionesJuradas {
    
    private int numero;
    private String responsable;
    private String motivo;
    private String fechaVencimiento;
    private ArrayList<String> arUsuario;
    
    private String cargo;
    private String fechaAsumpcion;
    private String tipo;
    private String fechaReferencia;
    private String comentario;
    private String publicacion;
    private String fechaDocumento;
    private String numeroDocumento;

    public DeclaracionesJuradas(int numero, String responsable, String motivo, String fechaVencimiento) {
        this.numero = numero;
        this.responsable = responsable;
        this.motivo = motivo;
        this.fechaVencimiento = fechaVencimiento;
        arUsuario = new ArrayList<String>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    public ArrayList<String> getUsuarios() {
        return arUsuario;
    }

    public void registrarUsuario(String usuario) {
        arUsuario.add(usuario);
    }
    
    public void elminarUsuario(String usuario) {
        for (String usuarioLista : arUsuario) {
            if (usuarioLista.equals(usuario)) {
                arUsuario.remove(usuarioLista);
            }
        }
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
        
}

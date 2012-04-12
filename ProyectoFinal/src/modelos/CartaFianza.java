/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import BaseDatos.BDCartaFianza;
import BaseDatos.BDUsuario;
import java.util.ArrayList;

public class CartaFianza extends Tarea {
    
    private int numeroCartaFianza;
    private String proveedor;
    
    private ArrayList<Usuario> arUsuariosNotificacion;    
    private int numeroContrato;
    private String bancoEmisor;
    private String tipo;    
    private int numeroProcesoSeleccion;
    private double importe;
    private String comentario;   

    public CartaFianza(int numeroCartaFianza, String proveedor, String fechaVencimiento, String responsable) {
        super("Tareas Generales",fechaVencimiento,responsable);
        this.numeroCartaFianza = numeroCartaFianza;
        this.proveedor = proveedor;
        arUsuariosNotificacion = new ArrayList<Usuario>();
        BDCartaFianza.agregarCartaFianzaBD(this);
    }    
    
    public int getNumeroCartaFianza() {
        return numeroCartaFianza;
    }

    public void setNumeroCartaFianza(int numeroCartaFianza) {
        this.numeroCartaFianza = numeroCartaFianza;
    }    
    
    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
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
    
    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(String bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public int getNumeroProcesoSeleccion() {
        return numeroProcesoSeleccion;
    }

    public void setNumeroProcesoSeleccion(int numeroProcesoSeleccion) {
        this.numeroProcesoSeleccion = numeroProcesoSeleccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }  
    
    public static ArrayList<CartaFianza> getCartasFianzas() {
        return BDCartaFianza.simularDataCartaFianza();
    }
    
    public static void elminarCartaFianza(int cartaFianza) {
        for (CartaFianza objCartaFianza : BDCartaFianza.simularDataCartaFianza()) {
            if (objCartaFianza.getNumeroCartaFianza() == cartaFianza) {
                BDCartaFianza.eliminarCartaFianzaBD(objCartaFianza);
                return;
            }
        }        
    }
    
}

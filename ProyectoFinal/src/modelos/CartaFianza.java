/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

public class CartaFianza {
    
    private int numeroCartaFianza;
    private String proveedor;
    
    private ArrayList<String> arUsuario;    
    private int numeroContrato;
    private String bancoEmisor;
    private String tipo;    
    private int numeroProcesoSeleccion;
    private double importe;
    private String  fechaVencimiento;
    private String responsable;
    private String comentario;    

    public CartaFianza(int numeroCartaFianza, String proveedor) {
        this.numeroCartaFianza = numeroCartaFianza;
        this.proveedor = proveedor;
        arUsuario = new ArrayList<String>();
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

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
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

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }            
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import BaseDatos.BDCartaFianza;
import java.util.ArrayList;

public class CartaFianza {
    
    private int numeroCartaFianza;
    private String proveedor;
    
    private ArrayList<Empleado> arEmpleadoNotificacion;    
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
        arEmpleadoNotificacion = new ArrayList<Empleado>();
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
    
    public void registrarEmpleadoNotificacion(Empleado empleado) {
        arEmpleadoNotificacion.add(empleado);
    }
    
    public void elminarEmpleadoNotificacion(Empleado empleado) {
        for (Empleado empleadoLista : arEmpleadoNotificacion) {
            if (empleadoLista.equals(empleado)) {
                arEmpleadoNotificacion.remove(empleadoLista);
            }
        }
    }
    
    public ArrayList<Empleado> getEmpleadoNotificacion() {
        return arEmpleadoNotificacion;
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
    
    public static ArrayList<CartaFianza> getCartasFianzas() {
        return BDCartaFianza.simularDataCartaFianza();
    }
    
    public static void elminarCartaFianza(CartaFianza cartaFianza) {
        BDCartaFianza.eliminarCartaFianzaBD(cartaFianza);
    }    
    
}

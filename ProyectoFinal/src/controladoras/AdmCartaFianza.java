/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.CartaFianza;
import modelos.Empleado;

public class AdmCartaFianza {
        
    public void registrarCartaFianza(int numeroCartaFianza, String proveedor) {
        if (verificarNumeroCartaFianza(numeroCartaFianza) == false) {
            return;
        }
        if (verificarProveedor(proveedor) == false) {
            return;
        }
        CartaFianza objCartaFianza = new CartaFianza(numeroCartaFianza, proveedor);
    }
    
    private boolean verificarNumeroCartaFianza(int numeroCartaFianza) {
        if (numeroCartaFianza == 0) {
            return false;
        }
        return true;
    }
    
    private boolean verificarProveedor(String proveedor) {
        if (proveedor.equals("")) {
            return false;
        }
        return true;
    }
    
    public void eliminarCartaFianza(int numeroCartaFianza) {
        CartaFianza.elminarCartaFianza(buscaCartaFianza(numeroCartaFianza));
    }
    
    public int cantidadCartaFianza() {
        return CartaFianza.getCartasFianzas().size();
    }
    
    private CartaFianza buscaCartaFianza(int numeroCartaFianza) {
        for (CartaFianza objCartaFianza: CartaFianza.getCartasFianzas()) {
            if (objCartaFianza.getNumeroCartaFianza() == numeroCartaFianza) {
                return objCartaFianza;
            }
        }
        return null;
    }
    
    // Registrar un usuario en una carta fianza
    public void registrarUsuarioCartaFianza(int numeroCartaFianza, Empleado usuario) {
        buscaCartaFianza(numeroCartaFianza).registrarEmpleadoNotificacion(usuario);
    }
    
    // Eliminar usuario en una carta fianza
    public void eliminarUsuarioCartaFianza(int numeroCartaFianza, Empleado usuario) {
        buscaCartaFianza(numeroCartaFianza).elminarEmpleadoNotificacion(usuario);
    }
    
    // Cantidad de usuario en una carta fianza
    public int cantidadUsuariosCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getEmpleadoNotificacion().size();
    }
    
    // Mostrar usuarios de una carta fianza
    private ArrayList<Empleado> mostrarUsuariosCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getEmpleadoNotificacion();
    }
    
    // Devuelve el proveedor en una carta fianza
    public String mostrarProveedorCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getProveedor();
    }
    
    // Registra el número de contraro en una carta fianza
    public void registrarNumeroContratoDeclaracionJurada(int numeroCartaFianza, int numeroContrato) {
        buscaCartaFianza(numeroCartaFianza).setNumeroContrato(numeroContrato);
    }
    
    // Devuelve el número de contrato en una carta fianza
    public int mostrarNumeroContratoCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getNumeroContrato();
    }    
    
}

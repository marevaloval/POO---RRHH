/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.CartaFianza;

public class AdmCartaFianza {
    
    private ArrayList<CartaFianza> arCartasFianzas;

    public AdmCartaFianza() {
        arCartasFianzas = new ArrayList<CartaFianza>();
    }
    
    public void registrarCartaFianza(int numeroCartaFianza, String proveedor) {
        if (verificarNumeroCartaFianza(numeroCartaFianza) == false) {
            return;
        }
        if (verificarProveedor(proveedor) == false) {
            return;
        }
        CartaFianza objCartaFianza = new CartaFianza(numeroCartaFianza, proveedor);
        arCartasFianzas.add(objCartaFianza);
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
        arCartasFianzas.remove(buscaCartaFianza(numeroCartaFianza));
    }
    
    public int cantidadCartaFianza() {
        return arCartasFianzas.size();
    }
    
    private CartaFianza buscaCartaFianza(int numeroCartaFianza) {
        for (CartaFianza objCartaFianza: arCartasFianzas) {
            if (objCartaFianza.getNumeroCartaFianza() == numeroCartaFianza) {
                return objCartaFianza;
            }
        }
        return null;
    }
    
    // Registrar un usuario en una carta fianza
    public void registrarUsuarioCartaFianza(int numeroCartaFianza, String usuario) {
        buscaCartaFianza(numeroCartaFianza).registrarUsuario(usuario);
    }
    
    // Eliminar usuario en una carta fianza
    public void eliminarUsuarioCartaFianza(int numeroCartaFianza, String usuario) {
        buscaCartaFianza(numeroCartaFianza).elminarUsuario(usuario);
    }
    
    // Cantidad de usuario en una carta fianza
    public int cantidadUsuariosCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getUsuarios().size();
    }
    
    // Mostrar usuarios de una carta fianza
    private ArrayList<String> mostrarUsuariosCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getUsuarios();
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

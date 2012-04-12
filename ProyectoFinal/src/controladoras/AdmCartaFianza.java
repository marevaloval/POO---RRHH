/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.CartaFianza;
import modelos.Usuario;

public class AdmCartaFianza {
        
    public void registrarCartaFianza(int numeroCartaFianza, String proveedor, String fechaVencimiento, String responsable) {
        if (verificarNumeroCartaFianza(numeroCartaFianza) == false) {
            return;
        }
        if (verificarProveedor(proveedor) == false) {
            return;
        }
        CartaFianza objCartaFianza = new CartaFianza(numeroCartaFianza, proveedor, fechaVencimiento, responsable);
    }
    
    // Validar que el numero de la carta fianza no sea vacío
    private boolean verificarNumeroCartaFianza(int numeroCartaFianza) {
        if (numeroCartaFianza == 0) {
            return false;
        }
        return true;
    }
    
    // Validar que el proveedor la de carta fianza no sea vacío
    private boolean verificarProveedor(String proveedor) {
        if (proveedor.equals("")) {
            return false;
        }
        return true;
    }
    
    public void eliminarCartaFianza(int numeroCartaFianza) {
        CartaFianza.elminarCartaFianza(numeroCartaFianza);
    }
    
    public int cantidadCartaFianza() {
        return CartaFianza.getCartasFianzas().size();
    }
    
    public CartaFianza buscaCartaFianza(int numeroCartaFianza) {
        for (CartaFianza objCartaFianza: CartaFianza.getCartasFianzas()) {            
            if (objCartaFianza.getNumeroCartaFianza() == numeroCartaFianza) {
                return objCartaFianza;                                
            }
        }
        return null;        
    }
    
    // Registrar un usuario en una carta fianza
    public void registrarUsuarioCartaFianza(int numeroCartaFianza, String usuario) {
        buscaCartaFianza(numeroCartaFianza).registrarUsuariosNotificacion(usuario);
    }
    
    // Eliminar usuario en una carta fianza
    public void eliminarUsuarioCartaFianza(int numeroCartaFianza, String usuario) {
        buscaCartaFianza(numeroCartaFianza).elminarUsuariosNotificacion(usuario);
    }
    
    // Cantidad de usuario en una carta fianza
    public int cantidadUsuariosCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getUsuarioNotificacion().size();
    }
    
    // Mostrar usuarios de una carta fianza
    private ArrayList<Usuario> mostrarUsuariosCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getUsuarioNotificacion();
    }
    
    // Devuelve el proveedor en una carta fianza
    public String mostrarProveedorCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getProveedor();
    }
    
    // Registra el número de contraro en una carta fianza
    public void registrarNumeroContratoCartaFianza(int numeroCartaFianza, int numeroContrato) {
        buscaCartaFianza(numeroCartaFianza).setNumeroContrato(numeroContrato);
    }
    
    // Devuelve el número de contrato en una carta fianza
    public int mostrarNumeroContratoCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getNumeroContrato();
    }
    
    // Aginación de tarea de declaración jurada
    public void asignarTareaCartaFianza(int numeroCartaFianza) {
        if (verificarProveedor(buscaCartaFianza(numeroCartaFianza).getProveedor()) == false) {
            return;
        }        
        if (verificarNumeroContrato(buscaCartaFianza(numeroCartaFianza).getNumeroContrato()) == false) {
            return;
        }
        if (verificarBancoEmisor(buscaCartaFianza(numeroCartaFianza).getBancoEmisor()) == false) {
            return;
        }        
        if (verificarTipo(buscaCartaFianza(numeroCartaFianza).getTipo()) == false) {
            return;
        }                
        if (verificarImporte(buscaCartaFianza(numeroCartaFianza).getImporte()) == false) {
            return;
        }                      
        if (verificarFechaVencimiento(buscaCartaFianza(numeroCartaFianza).getFechaVencimiento()) == false) {
            return;
        }                              
        if (verificarResponsable(buscaCartaFianza(numeroCartaFianza).getResponsable()) == false) {
            return;
        }                                              
        buscaCartaFianza(numeroCartaFianza).setAsignada(true);
    }
    
    // Mostrar valor de verdad de la asignación de declaración jurada
    public boolean mostrarTareaAsignada(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getAsignada();
    }    
    
    // Validar que el número de contrato de la carta fianza no sea cero
    private boolean verificarNumeroContrato(int numeroContrato) {
        if (numeroContrato == 0) {
            return false;
        }
        return true;
    }    
    
    // Validar que el banco emisor de la carta fianza no sea vacío
    private boolean verificarBancoEmisor(String bancoEmisor) {
        if (bancoEmisor.equals("")) {
            return false;
        }
        return true;
    }
    
    // Validar que el tipo de la carta fianza no sea vacío
    private boolean verificarTipo(String tipo) {
        if (tipo.equals("")) {
            return false;
        }
        return true;
    }    
    
    // Validar que el importe de la carta fianza no sea cero
    private boolean verificarImporte(double importe) {
        if (importe == 0) {
            return false;
        }
        return true;
    }        
    
    // Validar que la fecha de vencimiento de la carta fianza no sea vacío
    private boolean verificarFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento.equals("")) {
            return false;
        }
        return true;
    }            
    
    // Validar que el responsable de la carta fianza no sea vacío
    private boolean verificarResponsable(String responsable) {
        if (responsable.equals("")) {
            return false;
        }
        return true;
    }                
                
    // Registra el banco emisor de una carta fianza
    public void registrarBancoEmisorCartaFianza(int numeroCartaFianza, String bancoEmisor) {
        buscaCartaFianza(numeroCartaFianza).setBancoEmisor(bancoEmisor);
    }
    
    // Devuelve el banco emisor de una carta fianza
    public String mostrarBancoEmisorCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getBancoEmisor();
    }    
    
    // Registra el tipo de una carta fianza
    public void registrarTipoCartaFianza(int numeroCartaFianza, String tipo) {
        buscaCartaFianza(numeroCartaFianza).setTipo(tipo);
    }
    
    // Devuelve el tipo de una carta fianza
    public String mostrarTipoCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getTipo();
    }   
    
    // Registra el número proceso de selección de una carta fianza
    public void registrarNumeroProcesoSeleccionCartaFianza(int numeroCartaFianza, int numeroProcesoSeleccion) {
        buscaCartaFianza(numeroCartaFianza).setNumeroProcesoSeleccion(numeroProcesoSeleccion);
    }
    
    // Devuelve el número proceso de selección de una carta fianza
    public int mostrarNumeroProcesoSeleccionCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getNumeroProcesoSeleccion();
    }       
    
    // Registra el importe de una carta fianza
    public void registrarImporteCartaFianza(int numeroCartaFianza, double importe) {
        buscaCartaFianza(numeroCartaFianza).setImporte(importe);
    }
    
    // Devuelve el importe de una carta fianza
    public double mostrarImporteCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getImporte();
    }
    
    // Registra la fecha de vencimiento de una carta fianza
    public void registrarFechaVencimientoCartaFianza(int numeroCartaFianza, String fechaVencimiento) {
        buscaCartaFianza(numeroCartaFianza).setFechaVencimiento(fechaVencimiento);
    }
    
    // Devuelve la fecha de vencimiento de una carta fianza
    public String mostrarFechaVencimientoCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getFechaVencimiento();
    }               
    
    // Registra el responsable de una carta fianza
    public void registrarResponsableCartaFianza(int numeroCartaFianza, String responsable) {
        buscaCartaFianza(numeroCartaFianza).setResponsable(responsable);
    }
    
    // Devuelve el responsable de una carta fianza
    public String mostrarResponsableCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getResponsable();
    }                
    
    // Registra el responsable de una carta fianza
    public void registrarComentarioCartaFianza(int numeroCartaFianza, String comentario) {
        buscaCartaFianza(numeroCartaFianza).setComentario(comentario);
    }
    
    // Devuelve el comentario de una carta fianza
    public String mostrarComentarioCartaFianza(int numeroCartaFianza) {
        return buscaCartaFianza(numeroCartaFianza).getComentario();
    }                        
            
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Rol;

/**
 *
 * @author Sebas
 */
public class AdmRoles {
    
    public void registrarRol(int codigoRol, String nombre, String descripcion) {
        Rol objRol = new Rol(codigoRol);
        objRol.setNombre(nombre);
        objRol.setDescripcion(descripcion);        
    }
    
    public void actualizarAccesosRol(int codigoRol, String modulo, boolean adicionar, boolean editar, boolean eliminar) {
        Rol.buscarRol(codigoRol).actualizarAcceso(modulo, editar, adicionar, editar, eliminar);
    }
    
    public void eliminarRol(int codigoRol) {
        Rol.eliminarRol(codigoRol);
    }
        
    public void mostrarRoles() {
        Rol.getRoles();
    }
    
    public int cantidadRoles() {
        return Rol.getRoles().size();
    }
}

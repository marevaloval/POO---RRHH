/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Usuario;

public class AdmUsuarios {        
    
    // Registrar usuario
    public void registrarUsuario(String usuario, String contrasenha, String dni, String nombre, 
                                 String apellidoPaterno, String apellidoMaterno, String correo, String fechaIngreso,
                                 String Cargo, int rol) {
        
        // Registro de usuario
        Usuario objUsuario = new Usuario(usuario, contrasenha, nombre, apellidoPaterno, apellidoMaterno, correo, 
                                         fechaIngreso, Cargo, dni);        
    }
    
    // Eliminar usuaro
    public void eliminarUsuario(String usuario) {      
        Usuario.eliminarUsuario(usuario);
    }
    
    // Devuelve la cantidad de usuarios ingresados
    public int cantidadUsuarios() {
        return Usuario.getUsuarios().size();
    }
    
    public ArrayList<Usuario> mostrarUsuarios() {
        return Usuario.getUsuarios();
    }
    
    // Verifica si el usuario existe
    public boolean verificaUsuario(String usuario) {        
        if (Usuario.verificaExistenciaUsuario(usuario) == true) {
            return true;
        } else {
            return false;
        }        
    }    
    
    // Valida que el usuario/contraseña exista
    public boolean validaIngreso(String usuario, String contrasenha) {        
        if (Usuario.validaUsuarioContrasenha(usuario, contrasenha) == true) {
            return true;
        } else {
            return false;
        }        
    }            
    
    // Valida que el usuario ingresado no sea vacío
    private boolean validaUsuario(String usuario) {
        if (usuario.equals("")) {
            return false;
        } else {
            return true;
        }                
    }
    
    // Valida que la contraseña ingresa no sea vacía
    private boolean validaContrasenha(String contrasenha) {
        if (contrasenha.equals("")) {
            return false;
        } else {
            return true;
        }                
    }               
    
}

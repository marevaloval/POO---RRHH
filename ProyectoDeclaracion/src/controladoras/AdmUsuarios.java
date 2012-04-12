/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Rol;
import modelos.Usuario;

public class AdmUsuarios {        
    
    // Registrar usuario
    public void registrarUsuario(String usuario, String contrasenha, String dni, String nombre, 
                                 String apellidoPaterno, String apellidoMaterno, String correo, String fechaIngreso,
                                 String cargo, int rol) {
        if (validaUsuario(usuario) == false) {
            return;
        }
        if (validaContrasenha(contrasenha) == false) {
            return;
        }        
        if (validaDni(dni) == false) {
            return;
        }                
        if (validaNombre(nombre) == false) {
            return;
        }                        
        if (validaApellidoPaterno(apellidoPaterno) == false) {
            return;
        }                              
        if (validaApellidoMaterno(apellidoMaterno) == false) {
            return;
        }          
        if (validaCorreo(correo) == false) {
            return;
        }        
        if (validaFechaIngreso(fechaIngreso) == false) {
            return;
        }                
        if (validaCargo(cargo) == false) {
            return;
        }                        
        if (validaRol(rol) == false) {
            return;
        }                            
        // Registro de usuario
        Usuario objUsuario = new Usuario(usuario, contrasenha, nombre, apellidoPaterno, apellidoMaterno, correo, 
                                         fechaIngreso, cargo, dni, Rol.buscarRol(rol));                     
    }
    
    // Eliminar usuaro
    public void eliminarUsuario(String usuario) { 
        if (Usuario.buscarUsuario(usuario).getTransacciones() == false) {
            Usuario.eliminarUsuario(usuario);
        }        
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
    
    // Valida que el usuario ingresado no sea vacío, el formulario lo pide por eso public
    public boolean validaUsuario(String usuario) {
        if (usuario.equals("")) {
            return false;
        } else {
            return true;
        }                
    }
    
    // Valida que la contraseña ingresa no sea vacía, el formulario lo pide por eso public
    public boolean validaContrasenha(String contrasenha) {
        if (contrasenha.equals("")) {
            return false;
        } else {
            return true;
        }                
    }               
    
    private boolean validaDni(String dni) {
        if (dni.equals("")) {
            return false;
        } else {
            return true;
        }                
    }
    
    private boolean validaNombre(String nombre) {
        if (nombre.equals("")) {
            return false;
        } else {
            return true;
        }                
    }    

    private boolean validaApellidoPaterno(String apellidoPaterno) {
        if (apellidoPaterno.equals("")) {
            return false;
        } else {
            return true;
        }                
    }        
    
    private boolean validaApellidoMaterno(String apellidoMaterno) {
        if (apellidoMaterno.equals("")) {
            return false;
        } else {
            return true;
        }                
    }            
    
    private boolean validaCorreo(String Correo) {
        if (Correo.equals("")) {
            return false;
        } else {
            return true;
        }                
    }                
    
    private boolean validaFechaIngreso(String fechaIngreso) {
        if (fechaIngreso.equals("")) {
            return false;
        } else {
            return true;
        }                
    }             

    private boolean validaCargo(String cargo) {
        if (cargo.equals("")) {
            return false;
        } else {
            return true;
        }                
    }                 

    private boolean validaRol(int rol) {
        if (rol == 0) {
            return false;
        } else {
            return true;
        }                
    }                    
    
}

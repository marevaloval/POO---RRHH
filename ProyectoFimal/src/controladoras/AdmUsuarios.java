/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Usuario;
import java.util.ArrayList;

public class AdmUsuarios {
        
    ArrayList<Usuario> arUsuario;

    public AdmUsuarios() {
        arUsuario = new ArrayList<Usuario>();
    }
    
    // Registrar usuario
    public void registrarUsuario(String usuario, String contrasenha) {
        Usuario objUsuario = new Usuario(usuario, contrasenha);
        arUsuario.add(objUsuario);
    }
    
    // Eliminar usuaro
    public void eliminarUsuario(String usuario) {
        arUsuario.remove(buscaUsuario(usuario));
    }
    
    // Devuelve la cantidad de usuarios ingresados
    public int cantidadUsuarios() {
        return arUsuario.size();
    }
    
    // Valida que el usuario/contraseña exista
    public boolean validaUsuarioContrasenha(String usuario, String contrasenha) {
        for (Usuario user: arUsuario) {
            if (user.getUsuario().equals(usuario) && user.getContrasenha().equals(contrasenha)) {
                return true;
            }
        }
        return false;
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
       
    private Usuario buscaUsuario(String usuario) {
        for (Usuario objUsuario : arUsuario) {
            if (objUsuario.getUsuario().equals(usuario)) {
                return objUsuario;
            }
        }        
        return null;
    }
    
}

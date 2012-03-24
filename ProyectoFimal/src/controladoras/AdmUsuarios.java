/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Usuario;
import java.util.ArrayList;

public class AdmUsuarios {
    
    Usuario objUsuario;
    ArrayList<Usuario> arUsuario;

    public AdmUsuarios() {
        arUsuario = new ArrayList<Usuario>();
    }
    
    // Ingresa un nuevo usuario
    public void registrarUsuario(String usuario, String contrasenha) {
        objUsuario = new Usuario(usuario, contrasenha);
        arUsuario.add(objUsuario);
    }    
    
    // Validaque el usuario ingresado no sea vacío
    public boolean validaUsuario(String usuario) {
        if (usuario.equals("")) {
            return false;
        } else {
            return true;
        }                
    }
    
    // Valida que la contraseña ingresa no sea vacía
    public boolean validaContrasenha(String contrasenha) {
        if (contrasenha.equals("")) {
            return false;
        } else {
            return true;
        }                
    }
    
    // Devuelve la cantidad de usuarios ingresados
    public int getUsuarios() {
        return arUsuario.size();
    }
    
    
    // Busca si el usuario ingresado existe
    public boolean buscaUsuarioContrasenha(String usuario, String contrasenha) {
        for (Usuario user: arUsuario) {
            if (user.getUsuario().equals(usuario) && user.getContrasenha().equals(contrasenha)) {
                return true;
            }
        }
        return false;
    }
    
}

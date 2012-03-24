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
    
    public void registrarUsuario(String usuario, String contrasenha) {
        objUsuario = new Usuario(usuario, contrasenha);
        arUsuario.add(objUsuario);
    }    
    
    public boolean validaUsuario(String usuario) {
        if (usuario.equals("")) {
            return false;
        } else {
            return true;
        }                
    }
    
    public boolean validaContrasenha(String contrasenha) {
        if (contrasenha.equals("")) {
            return false;
        } else {
            return true;
        }                
    }
    
    public int getUsuarios() {
        return arUsuario.size();
    }
    
    public boolean buscaUsuarioContrasenha(String usuario, String contrasenha) {
        for (Usuario user: arUsuario) {
            if (user.getUsuario().equals(usuario) && user.getContrasenha().equals(contrasenha)) {
                return true;
            }
        }
        return false;
    }
    
}

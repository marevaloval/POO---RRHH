/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.Usuario;

public class BDUsuario {
    
    static ArrayList<Usuario> arUsuarios = new ArrayList<Usuario>();    
    
    public static ArrayList<Usuario> simularDataUsuarios() {        
        return arUsuarios;
    }
    
    public static void agregarUsuarioBD(Usuario usuario) {
        arUsuarios.add(usuario);
    }            
    
    public static void eliminarUsuarioBD(Usuario usuario) {
        for (Usuario objUsuarios : arUsuarios) {
            if (objUsuarios == usuario) {
                arUsuarios.remove(usuario);
                return;
            }
        }
    }
    
    public static void limpiarBD() {
        arUsuarios.clear();
    }
    
}

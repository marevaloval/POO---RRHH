/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Rol;
import modelos.Usuario;
import static org.junit.Assert.*;
import org.junit.Test;
        
public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
            
    @Test
    public void registroUsuario() {
        Rol rol1 = new Rol(1);
        Usuario usuario1 = new Usuario("luisc", "1234", "", "", "", "", "", "", "", rol1);
        assertEquals(1, admUsuarios.cantidadUsuarios());
    }   
    
    @Test
    public void eliminoUsuario() {
        Rol rol2 = new Rol(2);
        Usuario usuario2 = new Usuario("luisc", "1234", "", "", "", "", "", "", "", rol2);
        admUsuarios.eliminarUsuario("luisc");
        assertEquals(1, admUsuarios.cantidadUsuarios());
    }        
    
    @Test
    public void validaUsuarioContrasenha() {
        assertTrue(admUsuarios.validaIngreso("luisc", "1234"));
    }
    
    @Test
    public void verificaExistenciaUsuario() {
        assertTrue(admUsuarios.verificaUsuario("luisc"));
    }

    public void usuarioNoPuedeEliminarTransacciones() {
        Rol rol2 = new Rol(2);
        Usuario usuario2 = new Usuario("luisc", "1234", "", "", "", "", "", "", "", rol2);
        usuario2.setTransacciones(true);
        assertTrue(usuario2.getTransacciones());
    }
    
}

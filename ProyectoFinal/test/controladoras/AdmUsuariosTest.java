/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Usuario;
import static org.junit.Assert.*;
import org.junit.Test;
        
public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
            
    @Test
    public void registroUsuario() {
        Usuario usuario1 = new Usuario("luisc", "1234", "", "", "", "", "", "", "");
        assertEquals(1, admUsuarios.cantidadUsuarios());
    }   
    
    @Test
    public void eliminoUsuario() {
        Usuario usuario2 = new Usuario("luisc", "1234", "", "", "", "", "", "", "");
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
    
}

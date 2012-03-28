/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import static org.junit.Assert.*;
import org.junit.Test;
        
public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
            
    @Test
    public void registroUsuario() {
        admUsuarios.registrarUsuario("luisc", "1234");
        assertEquals(1, admUsuarios.cantidadUsuarios());
    }   
    
    @Test
    public void eliminoUsuario() {
        admUsuarios.registrarUsuario("luisc", "1234");
        admUsuarios.registrarUsuario("miguela", "0000");        
        admUsuarios.eliminarUsuario("luisc");
        assertEquals(1, admUsuarios.cantidadUsuarios());
    }        
    
    @Test
    public void validaUsuarioContrasenha() {
        admUsuarios.registrarUsuario("luisc", "1234");
        assertTrue(admUsuarios.validaUsuarioContrasenha("luisc", "1234"));
    }
    
}

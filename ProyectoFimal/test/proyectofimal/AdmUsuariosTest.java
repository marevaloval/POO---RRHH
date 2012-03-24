/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofimal;

import controladoras.AdmUsuarios;
import org.junit.Test;
import static org.junit.Assert.*;
        
public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios = new AdmUsuarios();
        
    @Test
    public void ingresoUsuarioNoVacio() {
        assertFalse(admUsuarios.validaUsuario(""));
    }
    
    @Test
    public void ingresoContrasenhaNoVacio() {
        assertFalse(admUsuarios.validaContrasenha(""));
    }        
    
    @Test
    public void buscaUsuarioContrasenha() {
        admUsuarios.registrarUsuario("luisc", "luisc");
        assertEquals(true, admUsuarios.buscaUsuarioContrasenha("luisc","luisc"));
    }
    
    @Test
    public void registroUsuario() {
        admUsuarios.registrarUsuario("luisc", "luisc");
        assertEquals(1, admUsuarios.getUsuarios());                        
    }        
    
}

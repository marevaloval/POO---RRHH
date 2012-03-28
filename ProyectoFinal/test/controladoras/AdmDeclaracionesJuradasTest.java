/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdmDeclaracionesJuradasTest {
    AdmDeclaracionesJuradas admDeclaracionesJuradas = new AdmDeclaracionesJuradas();    
    
    @Test
    public void registroDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1,"Luis Caiguaraico", "declaración", "25/03/2012");
        assertEquals(1,admDeclaracionesJuradas.cantidadDeclaracionesJuradas());
    }
    
    @Test
    public void eliminarDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1,"Luis Caiguaraico", "declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarDeclaracionJurada(2,"Miguel Arévalo", "declaración", "25/03/2012");
        admDeclaracionesJuradas.eliminarDeclaracionJurada(1);
        assertEquals(1, admDeclaracionesJuradas.cantidadDeclaracionesJuradas());
    }
    
    @Test
    public void registroUsuarioDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarUsuarioDeclaracionJurada(1, "user1");
        assertEquals(1, admDeclaracionesJuradas.cantidadUsuariosDeclaracionJurada(1));
    }
    
    @Test
    public void eliminaUsuarioDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarUsuarioDeclaracionJurada(1, "user1");
        admDeclaracionesJuradas.registrarUsuarioDeclaracionJurada(1, "user2");
        admDeclaracionesJuradas.eliminarUsuarioDeclaracionJurada(1, "user1");
        assertEquals(1, admDeclaracionesJuradas.cantidadUsuariosDeclaracionJurada(1));
    }
    
    
}

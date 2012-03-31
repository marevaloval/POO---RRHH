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
        admDeclaracionesJuradas.registrarDeclaracionJurada(1,"Luis Caiguaraico", "", "25/03/2012");
        assertEquals(0,admDeclaracionesJuradas.cantidadDeclaracionesJuradas());
        
        admDeclaracionesJuradas.registrarDeclaracionJurada(1,"Luis Caiguaraico", "Declaración jurada", "25/03/2012");
        assertEquals(1,admDeclaracionesJuradas.cantidadDeclaracionesJuradas());        
    }
    
    @Test
    public void eliminacionDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1,"Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarDeclaracionJurada(2,"Miguel Arévalo", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.eliminarDeclaracionJurada(1);
        assertEquals(1, admDeclaracionesJuradas.cantidadDeclaracionesJuradas());       
    }
    
    @Test
    public void registroUsuarioDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarUsuarioDeclaracionJurada(1, "user1");
        assertEquals(1, admDeclaracionesJuradas.cantidadUsuariosDeclaracionJurada(1));
    }
    
    @Test
    public void eliminacionUsuarioDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarUsuarioDeclaracionJurada(1, "user1");
        admDeclaracionesJuradas.registrarUsuarioDeclaracionJurada(1, "user2");
        admDeclaracionesJuradas.eliminarUsuarioDeclaracionJurada(1, "user1");
        assertEquals(1, admDeclaracionesJuradas.cantidadUsuariosDeclaracionJurada(1));
    }
    
    @Test
    public void registroResponsableDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        assertEquals("Luis Caiguaraico", admDeclaracionesJuradas.mostrarResponsableDeclaracionJurada(1));
    }
    
    @Test
    public void registroMotivoDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        assertEquals("Declaración", admDeclaracionesJuradas.mostrarMotivoDeclaracionJurada(1));
    }   
    
    @Test
    public void registroFechaVencimientoDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        assertEquals("25/03/2012", admDeclaracionesJuradas.mostrarFechaVencimientoDeclaracionJurada(1));        
    }
    
    @Test
    public void registroCargoDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarCargoDeclaracionJurada(1, "Administrador");
        assertEquals("Administrador", admDeclaracionesJuradas.mostrarCargoDeclaracionJurada(1));                
    }
    
    @Test
    public void registroFechaAsumpcionDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarFechaAsumpcionDeclaracionJurada(1, "31/03/2012");
        assertEquals("31/03/2012", admDeclaracionesJuradas.mostrarFechaAsumpacionDeclaracionJurada(1));                
    }    
    
    @Test
    public void registroTipoDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarTipoDeclaracionJurada(1, "Fianza");
        assertEquals("Fianza", admDeclaracionesJuradas.mostrarTipoDeclaracionJurada(1));
    }  
    
    @Test
    public void registroFechaReferenciaDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarFechaReferenciaDeclaracionJurada(1, "28/03/2012");
        assertEquals("28/03/2012", admDeclaracionesJuradas.mostrarFechaReferenciaDeclaracionJurada(1));
    }      

    @Test
    public void registroComentarioDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarComentarioDeclaracionJurada(1, "primera declaración");
        assertEquals("primera declaración", admDeclaracionesJuradas.mostrarComentarioDeclaracionJurada(1));
    }
    
    @Test
    public void registroPublicacionDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarPublicacionDeclaracionJurada(1, "20/04/2012");
        assertEquals("20/04/2012", admDeclaracionesJuradas.mostrarPublicacionDeclaracionJurada(1));
    }
    
    @Test
    public void registroFechaDocumentoDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarFechaDocumentoDeclaracionJurada(1, "23/03/2012");
        assertEquals("23/03/2012", admDeclaracionesJuradas.mostrarFechaDocumentoDeclaracionJurada(1));
    }    
    
    @Test
    public void registroNumeroDocumentoDeclaracionJurada() {
        admDeclaracionesJuradas.registrarDeclaracionJurada(1, "Luis Caiguaraico", "Declaración", "25/03/2012");
        admDeclaracionesJuradas.registrarNumeroDocumentoDeclaracionJurada(1, "12345678");
        assertEquals("12345678", admDeclaracionesJuradas.mostrarNumeroDocumentoDeclaracionJurada(1));
    }
    
}

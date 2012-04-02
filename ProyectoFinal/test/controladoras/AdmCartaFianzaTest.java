/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdmCartaFianzaTest {

    AdmCartaFianza admCartaFianza = new AdmCartaFianza();
    
    @Test
    public void registroCartaFianza() {
        admCartaFianza.registrarCartaFianza(1,"");
        assertEquals(0,admCartaFianza.cantidadCartaFianza());
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1");
        assertEquals(1, admCartaFianza.cantidadCartaFianza());
    }    
    
    @Test
    public void eliminacionCartaFianza() {
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1");
        admCartaFianza.registrarCartaFianza(2,"Proveedor 2");
        admCartaFianza.eliminarCartaFianza(1);
        assertEquals(1, admCartaFianza.cantidadCartaFianza());       
    }    
    
    @Test
    public void registroUsuarioCartaFianza() {
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1");
        admCartaFianza.registrarUsuarioCartaFianza(1, "usuario 1");
        assertEquals(1, admCartaFianza.cantidadUsuariosCartaFianza(1));
    }

    @Test
    public void eliminacionUsuarioCartaFianza() {
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1");
        admCartaFianza.registrarUsuarioCartaFianza(1, "usuario 1");
        admCartaFianza.registrarUsuarioCartaFianza(1, "usuario 2");
        admCartaFianza.eliminarUsuarioCartaFianza(1, "usuario 1");
        assertEquals(1, admCartaFianza.cantidadUsuariosCartaFianza(1));
    }  
    
    @Test
    public void registroProveedorCartaFianza() {
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1");
        assertEquals("Proveedor 1", admCartaFianza.mostrarProveedorCartaFianza(1));
    }    

    @Test
    public void registroNumeroContratoCartaFianza() {
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1");
        admCartaFianza.registrarNumeroContratoDeclaracionJurada(1, 123456);
        assertEquals(123456, admCartaFianza.mostrarNumeroContratoCartaFianza(1));
    }        

}

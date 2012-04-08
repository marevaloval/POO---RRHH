/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import modelos.Rol;
import modelos.Usuario;
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
        admCartaFianza.eliminarCartaFianza(1);
        assertEquals(0, admCartaFianza.cantidadCartaFianza());       
    }
    
    @Test
    public void registroUsuarioCartaFianza() {
        Rol rol1 = new Rol(1);
        Usuario usuario1 = new Usuario("luisc", "1234", "", "", "", "", "", "", "", rol1);               
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1");
        admCartaFianza.registrarUsuarioCartaFianza(1, "luisc");
        assertEquals(1, admCartaFianza.cantidadUsuariosCartaFianza(1));
    }

    @Test
    public void eliminacionUsuarioCartaFianza() {
        admCartaFianza.eliminarUsuarioCartaFianza(1, "luisc");
        assertEquals(1, admCartaFianza.cantidadUsuariosCartaFianza(1));
    }  
    
    @Test
    public void registroProveedorCartaFianza() {
        assertEquals("Proveedor 1", admCartaFianza.mostrarProveedorCartaFianza(1));
    }

    @Test
    public void registroNumeroContratoCartaFianza() {
        admCartaFianza.registrarNumeroContratoCartaFianza(1, 123456);
        assertEquals(123456, admCartaFianza.mostrarNumeroContratoCartaFianza(1));
    }        
    
    @Test
    public void registroBancoEmisorCartaFianza() {
        admCartaFianza.registrarBancoEmisorCartaFianza(1, "Banco 1");
        assertEquals("Banco 1", admCartaFianza.mostrarBancoEmisorCartaFianza(1));
    }            
    
    @Test
    public void registroTipoCartaFianza() {
        admCartaFianza.registrarTipoCartaFianza(1, "Tipo 1");
        assertEquals("Tipo 1", admCartaFianza.mostrarTipoCartaFianza(1));
    }             
    
    @Test
    public void registroImporteCartaFianza() {
        double importe = 1500.00;
        admCartaFianza.registrarImporteCartaFianza(1, importe);
        assertEquals(importe, admCartaFianza.mostrarImporteCartaFianza(1), importe);
    }
    
    @Test
    public void registroFechaVencimientoCartaFianza() {
        admCartaFianza.registrarFechaVencimientoCartaFianza(1, "25/02/2012");
        assertEquals("25/02/2012", admCartaFianza.mostrarFechaVencimientoCartaFianza(1));
    }                     
    
    @Test
    public void registroResponsableCartaFianza() {
        admCartaFianza.registrarResponsableCartaFianza(1, "Responsable 1");
        assertEquals("Responsable 1", admCartaFianza.mostrarResponsableCartaFianza(1));
    }
    
    @Test
    public void registroNumeroProcesoSeleccionCartaFianza() {
        admCartaFianza.registrarNumeroProcesoSeleccionCartaFianza(1, 500);
        assertEquals(500, admCartaFianza.mostrarNumeroProcesoSeleccionCartaFianza(1));
    }    
    
    @Test
    public void registroComentarioCartaFianza() {
        admCartaFianza.registrarComentarioCartaFianza(1, "Comentarios");
        assertEquals("Comentarios", admCartaFianza.mostrarComentarioCartaFianza(1));
    }        
    
    @Test
    public void asignacionTareaDeclaracionJurada() {
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1");
        admCartaFianza.asignarTareaCartaFianza(1);
        assertTrue(admCartaFianza.mostrarTareaAsignada(1));
    }    

}

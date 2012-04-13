/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import BaseDatos.BDCartaFianza;
import BaseDatos.BDUsuario;
import modelos.Rol;
import modelos.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdmCartaFianzaTest {

    AdmCartaFianza admCartaFianza = new AdmCartaFianza();
    
    @Test
    public void registroCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"","20/04/2012","Luis C");        
        assertEquals(0,admCartaFianza.cantidadCartaFianza());
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");
        assertEquals(1, admCartaFianza.cantidadCartaFianza());
    }    
    
    @Test
    public void eliminacionCartaFianza() {
        
        BDCartaFianza.limpiarBD();        
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");
        assertEquals(1, admCartaFianza.cantidadCartaFianza());        
        
        admCartaFianza.eliminarCartaFianza(1);
        assertEquals(0, admCartaFianza.cantidadCartaFianza());       
    }
    
    @Test
    public void registroUsuarioCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        BDUsuario.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");
        Rol rol1 = new Rol(1);
        Usuario usuario1 = new Usuario("luisc", "1234", "", "", "", "", "", "", "", rol1);               
        
        admCartaFianza.registrarUsuarioCartaFianza(1, "luisc");
        assertEquals(1, admCartaFianza.cantidadUsuariosCartaFianza(1));        
                
    }

    @Test
    public void eliminacionUsuarioCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        BDUsuario.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");
        Rol rol1 = new Rol(1);
        Usuario usuario1 = new Usuario("luisc", "1234", "", "", "", "", "", "", "", rol1);
        admCartaFianza.registrarUsuarioCartaFianza(1, "luisc");
        
        admCartaFianza.eliminarUsuarioCartaFianza(1, "luisc");
        assertEquals(0, admCartaFianza.cantidadUsuariosCartaFianza(1));
    }  
    
    @Test
    public void registroProveedorCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");
        assertEquals("Proveedor 1", admCartaFianza.mostrarProveedorCartaFianza(1));
    }

    @Test
    public void registroNumeroContratoCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");        
        admCartaFianza.registrarNumeroContratoCartaFianza(1, 123456);
        assertEquals(123456, admCartaFianza.mostrarNumeroContratoCartaFianza(1));
    }        
    
    @Test
    public void registroBancoEmisorCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");          
        admCartaFianza.registrarBancoEmisorCartaFianza(1, "Banco 1");
        assertEquals("Banco 1", admCartaFianza.mostrarBancoEmisorCartaFianza(1));
    }            
    
    @Test
    public void registroTipoCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");                  
        admCartaFianza.registrarTipoCartaFianza(1, "Tipo 1");
        assertEquals("Tipo 1", admCartaFianza.mostrarTipoCartaFianza(1));
    }             
    
    @Test
    public void registroImporteCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");         
        admCartaFianza.registrarImporteCartaFianza(1, 1500);
        assertEquals(1500, admCartaFianza.mostrarImporteCartaFianza(1), 0);
    }
    
    @Test
    public void registroFechaVencimientoCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");             
        admCartaFianza.registrarFechaVencimientoCartaFianza(1, "25/02/2012");
        assertEquals("25/02/2012", admCartaFianza.mostrarFechaVencimientoCartaFianza(1));
    }                     
    
    @Test
    public void registroResponsableCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");                     
        admCartaFianza.registrarResponsableCartaFianza(1, "Responsable 1");
        assertEquals("Responsable 1", admCartaFianza.mostrarResponsableCartaFianza(1));
    }
    
    @Test
    public void registroNumeroProcesoSeleccionCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");         
        admCartaFianza.registrarNumeroProcesoSeleccionCartaFianza(1, 500);
        assertEquals(500, admCartaFianza.mostrarNumeroProcesoSeleccionCartaFianza(1));
    }    
    
    @Test
    public void registroComentarioCartaFianza() {
        
        BDCartaFianza.limpiarBD();
        
        admCartaFianza.registrarCartaFianza(1,"Proveedor 1","20/04/2012","Luis C");          
        admCartaFianza.registrarComentarioCartaFianza(1, "Comentarios");
        assertEquals("Comentarios", admCartaFianza.mostrarComentarioCartaFianza(1));
    }        
    
    @Test
    public void asignacionTareaDeclaracionJurada() {
        
        BDCartaFianza.limpiarBD();
                
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1","20/04/2012","Luis C");
        admCartaFianza.registrarNumeroContratoCartaFianza(1, 123456);
        admCartaFianza.registrarBancoEmisorCartaFianza(1, "Banco 1");
        admCartaFianza.registrarTipoCartaFianza(1, "Tipo 1");
        admCartaFianza.registrarImporteCartaFianza(1, 1500);
        admCartaFianza.registrarFechaVencimientoCartaFianza(1, "25/02/2012");
        admCartaFianza.registrarResponsableCartaFianza(1, "Responsable 1");
        admCartaFianza.asignarTareaCartaFianza(1);
        assertTrue(admCartaFianza.mostrarTareaAsignada(1));
    }    

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import BaseDatos.BDDeclaracionJurada;
import BaseDatos.BDTareasGenerales;
import modelos.Rol;
import modelos.TareasGenerales;
import modelos.Usuario;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Grupo
 */
public class AdmTareasGeneralesTest {
    AdmTareasGenerales admTareasGenerales = new AdmTareasGenerales();
    private int a = 1;
    @Test
    public void registroTareasGenerales() {
        
        BDTareasGenerales.limpiarBD();

        admTareasGenerales.registrarTareaGeneral(1,"","25/03/2012","Responsable 1");
        assertEquals(0,admTareasGenerales.cantidadTareasGenerales());

        admTareasGenerales.registrarTareaGeneral(1, "Asunto 1","25/03/2012","Responsable 1");
        assertEquals(1,admTareasGenerales.cantidadTareasGenerales());     
        
    }
    
    @Test
    public void eliminacionTareasGenerales() {
        
        BDTareasGenerales.limpiarBD();
        
        admTareasGenerales.registrarTareaGeneral(1, "Asunto 1","25/03/2012","Responsable 1");
        admTareasGenerales.eliminarTareaGeneral(1);
        assertEquals(0, admTareasGenerales.cantidadTareasGenerales());       
    }
        
    @Test
    public void registroUsuarioDeclaracionJurada() {
        
        BDTareasGenerales.limpiarBD();
        
        Rol rol1 = new Rol(1);
        Usuario usuario1 = new Usuario("bettyp", "1234", "", "", "", "", "", "", "", rol1);
        admTareasGenerales.registrarTareaGeneral(1, "Asunto 1","25/03/2012","Responsable 1");  
        admTareasGenerales.registrarUsuarioTareaGeneral(1, "bettyp");
        assertEquals(1, admTareasGenerales.cantidadUsuariosTareaGeneral(1));
    }    
    
    @Test
    public void eliminacionUsuarioDeclaracionJurada() {
        
        BDTareasGenerales.limpiarBD();
        
        Rol rol1 = new Rol(1);
        Usuario usuario1 = new Usuario("bettyp", "1234", "", "", "", "", "", "", "", rol1);
        admTareasGenerales.registrarTareaGeneral(1, "Asunto 1","25/03/2012","Responsable 1");  
        admTareasGenerales.registrarUsuarioTareaGeneral(1, "bettyp");        
        admTareasGenerales.eliminarUsuarioTareaGeneral(1, "bettyp");
        assertEquals(0, admTareasGenerales.cantidadUsuariosTareaGeneral(1));
        
    }    
    
    @Test
    public void SiNoIngresoElAsuntoDebeDarError() {
        assertFalse(admTareasGenerales.verificarAsunto(""));
        System.out.println("Asunto no puede estar vacio");
    }

    @Test
    public void SiNoIngresoLaFechaVencimientoDebeDarError() {
        assertFalse(admTareasGenerales.verificarFechaVencimiento(""));
        System.out.println("Fecha de vencimiento no puede estar vacio");
    }

    @Test
    public void SiNoIngresoElResponsableDebeDarError() {
        assertFalse(admTareasGenerales.verificarResponsable(""));
        System.out.println("Responsable no puede estar vacio");
    } 
    
    @Test
    public void registroComentarioTareasGenerales() {
              
        BDTareasGenerales.limpiarBD();
        
        Rol rol1 = new Rol(1);
        Usuario usuario1 = new Usuario("marcosl", "1234", "", "", "", "", "", "", "", rol1);
        admTareasGenerales.registrarTareaGeneral(1, "Asunto 1","25/03/2012","Responsable 1");  
        admTareasGenerales.registrarUsuarioTareaGeneral(1, "marcosl");

        if ((TareasGenerales.getTareasGenerales().get(0).getComentario())== "" ){
            a = 0;
        }
        assertEquals(1, a);
        System.out.println("Ud no ingreso ningun comentario");
    } 
    
}

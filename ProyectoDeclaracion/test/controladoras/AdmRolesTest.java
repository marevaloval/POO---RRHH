package controladoras;
import modelos.Rol;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class AdmRolesTest {
    AdmRoles admRol = new AdmRoles();
    private int codigoRol = 1;
    private String nombre = "Marcos";
    private String descripcion = "prueba";
    private String mensajeRecibido;
    private int numeroRoles;
    
    @Test
    public void registrarRol() {
        //Rol rol1 = new Rol(1);
        admRol.registrarRol(codigoRol, nombre, descripcion);
//        Rol rol = new Rol(codigoRol);
        numeroRoles = admRol.cantidadRoles();
        assertEquals(0, numeroRoles);
    }   
    
    @Test
    public void eliminarRol() {
        admRol.registrarRol(codigoRol,nombre,descripcion);
        
    }
    
    
}





//
//import modelos.Usuario;


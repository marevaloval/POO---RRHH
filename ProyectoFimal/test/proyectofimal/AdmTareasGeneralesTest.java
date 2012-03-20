package proyectofimal;

import controladoras.AdmTareasGenerales;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Grupo
 */
public class AdmTareasGeneralesTest {
    AdmTareasGenerales admTareasGenerales = new AdmTareasGenerales();

    @Test
    public void SiNoIngresoElAsuntoDebeDarError() {
        assertFalse(admTareasGenerales.verificarAsunto(null));
        System.out.println("Asunto no puede estar vacio");
    }

    @Test
    public void SiNoIngresoLaFechaVencimientoDebeDarError() {
        assertFalse(admTareasGenerales.verificarFechaVencimiento(null));
        System.out.println("Fecha de vencimiento no puede estar vacio");
    }

    @Test
    public void SiNoIngresoElResponsableDebeDarError() {
        assertFalse(admTareasGenerales.verificarResponsable(null));
        System.out.println("Responsable no puede estar vacio");
    }
    
    @Test
    public void SiNoExisteAsuntoDebeMandarMensaje() {
        assertNull(admTareasGenerales.existeAsunto("Asunto006"));
        System.out.println("Asunto no existe");
    }

    @Test
    public void SiExisteAsuntoDebeMandarMensaje() {
        assertNotNull(admTareasGenerales.existeAsunto("Asunto001"));
        System.out.println("Asunto existe");
    }
}
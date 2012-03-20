package proyectofimal;

import controladoras.AdmDeclaracionesJuradas;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdmDeclaracionesJuradasTest {
    AdmDeclaracionesJuradas admDeclaracionesJuradas = new AdmDeclaracionesJuradas();
    
    @Test
    public void SiNoIngresoElResponsableDebeDarError() {
        assertFalse(admDeclaracionesJuradas.verificarResponsable(null));
        System.out.println("Responsable no puede estar vacio");
    }

    @Test
    public void SiNoIngresoElMotivoDebeDarError() {
        assertFalse(admDeclaracionesJuradas.verificarMotivo(null));
        System.out.println("Motivo no puede estar vacio");
    }

    @Test
    public void SiNoIngresoLaFechaVencimientoDebeDarError() {
        assertFalse(admDeclaracionesJuradas.verificarFechaVencimiento(null));
        System.out.println("Fecha de vencimiento no puede estar vacio");
    }
}

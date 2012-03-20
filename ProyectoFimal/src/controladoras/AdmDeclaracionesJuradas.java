package controladoras;

import java.util.ArrayList;
import modelos.DeclaracionesJuradas;

public class AdmDeclaracionesJuradas {
    private ArrayList<DeclaracionesJuradas> dbDeclaraciones = new ArrayList<DeclaracionesJuradas>();
    
    private void simularTabla() {
        this.dbDeclaraciones.add(new DeclaracionesJuradas("Miguel","Motivo1","21/03/2012"));
        this.dbDeclaraciones.add(new DeclaracionesJuradas("Juan","Motivo2","21/03/2012"));
        this.dbDeclaraciones.add(new DeclaracionesJuradas("Pedro","Motivo3","21/03/2012"));
        this.dbDeclaraciones.add(new DeclaracionesJuradas("Luis","Motivo4","21/03/2012"));
    }
    
    public boolean verificarResponsable(String responsable) {
        if (responsable != null) {
            return true;
        }
        return false;
    }

    public boolean verificarMotivo(String motivo) {
        if (motivo != null) {
            return true;
        }
        return false;
    }

    public boolean verificarFechaVencimiento(String fechaVencimiento) {
        if (fechaVencimiento!=null) {
            return true;
        }
        return false;
    }
}

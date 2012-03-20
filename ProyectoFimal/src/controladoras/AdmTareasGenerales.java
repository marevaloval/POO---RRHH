package controladoras;

import java.util.ArrayList;
import modelos.TareasGenerales;

public class AdmTareasGenerales {
    private ArrayList<TareasGenerales> dbTareas = new ArrayList<TareasGenerales>();
    
    // aca tengo una duda si la tarea necesita un idTarea. Preguntar al profe.
    private void simularTabla() {
        this.dbTareas.add(new TareasGenerales("Asunto001","16/03/2012","Miguel"));
        this.dbTareas.add(new TareasGenerales("Asunto002","16/03/2012","Juan"));;
        this.dbTareas.add(new TareasGenerales("Asunto003","16/03/2012","Marcos"));;
        this.dbTareas.add(new TareasGenerales("Asunto004","16/03/2012","Pedro"));;
    }
    
    public boolean verificarAsunto(String asunto) {
        if (asunto!=null) {
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

    public boolean verificarResponsable(String responsable) {
        if (responsable!=null) {
            return true;
        }
        return false;
    }
    
    public TareasGenerales existeAsunto(String asunto) {
        simularTabla();
        TareasGenerales asuntoEncontrado = null;
        for (TareasGenerales tareasGenerales : dbTareas) {
            if (tareasGenerales.getAsunto().equals(asunto)) {
                asuntoEncontrado = tareasGenerales;
            }
        }
        return asuntoEncontrado;
    }
}
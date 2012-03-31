package controladoras;

import java.util.ArrayList;
import modelos.TareasGenerales;

public class AdmTareasGenerales {
    private ArrayList<TareasGenerales> dbTareas = new ArrayList<TareasGenerales>();
        
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
        TareasGenerales asuntoEncontrado = null;
        for (TareasGenerales tareasGenerales : dbTareas) {
            if (tareasGenerales.getAsunto().equals(asunto)) {
                asuntoEncontrado = tareasGenerales;
            }
        }
        return asuntoEncontrado;
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.TareasGenerales;

/**
 *
 * @author Sebas
 */
public class BDTareasGenerales {
    
    static ArrayList<TareasGenerales> arTareasGenerales = new ArrayList<TareasGenerales>();
    
    public static ArrayList<TareasGenerales> simularDataTareasGenerales() {        
        return arTareasGenerales;
    }
    
    public static void agregarTareasGeneralesBD(TareasGenerales tareasGenerales) {
        arTareasGenerales.add(tareasGenerales);
    }
    
    public static void eliminarTareasGeneralesBD(TareasGenerales tareasGenerales) {
        for (TareasGenerales objTareasGenerales : arTareasGenerales) {
            if (objTareasGenerales == tareasGenerales) {
                arTareasGenerales.remove(tareasGenerales);
                return;
            }
        }
    }
    
    public static void limpiarBD() {
        arTareasGenerales.clear();;
    }      
    
}

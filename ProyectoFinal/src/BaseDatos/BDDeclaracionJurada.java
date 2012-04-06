/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.DeclaracionesJuradas;

public class BDDeclaracionJurada {        
    
    static ArrayList<DeclaracionesJuradas> arDeclaracionJurada = new ArrayList<DeclaracionesJuradas>();
    
    public static ArrayList<DeclaracionesJuradas> simularDataDeclaracionJurada() {        
        return arDeclaracionJurada;
    }
    
    public static void agregarDeclaracionJuradaBD(DeclaracionesJuradas declaracionJurada) {
        arDeclaracionJurada.add(declaracionJurada);
    }            
    
    public static void eliminarDeclaracionJuradaBD(DeclaracionesJuradas declaracionJurada) {
        for (DeclaracionesJuradas declaracionesJuradas : arDeclaracionJurada) {
            if (declaracionesJuradas == declaracionJurada) {
                arDeclaracionJurada.remove(declaracionesJuradas);
                return;
            }
        }        
        
    }
    
}

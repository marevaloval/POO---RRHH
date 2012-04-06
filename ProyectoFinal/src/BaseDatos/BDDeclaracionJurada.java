/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.DeclaracionesJuradas;

public class BDDeclaracionJurada {        
    
    static ArrayList<DeclaracionesJuradas> objDeclaracionJurada = new ArrayList<DeclaracionesJuradas>();
    
    public static ArrayList<DeclaracionesJuradas> simularDataDeclaracionJurada() {        
        return objDeclaracionJurada;
    }
    
    public static void agregarDeclaracionJuradaBD(DeclaracionesJuradas declaracionJurada) {
        objDeclaracionJurada.add(declaracionJurada);
    }            
    
    public static void eliminarDeclaracionJuradaBD(DeclaracionesJuradas declaracionJurada) {
        for (DeclaracionesJuradas declaracionesJuradas : objDeclaracionJurada) {
            if (declaracionesJuradas == declaracionJurada) {
                objDeclaracionJurada.remove(declaracionesJuradas);
            }
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.CartaFianza;

public class BDCartaFianza {
    
    static ArrayList<CartaFianza> arCartaFianza = new ArrayList<CartaFianza>();
    
    public static ArrayList<CartaFianza> simularDataCartaFianza() {        
        return arCartaFianza;
    }
    
    public static void agregarCartaFianzaBD(CartaFianza objCartaFianza) {
        arCartaFianza.add(objCartaFianza);
    }            
    
    public static void eliminarCartaFianzaBD(CartaFianza cartaFianza) {
        for (CartaFianza cartasFianzas : arCartaFianza) {
            if (cartasFianzas == cartaFianza) {
                arCartaFianza.remove(cartaFianza);                
                return;
            }
        }
    }    
    
    public static void limpiarBD() {
        arCartaFianza.clear();;
    }
    
}

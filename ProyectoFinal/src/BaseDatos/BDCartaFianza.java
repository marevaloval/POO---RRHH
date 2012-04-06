/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.CartaFianza;

public class BDCartaFianza {
    
    static ArrayList<CartaFianza> objCartaFianza = new ArrayList<CartaFianza>();
    
    public static ArrayList<CartaFianza> simularDataCartaFianza() {        
        return objCartaFianza;
    }
    
    public static void agregarCartaFianzaBD(CartaFianza cartaFianza) {
        objCartaFianza.add(cartaFianza);
    }            
    
    public static void eliminarCartaFianzaBD(CartaFianza cartaFianza) {
        for (CartaFianza cartasFianzas : objCartaFianza) {
            if (cartasFianzas == cartaFianza) {
                objCartaFianza.remove(cartasFianzas);
            }
        }
    }    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controladoras.AdmDeclaracionesJuradas;

public class ConsolaDeclaracionJurada {
    
    // Esta clase por ahora la estoy usando para hacer pruebas - LC
    public static void main(String[] args) {
     
        AdmDeclaracionesJuradas admDeclaracionesJuradas = new AdmDeclaracionesJuradas();  

        admDeclaracionesJuradas.registrarDeclaracionJurada(1,"Luis Caiguaraico", "", "25/03/2012");
        System.out.println(admDeclaracionesJuradas.cantidadDeclaracionesJuradas());
        
    }    
    
}

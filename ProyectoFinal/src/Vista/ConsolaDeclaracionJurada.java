/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import controladoras.AdmDeclaracionesJuradas;
import controladoras.AdmCartaFianza;

public class ConsolaDeclaracionJurada {
    
    // Esta clase por ahora la estoy usando para hacer pruebas - LC
    public static void main(String[] args) {
     
        /*AdmDeclaracionesJuradas admDeclaracionesJuradas = new AdmDeclaracionesJuradas();  

        admDeclaracionesJuradas.registrarDeclaracionJurada(1,"Luis Caiguaraico", "", "25/03/2012");
        System.out.println(admDeclaracionesJuradas.cantidadDeclaracionesJuradas());*/
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1");
        admCartaFianza.registrarCartaFianza(2, "Proveedor 2");
        System.out.println(admCartaFianza.cantidadCartaFianza());
        admCartaFianza.eliminarCartaFianza(1);
        System.out.println(admCartaFianza.cantidadCartaFianza());
        
        
    }    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import controladoras.AdmDeclaracionesJuradas;
import controladoras.AdmCartaFianza;
import modelos.Rol;
import modelos.Usuario;

public class ConsolaDeclaracionJurada {
    
    // Esta clase por ahora la estoy usando para hacer pruebas - LC
    public static void main(String[] args) {
     
        /*AdmDeclaracionesJuradas admDeclaracionesJuradas = new AdmDeclaracionesJuradas();  

        admDeclaracionesJuradas.registrarDeclaracionJurada(1,"Luis Caiguaraico", "", "25/03/2012");
        System.out.println(admDeclaracionesJuradas.cantidadDeclaracionesJuradas());*/
        /*AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1");
        admCartaFianza.registrarCartaFianza(2, "Proveedor 2");
        System.out.println(admCartaFianza.cantidadCartaFianza());
        admCartaFianza.eliminarCartaFianza(1);
        System.out.println(admCartaFianza.cantidadCartaFianza());
        System.out.println("linea 1 \n linea 2");*/
        AdmCartaFianza admCartaFianza = new AdmCartaFianza();
        Rol rol1 = new Rol(1);
        Usuario usuario1 = new Usuario("luisc", "1234", "", "", "", "", "", "", "", rol1);      
        System.out.println("uno");
        admCartaFianza.registrarCartaFianza(1, "Proveedor 1","20/04/2012","Luis C");
        System.out.println("uno");
        admCartaFianza.registrarUsuarioCartaFianza(1, "luisc");
        System.out.println(admCartaFianza.cantidadUsuariosCartaFianza(1));
        
        
    }    
    
}

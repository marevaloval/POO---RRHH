/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;
import modelos.Rol;

public class BDRol {
    
    static ArrayList<Rol> arRoles = new ArrayList<Rol>();    
    
    public static ArrayList<Rol> simularDataRoles() {        
        return arRoles;
    }
    
    public static void agregarRolesBD(Rol rol) {
        arRoles.add(rol);
    }            
    
    public static void eliminarRolBD(Rol rol) {
        for (Rol objRoles : arRoles) {
            if (objRoles == rol) {
                arRoles.remove(objRoles);
                return;
            }
        }
    }    
    
}

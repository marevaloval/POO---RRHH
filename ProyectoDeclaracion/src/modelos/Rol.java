/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import BaseDatos.BDRol;
import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class Rol {
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private ArrayList<Acceso> arAccesos;

    public Rol(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }        
    
    public static Rol buscarRol(int codigoRol) {
        for (Rol objRol : BDRol.simularDataRoles()) {
            if (objRol.getCodigo() == codigoRol) {
                return objRol;
            }
        }        
        return null;
    }    
    
    public void actualizarAcceso(String modulo, boolean acceso, boolean adicionar, boolean editar, boolean eliminar) {
        for (Acceso objAcceso : arAccesos) {
            if (objAcceso.getModulo().equals(modulo)) {
                objAcceso.setAcceso(acceso);
                objAcceso.setAdicionar(adicionar);
                objAcceso.setEditar(editar);
                objAcceso.setEliminar(eliminar);
            }
         }
    }
    
    public static void eliminarRol(int codigoRol) {
        for (Rol objRol : BDRol.simularDataRoles()) {
            if (objRol.getCodigo() == codigoRol) {
                BDRol.eliminarRolBD(objRol);
                return;
            }
        }
    }
    
    public static ArrayList<Rol> getRoles() {
        return BDRol.simularDataRoles();
    }
    

}

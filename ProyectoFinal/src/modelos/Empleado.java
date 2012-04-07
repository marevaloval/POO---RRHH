package modelos;

import java.util.ArrayList;
import BaseDatos.BDEmpleado;
import BaseDatos.BDCartaFianza;
import BaseDatos.BDDeclaracionJurada;
import BaseDatos.BDTareasGenerales;

public class Empleado {
    
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
        BDEmpleado.agregarEmpleadoBD(this);
    }

    public String getNombre() {
        return nombre;
    }
    
    public static ArrayList<Empleado> getEmpleados() {
        return BDEmpleado.simularDataEmpleados();
    }
    
    public static ArrayList<Tarea> getTareas(String nombre) {
        ArrayList<Tarea> arTareas = new ArrayList<Tarea>();
        
        // Carta Fianza
        for (CartaFianza objCartaFianza : BDCartaFianza.simularDataCartaFianza()) {
            for (Empleado objEmpleado : objCartaFianza.getEmpleadoNotificacion()) {
                if (objEmpleado.getNombre().equals(nombre)) {
                    arTareas.add(objCartaFianza);
                    break;
                }
            }
        }
        
        // Declaración Jurada
        for (DeclaracionesJuradas objDeclaracionesJuradas : BDDeclaracionJurada.simularDataDeclaracionJurada()) {
            for (Empleado objEmpleado : objDeclaracionesJuradas.getEmpleadoNotificacion()) {
                if (objEmpleado.getNombre().equals(nombre)) {
                    arTareas.add(objDeclaracionesJuradas);
                    break;
                }
            }
        }
        
        // Tareas Generales
        for (TareasGenerales objTareasGenerales : BDTareasGenerales.simularDataTareasGenerales()) {
            for (Empleado objEmpleado : objTareasGenerales.getEmpleadoNotificacion()) {
                if (objEmpleado.getNombre().equals(nombre)) {
                    arTareas.add(objTareasGenerales);
                    break;                    
                }
            }
        }
        return arTareas;
    }
    
}
package modelos;

import java.util.ArrayList;
import BaseDatos.BDEmpleado;

public class Empleado {
    
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public static ArrayList<Empleado> getEmpleados() {
        BDEmpleado dbEmpleados = new BDEmpleado();
        return dbEmpleados.simulaDataEmpleados();
    }
    
}
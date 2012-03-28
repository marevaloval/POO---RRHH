package modelos;

public class Empleado {
    private String codigoEmpleado;

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Empleado(String codigoEmpleado, String nombre, String apellido, String user, String password) {
        //super(nombre, apellido, user, password);
        this.codigoEmpleado = codigoEmpleado;
    }
}
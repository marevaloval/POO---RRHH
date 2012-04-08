package modelos;

import BaseDatos.BDCartaFianza;
import BaseDatos.BDDeclaracionJurada;
import BaseDatos.BDTareasGenerales;
import BaseDatos.BDUsuario;
import java.util.ArrayList;

public class Usuario {
    private String usuario;
    private String contrasenha;
    private Rol rol;    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correo;
    private String fechaIngreso;
    private String cargo;
    private String dni;
    private boolean transacciones;

    public Usuario(String usuario, String contrasenha, String nombre, String apellidoPaterno, String apellidoMaterno, 
                   String correo, String fechaIngreso, String cargo, String dni, Rol rol) {
        this.usuario = usuario;
        this.contrasenha = contrasenha;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.dni = dni;
        this.rol = rol;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public boolean getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(boolean transacciones) {
        this.transacciones = transacciones;
    }        
    
    public static ArrayList<Usuario> getUsuarios() {
        return BDUsuario.simularDataUsuarios();
    }
    
    public static void eliminarUsuario(String usuario) {
        for (Usuario objUsuario : BDUsuario.simularDataUsuarios()) {
            if (objUsuario.getUsuario().equals(usuario)) {
                BDUsuario.eliminarUsuarioBD(objUsuario);
                return;
            }
        }
    }
    
    public static boolean verificaExistenciaUsuario(String usuario) {
        for (Usuario objUsuario : BDUsuario.simularDataUsuarios()) {
            if (objUsuario.getUsuario().equals(usuario)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean validaUsuarioContrasenha(String usuario, String contasenha) {
        for (Usuario objUsuario : BDUsuario.simularDataUsuarios()) {
            if (objUsuario.getUsuario().equals(usuario) && objUsuario.getContrasenha().equals(contasenha)) {
                return true;
            }
        }
        return false;
    }    
    
    public static Usuario buscarUsuario(String usuario) {
        for (Usuario objUsuario : BDUsuario.simularDataUsuarios()) {
            if (objUsuario.getUsuario().equals(usuario)) {
                return objUsuario;
            }
        }        
        return null;
    }
    
    public static ArrayList<Tarea> getTareas(String nombre) {
        ArrayList<Tarea> arTareas = new ArrayList<Tarea>();
        
        // Carta Fianza
        for (CartaFianza objCartaFianza : BDCartaFianza.simularDataCartaFianza()) {
            for (Usuario objUsuario : objCartaFianza.getUsuarioNotificacion()) {
                if (objUsuario.getNombre().equals(nombre)) {
                    arTareas.add(objCartaFianza);
                    break;
                }
            }
        }
        
        // Declaración Jurada
        for (DeclaracionesJuradas objDeclaracionesJuradas : BDDeclaracionJurada.simularDataDeclaracionJurada()) {
            for (Usuario objUsuario : objDeclaracionesJuradas.getUsuarioNotificacion()) {
                if (objUsuario.getNombre().equals(nombre)) {
                    arTareas.add(objDeclaracionesJuradas);
                    break;
                }
            }
        }
        
        // Tareas Generales
        for (TareasGenerales objTareasGenerales : BDTareasGenerales.simularDataTareasGenerales()) {
            for (Usuario objUsuario : objTareasGenerales.getUsuarioNotificacion()) {
                if (objUsuario.getNombre().equals(nombre)) {
                    arTareas.add(objTareasGenerales);
                    break;                    
                }
            }
        }
        return arTareas;
    }    

}

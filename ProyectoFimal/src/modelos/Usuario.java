package modelos;

public class Usuario {
    private String nombre,apellido,user,password;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Usuario(String nombre, String apellido, String user, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.password = password;
    }
}

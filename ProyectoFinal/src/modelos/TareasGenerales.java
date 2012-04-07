package modelos;

public class TareasGenerales extends Tarea {
    private String asunto;
    private String fechaVencimiento;
    private String responsable;
    private String comentario;

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public TareasGenerales(String asunto, String fechaVencimiento, String responsable) {
        super("Tareas Generales");
        this.asunto = asunto;
        this.fechaVencimiento = fechaVencimiento;
        this.responsable = responsable;
    }
}
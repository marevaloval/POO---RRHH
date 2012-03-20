package modelos;

public class DeclaracionesJuradas {
    private String responsable;
    private String motivo;
    private String fechaVencimiento;

    public DeclaracionesJuradas(String responsable, String motivo, String fechaVencimiento) {
        this.responsable = responsable;
        this.motivo = motivo;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}

public class Tarea {
    private String nombre;
    private String responsable;
    private EstadoTarea estado;

    public Tarea(String nombre, String responsable) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.estado = EstadoTarea.PENDIENTE;
    }

    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
    }

    public EstadoTarea getEstado() {
        return estado;
    }
}

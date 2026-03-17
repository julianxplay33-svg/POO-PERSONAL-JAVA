public class Libro implements Prestable {
    private String titulo;
    private boolean disponible = true;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getTitulo() {
        return titulo;
    }
}

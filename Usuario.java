import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Libro> librosPrestados = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public boolean puedePrestar() {
        return librosPrestados.size() < 3;
    }

    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
}

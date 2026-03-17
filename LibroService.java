public class LibroService {

    public void prestarLibro(Usuario usuario, Libro libro) {
        if (!usuario.puedePrestar()) {
            System.out.println("El usuario ya tiene 3 libros prestados");
            return;
        }

        if (!libro.isDisponible()) {
            System.out.println("El libro no está disponible");
            return;
        }

        usuario.agregarLibro(libro);
        libro.prestar();
        System.out.println("Préstamo realizado correctamente");
    }
}

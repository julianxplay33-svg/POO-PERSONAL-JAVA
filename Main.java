public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Juan");

        Libro l1 = new Libro("El principito");
        Libro l2 = new Libro("1984");
        Libro l3 = new Libro("Clean Code");

        LibroService service = new LibroService();

        service.prestarLibro(u1, l1);
        service.prestarLibro(u1, l2);
        service.prestarLibro(u1, l3);

        System.out.println("Libros de " + u1.getNombre() + ":");

        for (Libro l : u1.getLibrosPrestados()) {
            System.out.println(l.getTitulo());
        }
    }
}

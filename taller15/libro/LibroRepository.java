package taller15.libro;

public class LibroRepository {
    public void guardarLibro(Libro libro) {
        System.out.println("Guardando libro: "+ libro.getTitulo()+ " en la base de datos");
    }
}

package taller15.libro;

public class ReporteLibroService {
    public void generarReporte(Libro libro) {
        System.out.println("=== REPORTE DEL LIBRO ===");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
    }
}

package taller15.libro;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry");

        ReporteLibroService reporte = new ReporteLibroService();
        LibroRepository repositorio = new LibroRepository();

        reporte.generarReporte(libro);
        repositorio.guardarLibro(libro);
    }
}

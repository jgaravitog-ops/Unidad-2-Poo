package taller15;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public void generarReporte() {
        System.out.println("Generando reporte del libro...");
    }

    public void guardarLibro() {
        System.out.println("Guardando libro en la base de datos...");
    }
}
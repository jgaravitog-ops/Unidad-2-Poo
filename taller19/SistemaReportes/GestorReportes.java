package taller19.SistemaReportes;

public class GestorReportes {
    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }
    public void crearReporte(String contenido) {
        generador.generarReporte(contenido);
    }
}

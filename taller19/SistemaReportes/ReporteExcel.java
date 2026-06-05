package taller19.SistemaReportes;

public class ReporteExcel implements GeneradorReporte{
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte Excel...");
        System.out.println(contenido);
    }
}

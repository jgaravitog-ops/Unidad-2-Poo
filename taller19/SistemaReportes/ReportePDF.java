package taller19.SistemaReportes;

public class ReportePDF implements GeneradorReporte{
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte PDF...");
        System.out.println(contenido);
    }
}

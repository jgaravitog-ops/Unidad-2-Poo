package taller19.SistemaReportes;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte reporte = new ReportePDF();
        GestorReportes gestor = new GestorReportes(reporte);

        gestor.crearReporte("Reporte de ventas del mes.");
    }
}

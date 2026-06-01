package taller16.documento;

public class Main {
    public static void main(String[] args) {

        GestorDocumento gestor = new GestorDocumento();

        gestor.exportarDocumento(new ExportarPdf(),"Reporte de ventas");
        gestor.exportarDocumento(new ExportarWord(),"Reporte de ventas");
        gestor.exportarDocumento(new ExportarExcel(),"Reporte de ventas");
    }
}

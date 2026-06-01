package taller16.documento;

public class ExportarPdf extends Documento {
    @Override
    public void exportar(String contenido) {

        System.out.println("Exportando a PDF: " + contenido);
    }
}

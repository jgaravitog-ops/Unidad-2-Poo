package taller16.documento;

public class ExportarExcel extends Documento {

    @Override
    public void exportar(String contenido) {

        System.out.println("Exportando a Excel: " + contenido);
    }
}

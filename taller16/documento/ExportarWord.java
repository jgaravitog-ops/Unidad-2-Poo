package taller16.documento;

public class ExportarWord extends Documento {
    @Override
    public void exportar(String contenido) {

        System.out.println("Exportando a Word: " + contenido);
    }
}

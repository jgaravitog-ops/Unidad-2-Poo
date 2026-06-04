package taller18;

public class Camion implements Conducible,Carga{
    @Override
    public void conducir() {
        System.out.println("El camión está circulando.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancía.");
    }
}

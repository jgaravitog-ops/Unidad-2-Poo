package taller15.producto;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("Computador", 2500000);

        PrecioService precioService = new PrecioService();
        EtiquetaService etiquetaService = new EtiquetaService();

        System.out.println("Precio con IVA: "+ precioService.calcularPrecioConIVA(producto));
        etiquetaService.generarEtiqueta(producto);
    }
}

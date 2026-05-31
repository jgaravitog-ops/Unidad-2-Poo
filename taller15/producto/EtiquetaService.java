package taller15.producto;

public class EtiquetaService {
    public void generarEtiqueta(Producto producto) {
        System.out.println("===== ETIQUETA =====");
        System.out.println("Producto: "
                + producto.getNombre());
    }
}

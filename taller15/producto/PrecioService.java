package taller15.producto;

public class PrecioService {
    public double calcularPrecioConIVA(Producto producto) {
        return producto.getPrecio() * 1.19;
    }
}
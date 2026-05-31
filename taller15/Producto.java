package taller15;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularPrecioConIVA() {
        return precio * 1.19;
    }

    public void generarEtiqueta() {
        System.out.println("Producto: " + nombre);
    }
}

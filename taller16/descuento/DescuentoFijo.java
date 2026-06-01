package taller16.descuento;

public class DescuentoFijo extends Descuento {
    private double valorFijo;

    public DescuentoFijo(double valorFijo) {
        this.valorFijo = valorFijo;
    }

    @Override
    public double calcularDescuento(double precio) {
        return valorFijo;
    }
}

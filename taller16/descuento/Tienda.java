package taller16.descuento;

public class Tienda {

    public void aplicarDescuento(Descuento descuento, double precio) {

        double valorDescuento = descuento.calcularDescuento(precio);

        double total = precio - valorDescuento;

        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento: $" + valorDescuento);
        System.out.println("Total a pagar: $" + total);
    }
}
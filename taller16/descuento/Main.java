package taller16.descuento;

public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        Descuento porcentaje = new DescuentoPorcentaje(15);

        Descuento fijo = new DescuentoFijo(50000);

        tienda.aplicarDescuento(porcentaje, 300000);
        tienda.aplicarDescuento(fijo, 300000);
    }
}

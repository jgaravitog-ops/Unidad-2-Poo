package taller18;

public class BancaVirtual implements PagoFactura,Transferencia{
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia realizada por $" + monto);
    }
    @Override
    public void pagarFactura(double valor) {
        System.out.println("Factura pagada por $" + valor);
    }
}

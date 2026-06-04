package taller18;

public class CajeroAutomatico implements Retiro{
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro realizado por: $"+monto);
    }
}

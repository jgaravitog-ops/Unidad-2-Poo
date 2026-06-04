package taller17;

public class CuentaAhorro extends CuentaBancaria{
    public CuentaAhorro(double saldo) {
        super(saldo);
    }
    @Override
    public void depositar(double monto) {
        super.depositar(monto);
    }
    @Override
    public void retirar(double monto) {
        super.retirar(monto);
    }
    
}

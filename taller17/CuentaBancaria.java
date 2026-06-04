package taller17;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double monto){
        saldo += monto;
    }
    public void retirar(double monto){
        if (monto<=saldo) {
            saldo -= monto;
        }else{
            System.out.println("saldo insuficiente");
        }
    }
    public double getSaldo() {
        return saldo;
    }
    
}

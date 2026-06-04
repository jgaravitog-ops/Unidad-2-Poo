package taller17;

public class Main {
    public static void main(String[] args) {
        //ejercicio1
        Figura circulo1 = new Circulo(4);
        Figura rectangulo1 = new Rectangulo(9, 12);

        System.out.println("Area circulo: "+circulo1.calcularArea());
        System.out.println("Area Rectangulo: "+ rectangulo1.calcularArea());



        System.out.println("--------------------");
        //ejercicio2
        CuentaBancaria cuenta1 = new CuentaAhorro(1000);

        cuenta1.depositar(500);
        cuenta1.retirar(300);
        System.out.println("Saldo de la cuenta: "+cuenta1.getSaldo());
    }
}

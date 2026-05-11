package taller7;

public class Main {

    public static void main(String[] args) {
        //  Ejercicio 1
        Empleado emp1 = new Empleado("Pablo", 10000);
        
        System.out.println("Nombre: "+emp1.nombre);
        System.out.println("Salario: "+ emp1.getSalario());
        emp1.setSalario(-1000);

        System.out.println("---------------");
        //  Ejercicio 2
        CuentaBancaria cBancaria1 = new CuentaBancaria("123", 2028, "debito");

        //System.out.println("numeroCuenta: "+ cBancaria1.numeroCuenta);
        cBancaria1.mostrarDetalles();
        
    }
}
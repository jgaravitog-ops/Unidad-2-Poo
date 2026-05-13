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
        
        System.out.println("---------------");
        //Ejercicio3
        Utilidades operacion = new Utilidades();

        System.out.println("Suma 12 y 6 es: "+operacion.suma(12, 6));
        System.out.println("Resta 12 y 6 es: "+operacion.resta(12, 6));
        System.out.println("Multiplicar 12 y 6 es: "+operacion.multiplicacion(12, 6));
        System.out.println("Dividir 12 entre 6 es: "+operacion.division(12, 6));
    }
}
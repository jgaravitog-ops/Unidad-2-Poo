package taller9;

public class Main {

    public static void main(String[] args) {
        //ejercicio 1
        Empleado emp1 = new Empleado("Jose Jose", 35, "Gerente");
        emp1.mostrarDetalles();

        System.out.println("-------------");
        //eejercicio 2
        Pez pez1 = new Pez("Mojara", "Dulce");
        System.out.println(pez1.toString());

    }
}
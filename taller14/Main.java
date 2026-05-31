package taller14;

public class Main {
    public static void main(String[] args) {
        //ejercicio1
        Circulo circulo1 = new Circulo(2);
        Rectangulo rectangulo1 = new Rectangulo(8, 5);

        circulo1.calcularArea();
        rectangulo1.calcularArea();

        System.out.println("-------------------");
        //ejercicio 2

        Estudiante estudiante1 = new Estudiante();
        Profesor profesor1 = new Profesor();

        estudiante1.presentarse();
        profesor1.presentarse();


        System.out.println("-------------------");
        //ejercicio4
        Bicicleta bicicleta1 = new Bicicleta("BMX");
        Coche coche1 = new Coche("Tesla");

        bicicleta1.mover();
        coche1.mover();
    }
}

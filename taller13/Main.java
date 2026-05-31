package taller13;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        Rectangulo rectangulo1 = new Rectangulo(12, 8);
        Triangulo triangulo1 = new Triangulo(5, 9);

        System.out.println("Area Rectangulo: "+ rectangulo1.calcularArea());
        System.out.println("Area triangulo: "+triangulo1.calcularArea());


        System.out.println("-----------------");
        //ejercicio 2
        Pato pato1 = new Pato("Domestico");
        pato1.volar();
        pato1.nadar();
    }
}

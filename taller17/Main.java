package taller17;

public class Main {
    public static void main(String[] args) {
        //ejercicio1
        Figura circulo1 = new Circulo(4);
        Figura rectangulo1 = new Rectangulo(9, 12);

        System.out.println("Area circulo: "+circulo1.calcularArea());
        System.out.println("Area Rectangulo: "+ rectangulo1.calcularArea());

    }
}

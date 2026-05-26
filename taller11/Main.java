package taller11;

public class Main {
    public static void main(String[] args) {
        
        //ejercicio1
        Circulo circulo1 = new Circulo(2);
        Rectangulo rectangulo1 = new Rectangulo(8, 5);

        circulo1.mostrarArea();
        rectangulo1.mostrarArea();

        System.out.println("-----------");
        //ejercicio 2
        
        Gerente gerente1 = new Gerente("Ramiro", 180);
        Vendedor vendedor1 = new Vendedor("Samir", 5000000);

        gerente1.mostarDetalles();
        System.out.println("... ... ...");
        vendedor1.mostarDetalles();

    }
}

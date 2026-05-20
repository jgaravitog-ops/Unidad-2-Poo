package taller8;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Coche coche1 = new Coche("ferrari", 320, 2);
        coche1.mostrarDatos();

        System.out.println("----------");
        //Ejercicio 2
        Estudiante estudiante1 = new Estudiante("Luis", 15, "Activa");
        estudiante1.mostrarDetalles();

        System.out.println("----------");
        //ejercicio 3
        Gerente gerente1 = new Gerente("Sofia", 500, "Publicidad");
        gerente1.mostrarDetalles();
        gerente1.setSalario(600);
        gerente1.mostrarDetalles();
    }
}

package taller10;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
        Persona persona1 = new Persona();
        Estudiante estudiante1 = new Estudiante();
        Profesor profesor1 = new Profesor();

        System.out.println(persona1.presentarse());
        System.out.println(estudiante1.presentarse());
        System.out.println(profesor1.presentarse());
        
        System.out.println("------------");
        //ejercicio 2
        Vehiculo veh1 = new Vehiculo();
        Bicicleta bici1 = new Bicicleta();

        veh1.moverse();
        bici1.moverse();
        
    }
    
}

package taller7;

public class Main {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Pablo", 10000);
        
        System.out.println("Nombre: "+emp1.nombre);
        System.out.println("Salario: "+ emp1.getSalario());
        emp1.setSalario(-1000);
    }
}
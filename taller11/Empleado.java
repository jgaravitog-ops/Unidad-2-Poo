package taller11;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }
    public abstract double calcularSalario();
    public void mostarDetalles(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario: "+calcularSalario());
    }
}

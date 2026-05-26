package taller11;

public class Vendedor extends Empleado{
    private double totalVendido;
    
    public Vendedor(String nombre, double totalVendido){
        super(nombre);
        this.totalVendido = totalVendido;
    }
    public double calcularSalario(){
        double salario = totalVendido*0.2;
        return salario;
    }   
}

package taller11;

public class Gerente extends Empleado{
    private double horas;

    public Gerente(String nombre,int horas){
        super(nombre);
        this.horas = horas;
    }

    @Override
    public double calcularSalario(){
        double salario = 8850 * horas;
        return salario;
    }
}

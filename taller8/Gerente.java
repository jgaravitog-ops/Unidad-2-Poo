package taller8;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente (String nombre,double Salario,String departamento){
        super(nombre, Salario);
        this.departamento = departamento;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
    @Override
    public double getSalario(){
        return super.getSalario();
    }
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
    @Override
    public void setSalario(double salario){
        super.setSalario(salario);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: "+departamento);
    }
    
}

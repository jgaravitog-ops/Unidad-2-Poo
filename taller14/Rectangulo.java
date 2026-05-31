package taller14;

public class Rectangulo extends Figura {
    private double altura;
    private double base;
    
    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void calcularArea() {
        double resultado = base*altura;
        System.out.println("El area del rectangulo es: "+resultado);
    }

}

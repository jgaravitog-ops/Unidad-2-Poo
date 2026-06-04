package taller17;

public class Rectangulo extends Figura{
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double calcularArea() {
        return base*altura;
    }
    
}
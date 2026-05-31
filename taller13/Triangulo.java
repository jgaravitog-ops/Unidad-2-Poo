package taller13;

public class Triangulo extends Figura{

    public Triangulo() {
    }
    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    @Override
    public double calcularArea() {
        double resultado = (base*altura)/2;
        return resultado;
    }  
}

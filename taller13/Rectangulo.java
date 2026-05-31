package taller13;

public class Rectangulo extends Figura{

    Rectangulo(){
    }
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }
    @Override
    public double calcularArea() {
        double resultado = base*altura;
        return resultado;
    }
}
package taller14;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        double resultado = Math.PI*Math.pow(radio, 2);
        System.out.println("El área del circulo es: "+resultado);
    }
}

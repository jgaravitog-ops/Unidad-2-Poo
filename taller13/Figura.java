package taller13;

public abstract class Figura {

    protected double base;
    protected double altura;
    Figura(){
    }
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }  
    public abstract double calcularArea();
    
}
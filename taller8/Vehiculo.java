package taller8;

public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Vel Maxima: "+ velocidadMaxima);
    }   
}

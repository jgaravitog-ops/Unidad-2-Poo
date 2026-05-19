package taller8;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas){
        super(marca,velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarDatos(){
        System.out.println("Marca: "+ marca);
        System.out.println("Vel Max: "+ velocidadMaxima );
        System.out.println("numero de puertas: "+numeroDePuertas);
    }
}

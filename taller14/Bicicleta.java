package taller14;

public class Bicicleta extends Vehiculo{
    private String marca;

    public Bicicleta(String marca) {
        this.marca = marca;
    }
    @Override
    public void mover() {
        System.out.println("La bicicleta "+marca+" se mueve");
    }
}

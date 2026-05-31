package taller14;

public class Coche extends Vehiculo{
    private String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    @Override
    public void mover() {
        System.out.println("El coche de marca "+marca+" se mueve");
    }
    
}

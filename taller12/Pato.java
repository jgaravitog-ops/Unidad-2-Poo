package taller12;

public class Pato implements Volador,Nadador{
    String especie;

    public Pato(String especie){
        this.especie = especie;
    }

    @Override
    public void nadar() {
        System.out.println("Pato "+especie + " esta nadanado");
    }
    @Override
    public void volar() {
        System.out.println("Pato "+especie+" esta volando");
    }

}

package taller9;

public class Pez extends Animal{
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    public String toString(){
        return super.toString() + "\nTipo de agua: "+ tipoDeAgua;
    }
    
}

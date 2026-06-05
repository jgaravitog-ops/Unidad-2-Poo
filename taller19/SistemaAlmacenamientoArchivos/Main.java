package taller19.SistemaAlmacenamientoArchivos;

public class Main {
    public static void main(String[] args) {
        Almacenamiento almacenamiento = new AlmacenamientoNube();
        GestorArchivos gestor = new GestorArchivos(almacenamiento);

        gestor.guardar("documento.pdf");
        gestor.recuperar("documento.pdf");
    }
}
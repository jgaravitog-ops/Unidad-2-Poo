package taller19.SistemaAlmacenamientoArchivos;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public void guardar(String nombre) {
        almacenamiento.guardarArchivo(nombre);
    }
    public void recuperar(String nombre) {
        almacenamiento.recuperarArchivo(nombre);
    }
}

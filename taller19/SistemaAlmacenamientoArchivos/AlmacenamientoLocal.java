package taller19.SistemaAlmacenamientoArchivos;

public class AlmacenamientoLocal implements Almacenamiento{
    @Override
    public void guardarArchivo(String nombre) {
        System.out.println("Guardando archivo localmente: " + nombre);
    }
    @Override
    public void recuperarArchivo(String nombre) {
        System.out.println("Recuperando archivo local: " + nombre);
    }
}

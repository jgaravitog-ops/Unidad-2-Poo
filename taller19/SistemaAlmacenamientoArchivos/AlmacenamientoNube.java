package taller19.SistemaAlmacenamientoArchivos;

public class AlmacenamientoNube implements Almacenamiento{
    @Override
    public void guardarArchivo(String nombre) {
        System.out.println("Guardando archivo en la nube: " + nombre);
    }
    @Override
    public void recuperarArchivo(String nombre) {
        System.out.println("Recuperando archivo de la nube: " + nombre);
    }
}

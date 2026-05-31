package taller15;

public class Usuario {
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public boolean autenticar(String clave) {
        return contrasena.equals(clave);
    }
    public boolean validarDatos() {
        return nombre != null && !nombre.isEmpty();
    }
}

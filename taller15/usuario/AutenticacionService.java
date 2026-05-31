package taller15.usuario;

public class AutenticacionService {
    public boolean autenticar(
        Usuario usuario,
        String clave) {
        return usuario.getContrasena().equals(clave);
    }
}

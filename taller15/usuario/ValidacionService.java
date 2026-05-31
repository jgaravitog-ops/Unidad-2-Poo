package taller15.usuario;

public class ValidacionService {
    public boolean validarUsuario(Usuario usuario) {
        return usuario.getNombre() != null && !usuario.getNombre().isEmpty() && usuario.getContrasena() != null && !usuario.getContrasena().isEmpty();
    }
}

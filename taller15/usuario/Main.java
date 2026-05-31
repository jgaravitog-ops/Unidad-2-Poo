package taller15.usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Juan", "1234");
        AutenticacionService auth = new AutenticacionService();
        ValidacionService validacion = new ValidacionService();

        System.out.println("Usuario válido: " + validacion.validarUsuario(usuario));
        System.out.println("Autenticación: " + auth.autenticar(usuario, "1234"));
    }
}

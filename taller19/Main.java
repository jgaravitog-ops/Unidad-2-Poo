package taller19;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion auth = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(auth);

        gestor.iniciarSesion("admin", "1234");
    }
}
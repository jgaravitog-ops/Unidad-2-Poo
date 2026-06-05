package taller19;

public class AutenticacionOAuth implements ServicioAutenticacion{
    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando mediante OAuth...");
        return true;
    }
}

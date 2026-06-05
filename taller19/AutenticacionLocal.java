package taller19;

public class AutenticacionLocal implements ServicioAutenticacion{
    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando usuario localmente...");
        return usuario.equals("admin") && clave.equals("1234");
    }
}

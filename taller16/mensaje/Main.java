package taller16.mensaje;

public class Main {
    public static void main(String[] args) {

        GestorMensajes gestor = new GestorMensajes();

        gestor.enviar(new MensajeroEmail(),"Bienvenido al sistema");
        gestor.enviar(new MensajeroSMS(),"Código de verificación");
        gestor.enviar(new MensajeroPush(),"Nueva actualización disponible");
    }
}

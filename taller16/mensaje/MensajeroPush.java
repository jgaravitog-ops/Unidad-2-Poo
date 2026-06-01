package taller16.mensaje;

public class MensajeroPush extends Mensajero {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación Push: "+ mensaje);
    }
}

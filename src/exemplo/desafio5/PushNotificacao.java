package exemplo.desafio5;

public class PushNotificacao implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[PUSH] Enviando: " + mensagem);
    }
}

package exemplo.desafio5;

public class EmailNotificacao implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[EMAIL] Enviando: " + mensagem);
    }
}

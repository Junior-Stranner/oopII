package exemplo.desafio3;

public class Pix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        if (!Pagamento.validarValor(valor)) {
            System.out.println("❌ Valor inválido para pagamento via Pix.");
            return;
        }
        System.out.println("⚡ Pagamento de R$ " + valor + " processado via Pix.");
        gerarRecibo(valor);
    }
}

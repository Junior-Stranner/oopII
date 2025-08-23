package exemplo.desafio3;

public class CartaoCredito implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        if(!Pagamento.validarValor(valor)){
            System.out.println("❌ Valor inválido para pagamento com Cartão de Crédito.");
            return;
        }
        System.out.println("💳 Pagamento de R$ " + valor + " processado via Cartão de Crédito.");
        gerarRecibo(valor);
    }
}

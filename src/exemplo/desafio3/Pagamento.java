package exemplo.desafio3;

public interface Pagamento {

    void processarPagamento(double valor);

    default void gerarRecibo(double valor) {
        System.out.println("🧾 Recibo gerado: Pagamento de R$ " + valor + " realizado com sucesso.");
    }

    static boolean validarValor(double valor) {
        return valor > 0;
    }

}

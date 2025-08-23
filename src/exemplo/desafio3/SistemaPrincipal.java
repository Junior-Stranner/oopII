package exemplo.desafio3;

import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Sistema de Pagamentos ===");
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Pix");
        int opcao = in.nextInt();

        Pagamento pagamento;

        switch (opcao) {
            case 1:
                pagamento = new CartaoCredito();
                break;
            case 2:
                pagamento = new Pix();
                break;
            default:
                System.out.println("❌ Opção inválida!");
                return;
        }

        System.out.print("Digite o valor do pagamento: ");
        double valor = in.nextDouble();

        pagamento.processarPagamento(valor);
    }
}

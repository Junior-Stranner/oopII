package exemplo.desafio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaNotificacoesMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Notificacao> canaisEscolhidos = new ArrayList<>();

        System.out.println("=== Sistema de Notificações ===");
        System.out.println("Escolha os canais de notificação (separe por vírgula):");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Push");
        System.out.print("Sua escolha: ");
        String entrada = in.nextLine();
        String[] opcoes = entrada.split(",");
        for (String opcao: opcoes) {

         switch (opcao.trim()) {
                case "1":
                    canaisEscolhidos.add(new EmailNotificacao());
                    break;
                case "2":
                    canaisEscolhidos.add(new SmsNotificacao());
                    break;
                case "3":
                    canaisEscolhidos.add(new PushNotificacao());
                    break;
                default:
                    System.out.println("Opção inválida: " + opcao);
            }
        }
        if (canaisEscolhidos.isEmpty()) {
            System.out.println("Nenhum canal escolhido. Encerrando...");
        } else {
            GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canaisEscolhidos);
            System.out.print("Digite a mensagem para enviar: ");
            String mensagem = in.nextLine();
            gerenciador.notificarTodos(mensagem);
        }
    }
}

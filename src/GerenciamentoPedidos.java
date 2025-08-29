import ExercicioFinal6.envio.GerenciadorEnvio;
import ExercicioFinal6.model.Pedido;
import ExercicioFinal6.model.Produto;
import ExercicioFinal6.pagamento.CartaoCredito;
import ExercicioFinal6.pagamento.MetodoPagamento;
import ExercicioFinal6.pagamento.ProcessadorPagamento;
import ExercicioFinal6.repository.JpaPedidoRepositorio;
import ExercicioFinal6.repository.PedidoRepositorio;
import ExercicioFinal6.service.ServicePedido;

import java.util.List;

public class GerenciamentoPedidos {
    public static void main(String[] args) {
        PedidoRepositorio repositorio = new JpaPedidoRepositorio();
        MetodoPagamento cartao = new CartaoCredito();
        ProcessadorPagamento processador = new ProcessadorPagamento(cartao);
        GerenciadorEnvio gerenciador = new GerenciadorEnvio();


        ServicePedido servicoPedido = new ServicePedido(repositorio, processador, gerenciador);

        Produto motoserra = new Produto("Motoserra", 1500.00);
        Produto capacete = new Produto("Capacete", 300.00);
        Produto luvas = new Produto("Luvas", 50.00);
        List itens = List.of(motoserra, capacete, luvas);

        Pedido pedido = new Pedido(itens, "Rua das Flores, 123");
        servicoPedido.criarNovoPedido(pedido);
        servicoPedido.processarPedido(1L);
        servicoPedido.enviarPedido(1l);
    }
}

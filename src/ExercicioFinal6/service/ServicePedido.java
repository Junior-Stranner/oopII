package ExercicioFinal6.service;

import ExercicioFinal6.envio.GerenciadorEnvio;
import ExercicioFinal6.model.Pedido;
import ExercicioFinal6.pagamento.ProcessadorPagamento;
import ExercicioFinal6.repository.PedidoRepositorio;

public class ServicePedido {
    private final PedidoRepositorio pedidoRepositorio;
    private final ProcessadorPagamento processadorPagamento;
    private final GerenciadorEnvio gerenciadorEnvio;

    public ServicePedido(PedidoRepositorio pedidoRepositorio, ProcessadorPagamento processadorPagamento, GerenciadorEnvio gerenciadorEnvio) {
        this.pedidoRepositorio = pedidoRepositorio;
        this.processadorPagamento = processadorPagamento;
        this.gerenciadorEnvio = gerenciadorEnvio;
    }

    public void criarNovoPedido(Pedido pedido) {
        pedidoRepositorio.salvar(pedido);
        System.out.println("Novo pedido criado com sucesso!");
    }

    public void processarPedido(long pedidoId) {
        Pedido pedido = pedidoRepositorio.buscarPorId(pedidoId);
        if (pedido == null) {
            System.out.println("Pedido não encontrado!");
            return;
        }
        processadorPagamento.processar(pedido.calcularTotal());
        pedido.setStatus("Pago");
        pedidoRepositorio.salvar(pedido);
        System.out.println("Pedido pago com sucesso!");
    }

    public void enviarPedido(long pedidoId) {
        Pedido pedido = pedidoRepositorio.buscarPorId(pedidoId);
        if (pedido == null) {
            System.out.println("Pedido não encontrado!");
            return;
        }
        gerenciadorEnvio.enviarPedido(pedido.getEnderecoEntrega());
        pedido.setStatus("Enviado");
        pedidoRepositorio.salvar(pedido);
        System.out.println("Pedido enviado com sucesso!");
    }
}

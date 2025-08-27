package desafio8;

public class RepositorioProduto extends RepositorioMemoria<Produto> {

    @Override
    public void salvar(Produto obj) {
        memoria.add(obj);
    }

    public static void main(String[] args) {
        RepositorioProduto repositorio = new RepositorioProduto();

        Produto produto1 = new Produto("Produto A", 39.99);
        Produto produto2 = new Produto("Produto B", 59.99);

        repositorio.salvar(produto1);
        repositorio.salvar(produto2);

        System.out.println("Lista de produtos: " + repositorio.listarTodos());

        Produto encontrado = repositorio.buscarPorId(produto1.getId());
        System.out.println("Produto encontrado: " + encontrado);
    }
}

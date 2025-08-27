package desafio8;

public class RepositorioCliente extends RepositorioMemoria<Cliente>{

    public static void main(String[] args) {
        RepositorioCliente repositorio = new RepositorioCliente();
        Cliente cliente1 = new Cliente("Alan Prost", "prost@gmail.com");
        Cliente cliente2 = new Cliente("Ayrton Senna", "ayrton3campeao@senna.com");

        repositorio.salvar(cliente1);
        repositorio.salvar(cliente2);

        System.out.println("Lista de clientes: " + repositorio.listarTodos());

        Cliente encontrado = (Cliente) repositorio.buscarPorId(cliente2.getId());
        System.out.println("Cliente encontrado: " + encontrado);

        Cliente naoEncontrado = (Cliente) repositorio.buscarPorId(3);
        if (naoEncontrado == null) {
            System.out.println("Cliente não encontrado com ID 3");
        }

        System.out.println("Todos os clientes: " + repositorio.listarTodos());
    }

    @Override
    public void salvar(Cliente obj) {
        if (obj instanceof Cliente) {
            memoria.add((Cliente) obj);
        } else {
            throw new IllegalArgumentException("Objeto não é do tipo Cliente");
        }
    }
}

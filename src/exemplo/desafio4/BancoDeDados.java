package exemplo.desafio4;

public class BancoDeDados implements Armazenamento{
    private String dado;

    @Override
    public void salvar(String dado) {
        this.dado = dado;
        System.out.println("💾 [BancoDeDados] Dado salvo: " + dado);
    }

    @Override
    public String ler() {
        return "📂 [BancoDeDados] Lendo dado: " + dado;
    }
}

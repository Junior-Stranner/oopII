package exemplo.desafio4;

public class ArquivoTexto implements Armazenamento{
    private String dado;

    @Override
    public void salvar(String dado) {
        this.dado = dado;
        System.out.println("📝 [ArquivoTexto] Dado salvo em arquivo: " + dado);
    }

    @Override
    public String ler() {
        return "📂 [ArquivoTexto] Lendo dado do arquivo: " + dado;
    }
}

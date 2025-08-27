package desafio8;

public class Produto extends MemoryEntity {
    private Double preco;

    public Produto(String nome, Double preco) {
        super(nome);
        setPreco(preco); // garante validação
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco == null || preco < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Produto{id=%d, nome='%s', preco=%.2f}", getId(), getNome(), preco);
    }
}

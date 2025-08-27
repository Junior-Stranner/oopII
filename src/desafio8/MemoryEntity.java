package desafio8;

public abstract class MemoryEntity {
    private static int idCounter = 1; // contador estático para gerar IDs únicos
    private final int id;
    private String nome;

    public MemoryEntity(String nome) {
        this.id = idCounter++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String toString();
}

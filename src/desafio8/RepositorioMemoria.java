package desafio8;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T extends MemoryEntity> implements Repositorio<T> {
    protected List<T> memoria = new ArrayList<>();

    @Override
    public abstract void salvar(T obj);

    @Override
    public T buscarPorId(int id) {
        for (T item : memoria) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(memoria);
    }
}

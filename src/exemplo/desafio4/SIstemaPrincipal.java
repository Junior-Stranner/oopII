package exemplo.desafio4;

import java.util.ArrayList;
import java.util.List;

public class SIstemaPrincipal {
    public static void main(String[] args) {
        List<Armazenamento> armazenamentos = new ArrayList<>();

        armazenamentos.add(new BancoDeDados());
        armazenamentos.add(new ArquivoTexto());

        for (Armazenamento a : armazenamentos) {
            a.salvar("Dado exemplo");
            System.out.println(a.ler());
            System.out.println("--------------------");
        }
    }
}

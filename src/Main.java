/*import exemplo.ecommerce.Produto;
import exemplo.imposto.ICMS;
import exemplo.imposto.IOF;
import exemplo.imposto.Imposto;
import exemplo.imposto.ImpostoRecord;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Perecivel produto = new Produto();
        //processar(produto);

        //ICMS, IOF

        Imposto IOF = new IOF(1.5D);
        Imposto ICMS = new ICMS(2.7D);

        //new IVA(27D);

        //calcular(IOF);
        calcular(ICMS);
        //calcular(IVA);

        ImpostoRecord iva = new ImpostoRecord("2", "IVA");
        //iva.taxa();

        Comparator<Produto> compImposto = Comparator.comparing(Produto::getId)
                                                    .thenComparing(Produto::getValor);
        //compImposto.compare(new Produto(), new Produto());

        Integer numero = Integer.valueOf(10);
        System.out.printf("O numeros sao iguais %d", numero.compareTo(Integer.valueOf(15)));





        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(2,  "TV 55", new BigDecimal(4500)));
        produtos.add(new Produto(1,  "PS 5", new BigDecimal(3800)));
        Collections.sort(produtos);
        Collections.sort(produtos, Comparator.comparing(Produto::getValor));
        produtos.sort((p1, p2) -> p1.getId().compareTo(p2.getId()));


    }

    public static void calcular(Imposto imposto) {
        imposto.imprimir();
    }
}*/
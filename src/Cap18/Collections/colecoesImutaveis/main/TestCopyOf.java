package Cap18.Collections.colecoesImutaveis.main;

import java.util.ArrayList;
import java.util.List;

public class TestCopyOf {
    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();

        numeros1.add(1);
        numeros1.add(2);

        List<Integer> numeros2 = List.copyOf(numeros1);

        // apos realiza a copia nao é possivel adicionar mais nenhum elemento no numeros2;
        // numeros2.add(3);



        for (Integer integer : numeros2) {
            System.out.println(integer);
        }
    }
}

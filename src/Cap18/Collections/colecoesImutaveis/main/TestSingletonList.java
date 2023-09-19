package Cap18.Collections.colecoesImutaveis.main;

import java.util.Collections;
import java.util.List;

public class TestSingletonList {
    // Gerando uma lista de um unico elemento e imutavel

    public static void main(String[] args) {
        List<Integer> numeros = Collections.singletonList(1);

        System.out.println(numeros);
    }
}

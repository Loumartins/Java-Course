package Cap18.Collections.colecoesImutaveis.main;

import java.util.Collections;
import java.util.List;

public class TestEmptyList {
    public static void main(String[] args) {
        // Gerando uma lista vazia e tambem imutavel

        List<Integer> numeros = Collections.emptyList();

        System.out.println(numeros);
    }
}

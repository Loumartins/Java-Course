package Cap17.generics.exercicio2.main;

import Cap17.generics.exercicio2.domain.Impressora;

public class ImpressoraTest {
    public static void main(String[] args) {
        Integer[] integers = {1,3,4,5,6};
        Double [] doubles = {2.3,4.4,4.3};
        String [] strings = {"Gabriela", "Luiz", "Amara"};

        Impressora.imprime(integers);
        System.out.println("---------");
        Impressora.imprime(doubles);
        System.out.println("---------");
        Impressora.imprime(strings);
    }
}

package Cap17.generics.exercicio2.domain;

public class Impressora {

    public static <T> void imprime(T[] itens){
        for (T item : itens) {
            System.out.println(item);
        }
    }
}

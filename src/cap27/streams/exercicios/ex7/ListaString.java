package cap27.streams.exercicios.ex7;

import java.util.ArrayList;
import java.util.List;

public class ListaString {
    /*
    Dada uma lista de strings, transforme cada string em maiúsculas e, em seguida,
    limite o resultado a, no máximo, três strings.
     */

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("lose");
        stringList.add("oi");
        stringList.add("fabio");
        stringList.add("casa");
        stringList.add("queijo");

        stringList.stream()
                .map(String::toUpperCase)
                .limit(3)
                .forEach(System.out::println);
    }
}

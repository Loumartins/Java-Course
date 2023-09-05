package Cap18.Collections.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest00 {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Morango");
        frutas.add("Melancia");
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Pera");
        frutas.add("Mamao");
        frutas.add("Manga");
        frutas.add("Abacaxi");
        frutas.add("Abacate");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("-------------");

        frutas.remove("Mamao");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("-----------");

        frutas.add(0, "Mamao");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("------------");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.size());
        }
    }
}

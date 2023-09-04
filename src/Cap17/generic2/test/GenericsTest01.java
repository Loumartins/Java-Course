package Cap17.generic2.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Jose");
        lista.add("Fabricio");
        lista.add("Antonio");

        for (String s : lista) {
            System.out.println(s);
        }
    }
}

package Cap20.Strings.main;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String html = "joao@algaworks.com";

        String[] partes = html.split("[@.]");

        System.out.println(Arrays.toString(partes));
    }
}

package Cap17.generics.exercicio2.main;

import Cap17.generics.exercicio2.domain.Maximum;

import java.util.Locale;

public class MaximumTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("O valor maximo entre 4,5,6 é: " + Maximum.comparador(4,5,6) + " ");
        System.out.println("O valor maximo entre 3.5,5.4,12.2 é: "
                + Maximum.comparador(3.5,5.4,12.2) + " ");
    }
}

package Cap17.generics.exercicio2.domain;

public class Maximum {

    public static <T extends Comparable<T>> T comparador(T x, T y, T z  ) {
        T max = x;

        if (y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
}

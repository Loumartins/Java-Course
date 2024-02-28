package cap27.streams.exercicios.ex8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 1. numero para string binária... 6 => "110"
 * 2. reverter a string... "110" => "011"
 * 3. converter de volta para inteiro => "011" => 3
 */
public class DesafioMap {
    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Function<String, String> stringReversed = s -> {
            StringBuilder builder = new StringBuilder(s);
            return builder.reverse().toString();
        };

        Function<String, Integer> stringIntegerFunction = s -> {
          return Integer.parseInt(s,2);
        };

        nums.stream()
                .map(Integer::toBinaryString)
                .map(stringReversed)
                .map(stringIntegerFunction)
                .forEach(System.out::println);
    }


}

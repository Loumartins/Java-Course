package Cap25.LambdasExpressions.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class IntefaceFuncionaisTest01 {
    public static void main(String[] args) {
        //Predicate = representa uma função que aceita um argumento e retorna um valor booleano
        Predicate<String> consulta = str -> str.startsWith("L");
        boolean comecaComL = consulta.test("Luiz");
        System.out.println(comecaComL);

        //Function = representa uma função que aceita um argumento de um tipo e retorna
        // um resultado de um outro tipo
        Function<String, LocalDate> function = LocalDate::parse;
        LocalDate data = function.apply("2023-06-12");
        System.out.println(data);

        //Supplier = representa um fornecedor de um resultado. Comumente usada para gerar ou
        //fornecer um valor, mas nao tem nenhum argumento na operação.
        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);

        //Consumer = representa uma operação que aceita um argumento, mas nao retorna nenhum resultado.
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("oOo");
    }

}

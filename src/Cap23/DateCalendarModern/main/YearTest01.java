package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class YearTest01 {
    public static void main(String[] args) {
        Year ano = Year.now();
        System.out.println(ano);

        Year anoLocalDate = Year.from(LocalDate.now());
        System.out.println(anoLocalDate);

        Year anoParse = Year.parse("2024");

        //utilizando o metodo isLeap() é possivel descobrir se um ano é bissexto ou nao

        System.out.println(ano.isLeap());


        // é possivel encontrar um dia especifico dentro de um ano utilizando o metodo atDay()
        LocalDate diaDoProgramador = anoParse.atDay(256);
        System.out.println(diaDoProgramador);


        // calculando anos

        Year anoFuturo = ano.plus(Period.parse("P10Y").normalized());
        System.out.println(anoFuturo);
    }
}

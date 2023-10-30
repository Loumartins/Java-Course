package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class ChronoFieldTest01 {
    public static void main(String[] args) {
        //Chrono Field é utilizado para acessar campos de data e hora em objetos da classe Temporal
        LocalDate dataVencimento = LocalDate.parse("2023-10-04");
        int dia = dataVencimento.get(ChronoField.DAY_OF_MONTH);
        int diaAno = dataVencimento.get(ChronoField.DAY_OF_YEAR);
        int ano = dataVencimento.get(ChronoField.YEAR);
        System.out.println(ano);
        System.out.println(dia);
        System.out.println(diaAno);
        //Utilizando o Chrono Field para definir valores de campos de data e hora - (Uso do with)
        LocalDate localDate = LocalDate.now();
        localDate = localDate.with(ChronoField.YEAR, 2024);
        System.out.println(localDate);
    }
}

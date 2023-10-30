package Cap23.DateCalendarModern.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculadoraDeParcelas {
    private static final String PATTERN_DATA_HORA = "dd/MM/yyyy";
    public static void calculadoraDeParcelas (String texto, int quantidadeDeParcelas){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(PATTERN_DATA_HORA);
        LocalDate localDate = LocalDate.parse(texto, dateTimeFormatter);
        for (int i = 0; i <= quantidadeDeParcelas; i++) {
            localDate = localDate.plusMonths(1);
            System.out.println(localDate);
        }
    }
}

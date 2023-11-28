package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthTest01 {
    public static void main(String[] args) {
        Month mesAtual = Month.NOVEMBER;
        System.out.println(mesAtual);
        Month mesUtilizandoOf = Month.of(4);
        System.out.println(mesUtilizandoOf.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));

        LocalDate dataNascimento = LocalDate.of(1996, Month.APRIL,8);

        Month mesNascimento = dataNascimento.getMonth();

        System.out.println(mesNascimento);

        //Calculando meses
        Month mesCalculado = mesUtilizandoOf.plus(4);
        System.out.println(mesCalculado);
    }
}

package Cap23.DateCalendarModern.main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOFWeekTest01 {
    public static void main(String[] args) {
        //DayOfWeek diaDaSemana = DayOfWeek.MONDAY;

//        DayOfWeek diaDaSemana = DayOfWeek.of(1);
//        System.out.println(diaDaSemana);
//        DayOfWeek diaDaSemanaData = DayOfWeek.from(LocalDate.now());
//
//        System.out.println(diaDaSemanaData.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));

        //Calculando datas com o dayOfWeek

        DayOfWeek diaDaSemanaHoje = LocalDate.now().getDayOfWeek();

       DayOfWeek diaDaSemanaQuinzeDias = diaDaSemanaHoje.plus(15);
        System.out.println(diaDaSemanaQuinzeDias);

    }
}

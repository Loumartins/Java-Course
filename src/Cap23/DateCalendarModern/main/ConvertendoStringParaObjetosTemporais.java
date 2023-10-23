package Cap23.DateCalendarModern.main;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class ConvertendoStringParaObjetosTemporais {
    public static void main(String[] args) {
       // Objeto do tipo Instant;
//        Instant instante = Instant.parse("2010-08-20T19:45:20Z");
        Instant instante = Instant.parse("2010-08-20T19:45:20-03:00");
        System.out.println(instante);
        System.out.println("----");
        //Objeto do tipo LocalDate
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("2026/10/03", DateTimeFormatter.
                ofLocalizedDateTime(FormatStyle.FULL).
                localizedBy(new Locale("pt", "BR")));
        System.out.println(data);
    }
}

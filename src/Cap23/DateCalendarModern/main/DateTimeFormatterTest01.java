package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        //formatando a data utilizando DateTimeFormatter
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println(formattedDate);
        // utilizando o LocalizedStyle
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,
                FormatStyle.SHORT);
        System.out.println(localDateTime.format(dateTimeFormatter1));

    }
}

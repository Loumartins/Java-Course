package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        //LocalDateTime representa um horario e uma data sem a informação de fuso horario
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //gerando o LocalDateTime pelo LocalDate e pelo LocalTime
        LocalDate localDate = LocalDate.of(1996, 4, 8);
        LocalTime localTime = LocalTime.of(6, 0,0);
        LocalDateTime dataHoraNascimento = LocalDateTime.of(localDate, localTime);
        System.out.println(dataHoraNascimento);



    }
}

package Cap23.DateCalendarModern.main;

import java.time.Duration;

public class DurationTest01 {
    public static void main(String[] args) {
//        Utilizado quando queremos representar a duração de algo (em horas)
//         Duration duration = Duration.ofDays(2);
//        Duration duration = Duration.ofHours(5);
//        System.out.println(duration);
        Duration duration1 = Duration.parse("P1DT5H");
        System.out.println(duration1);

        //Calculos de duracao

        Duration duracaoCalculada = duration1.plus(Duration.ofMinutes(30));
        System.out.println(duracaoCalculada);

        System.out.println(duracaoCalculada.getSeconds());

        System.out.println(duracaoCalculada.toHoursPart());

        System.out.println(duracaoCalculada.toMinutesPart());
    }
}

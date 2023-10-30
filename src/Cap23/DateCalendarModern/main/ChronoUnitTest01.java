package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();

        LocalDate dataProximaParcela = agora.plus(30, ChronoUnit.DAYS);
    }
}

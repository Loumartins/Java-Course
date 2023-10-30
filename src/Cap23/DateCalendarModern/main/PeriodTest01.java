package Cap23.DateCalendarModern.main;

import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        // Quando utilizar o Period?
        //Quando queremos representar a duração de algo ( por dias )
        Period period = Period.of(1, 5,10);
        System.out.println(period);

        Period periodoCalculado = period.plus(Period.ofYears(10));
        System.out.println(periodoCalculado);

        periodoCalculado.multipliedBy(3).normalized();

        System.out.println(periodoCalculado);
    }
}

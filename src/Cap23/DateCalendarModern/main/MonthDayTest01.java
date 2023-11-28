package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDayTest01 {
    public static void main(String[] args) {
//        MonthDay diaMes = MonthDay.now();
//        System.out.println(diaMes);

        MonthDay diaMes = MonthDay.from(LocalDate.now());
        System.out.println(diaMes);
    }
}

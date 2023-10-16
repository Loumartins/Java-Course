package Cap22.DateCalendarLegadas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
     //   Calendar calendar = Calendar.getInstance();

        Calendar calendar = new GregorianCalendar(1996, Calendar.APRIL, 8);
        Date date = calendar.getTime();
        System.out.println(simpleDateFormat.format(date));
    }
}

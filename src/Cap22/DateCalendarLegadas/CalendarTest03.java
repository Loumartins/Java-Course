package Cap22.DateCalendarLegadas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest03 {
    public static void main(String[] args) {
        // Operaçoes de datas com o tipo Calendar
      Calendar calendar = Calendar.getInstance();

        // calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        // calendar.set(Calendar.DAY_OF_MONTH, 20);

        //alterando para o ultimo dia do mes
        int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
       calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
        System.out.println(calendar.getTime());
    }
}

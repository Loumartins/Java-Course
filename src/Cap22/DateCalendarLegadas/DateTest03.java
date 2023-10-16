package Cap22.DateCalendarLegadas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //Formatando Date para String

        Date hoje = new Date();

        //DateFormat formatador = DateFormat.getDateTimeInstance();
        //DateFormat formatador = DateFormat.getTimeInstance();
        //DateFormat formatador = DateFormat.getDateInstance();
        //DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(dateFormat.format(hoje));
    }
}

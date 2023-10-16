package Cap22.DateCalendarLegadas;

import java.util.Date;
import java.util.Locale;

public class DateTest01 {
    public static void main(String[] args) {
        //System.out.println();
        Date date = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));
        System.out.println(date);

        System.out.println(date.getMonth());

        //Calculando e comparando datas com Date
        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24*60*60*1000));

        System.out.println(hoje.getTime());
        System.out.println(ontem.getTime());
    }
}

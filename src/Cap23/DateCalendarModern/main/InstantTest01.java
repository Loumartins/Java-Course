package Cap23.DateCalendarModern.main;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class InstantTest01 {
    public static void main(String[] args) {

        Instant instante = Instant.now();
//        System.out.println(new Date());
        System.out.println(instante);
//       segundos
        System.out.println(instante.getEpochSecond());

        //convertendo de um date para um instant
        Date date = new Date();
        Instant instant1 = date.toInstant();

        //convertendo de um instant para um date
        Instant instant2 = Instant.now();
        Date date1 = Date.from(instant2);

        //convertendo um calendar para um instant
        Calendar calendar = Calendar.getInstance();
        Instant instant3 = calendar.toInstant();


    }
}

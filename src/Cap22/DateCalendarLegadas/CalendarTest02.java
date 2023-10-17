package Cap22.DateCalendarLegadas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class  CalendarTest02 {
    public static void main(String[] args) {
        DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Data de aniversário");
        String dataAniversarioText = sc.nextLine();
        try{

            Date date = simpleDateFormat.parse(dataAniversarioText);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(calendar.getTime());
            if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER && calendar.get(Calendar.DAY_OF_MONTH)==25){
                System.out.println("Voce nasceu no natal! HoHo");
            } else if (calendar.get(Calendar.DAY_OF_YEAR) == 256){
                System.out.println("Voce nasceu no dia do programador! Hello World");
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
 
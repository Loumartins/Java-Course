package Cap22.DateCalendarLegadas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest04 {
    public static void main(String[] args) {
        //Formatando String para Date



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try{
            String dataText = "30/12/2023";
            Date date = simpleDateFormat.parse(dataText);
            System.out.println(date);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

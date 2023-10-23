package Cap23.DateCalendarModern.main;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime horarioAgora = LocalTime.now();
        System.out.println(horarioAgora);
        //instanciando um localTime com horario especifico
        LocalTime horarioEspecifico = LocalTime.of(16,30);
        System.out.println(horarioEspecifico);
    }
}

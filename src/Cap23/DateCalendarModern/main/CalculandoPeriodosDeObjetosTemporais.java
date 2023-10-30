package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.Period;

public class CalculandoPeriodosDeObjetosTemporais {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

        Period tempoEntrega = Period.between(dataCompra, dataEntrega).normalized();

        System.out.println(tempoEntrega);
    }
}

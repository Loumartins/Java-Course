package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculandoPeriodosDeObjetosTemporais {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

        Period tempoEntrega = Period.between(dataCompra, dataEntrega).normalized();

        System.out.println(tempoEntrega);

        //Utilizando unidades temporais

        long TempoDeEntregaEmSemanas = dataCompra.until(dataEntrega, ChronoUnit.DAYS);

        System.out.println(TempoDeEntregaEmSemanas);

        //Utilizando o localDate com o Period

        System.out.println("---------");

        Period tempoMediaEntrega = Period.parse("P1M5D");
        LocalDate compraRealizada = LocalDate.now();

        LocalDate dataDeEntregaPrevisa = compraRealizada.plus(tempoMediaEntrega);

        System.out.println(dataDeEntregaPrevisa);
    }
}

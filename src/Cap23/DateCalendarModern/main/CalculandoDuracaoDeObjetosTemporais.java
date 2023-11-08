package Cap23.DateCalendarModern.main;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculandoDuracaoDeObjetosTemporais {
    public static void main(String[] args) {
        LocalDateTime dataHoraCompra = LocalDateTime.parse("2022-11-12T21:30:00");
        LocalDateTime dataHoraEntrega = LocalDateTime.parse("2022-11-12T22:10:10");

        Duration duracaoEntrega = Duration.between(dataHoraCompra, dataHoraEntrega);
        System.out.println(duracaoEntrega);

        long tempoEntregaSegundos = dataHoraCompra.until(dataHoraEntrega, ChronoUnit.SECONDS);
        System.out.println(tempoEntregaSegundos);


        Duration tempoMediaEntrega = Duration.parse("PT45M");
        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime tempoEntrega = agora.plus(tempoMediaEntrega).truncatedTo(ChronoUnit.MINUTES);

        System.out.println(tempoEntrega);

    }
}

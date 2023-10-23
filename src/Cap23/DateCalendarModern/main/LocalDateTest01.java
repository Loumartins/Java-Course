package Cap23.DateCalendarModern.main;

import java.time.LocalDate;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);
        System.out.println("----");
        LocalDate dataNascimento = LocalDate.of(1996, 4,8);
        System.out.println(dataNascimento);
        System.out.println("----");
        LocalDate diaDoProgamador = LocalDate.ofYearDay(2022, 256);
        System.out.println(diaDoProgamador);

        //localDate nao é a representacao de um
        // instante na linha do tempo, pq nao tem indicacao de fuso horario

    }
}

package Cap23.DateCalendarModern.exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculadoraDeIdade {
    private static final String PATTERN_DATA_NASCIMENTO = "dd/MM/yyyy";

    public static void calculadoraDeIdade(String texto) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(PATTERN_DATA_NASCIMENTO);
        LocalDate dataNascimento = LocalDate.parse(texto, dateTimeFormatter);
        LocalDate agora = LocalDate.now();

        LocalDate dataString = LocalDate.parse(texto, dateTimeFormatter);
        while (dataNascimento.equals(dataString)){
            try{
                Period periodoDataNascimento = Period.between(dataNascimento, agora);
                System.out.printf("%d ano(s), %d mes(es), %d dia(s)%n", periodoDataNascimento.getYears(),
                        periodoDataNascimento.getMonths(),periodoDataNascimento.getDays());
                break;
            } catch (IllegalArgumentException e){
                System.out.println("Data invalida");
            }
        }

    }

}

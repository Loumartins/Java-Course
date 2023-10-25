package Cap23.DateCalendarModern.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoDeEventos {
    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_HORA =  DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_COMPLETO_BRASIL = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT).withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        LocalDate dataEvento = requisitarData("Data do evento: ");
        LocalTime horaEvento = requisitarHorario("Horario evento");

        LocalDateTime dataHoraEvento = dataEvento.atTime(horaEvento);

        System.out.printf("Evento agendado para %s%n", dataHoraEvento.format(FORMATADOR_COMPLETO_BRASIL));
    }

    private static LocalDate requisitarData (String descricao){
        while (true){
            try{
                System.out.println(descricao);
                String dataTexto = ENTRADA.nextLine();
                return LocalDate.parse(dataTexto, FORMATADOR_DATA);
            } catch(DateTimeParseException e){
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }
    private static LocalTime requisitarHorario (String descricao){
        while (true){
            try{
                System.out.println(descricao);
                String horaTexto = ENTRADA.nextLine();
                return LocalTime.parse(horaTexto, FORMATADOR_HORA);
            }catch (DateTimeParseException e){
                System.out.println("Hora inválida. Tente novamente");
            }
        }
    }

}

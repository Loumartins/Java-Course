package Cap22.DateCalendarLegadas;

import java.util.Date;

public class DateTest02 {
    public static void main(String[] args) {

        //Calculando e comparando datas com Date

        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - (24*60*60*1000));

        System.out.println(hoje.getTime());
        System.out.println(ontem.getTime());

        long diferencaMilis = hoje.getTime() - ontem.getTime();
        System.out.println(diferencaMilis);

        double diferencaHoras = diferencaMilis/1000/60/60;
        System.out.println("Diferença em horas: " + diferencaHoras);



        System.out.printf("Depois: %b%n", hoje.after(ontem));
        System.out.printf("Antes: %b%n", hoje.before(ontem));
        System.out.printf("Comparação: %d%n", hoje.compareTo(ontem));
    }
}

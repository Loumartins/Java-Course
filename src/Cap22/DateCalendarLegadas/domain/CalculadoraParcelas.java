package Cap22.DateCalendarLegadas.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculadoraParcelas {

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    public void formatandoStringParaDate(String dataParcela) {
//        DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            Date date = dataFormatada.parse(dataParcela);
//            System.out.println(date);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void calculandoParcelas(int quantidadeParcelas){
//
//
    public void calculandoParcelas(String dataCompra, int quantidadeDeParcelas){
        DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date dateParcela = dataFormatada.parse(dataCompra);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateParcela);
            for (int i = 1; i <= quantidadeDeParcelas; i++) {
                calendar.add(Calendar.MONTH, 1);
//                System.out.println(dataFormatada.format(calendar.getTime()));
                if (calendar.get(Calendar.DAY_OF_MONTH) == 31){
                    int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                    calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
                    System.out.println(dataFormatada.format(calendar.getTime()));

             } else if (calendar.get(Calendar.DAY_OF_MONTH) != 31){
                    System.out.println(dataFormatada.format(calendar.getTime()));
                }

             //   System.out.println(dataFormatada.format(calendar.getTime()));

//                if (calendar.get(Calendar.MONTH) != Calendar.FEBRUARY ){
//                    System.out.println(dataFormatada.format(calendar.getTime()));
//                }
//                 else if (calendar.get(Calendar.MONTH) == Calendar.FEBRUARY && (calendar.get(Calendar.DAY_OF_MONTH) == 29 || calendar.get(Calendar.DAY_OF_MONTH) == 30 || calendar.get(Calendar.DAY_OF_MONTH) ==31)){
//
//                    int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//                    calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
//                    System.out.println(dataFormatada.format(calendar.getTime()));
//                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

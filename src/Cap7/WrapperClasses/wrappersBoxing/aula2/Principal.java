package Cap7.WrapperClasses.wrappersBoxing.aula2;

public class Principal {
    public static void main(String[] args) {
        int idade = 20;
        short idadeShort = (short) idade;


        //Estudos sobre metodos de conversao de tipos wrapper utilizando o xxxvalue();
        Integer diasEntrega = Integer.valueOf(30);
        Short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());

        Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());

        Double valorTotal = Double.valueOf(1500.2);
        int valorTotalInt = valorTotal.intValue();
        System.out.println(valorTotalInt);


    }
}

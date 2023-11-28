package Cap22.DateCalendarLegadas.main;

import Cap22.DateCalendarLegadas.domain.CalculadoraParcelas;

import java.util.Scanner;

public class CalculadoraDeParcelasTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Data da compra");
        String dataCompra = sc.nextLine();
        System.out.println("Quantidade de parcelas");
        int quantidadeParcelas = sc.nextInt();

        CalculadoraParcelas cp = new CalculadoraParcelas();

        cp.calculandoParcelas(dataCompra, quantidadeParcelas);
    }
}

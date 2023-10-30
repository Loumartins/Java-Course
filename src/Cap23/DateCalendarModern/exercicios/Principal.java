package Cap23.DateCalendarModern.exercicios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Data da primeira parcela");
        String dataPrimeiraParcela = sc.nextLine();
        System.out.println("Quantidade de parcelas");
        int quantidadeDeParcelas = sc.nextInt();

        CalculadoraDeParcelas.calculadoraDeParcelas(dataPrimeiraParcela,quantidadeDeParcelas);
    }
}

package Cap23.DateCalendarModern.exercicios;

import java.util.Scanner;

public class CalculadoraDeIdadeTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento");
        String dataNascimento = sc.nextLine();
        CalculadoraDeIdade.calculadoraDeIdade(dataNascimento);
    }
}
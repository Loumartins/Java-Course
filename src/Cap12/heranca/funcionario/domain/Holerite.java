package Cap12.heranca.funcionario.domain;

import java.util.Objects;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public Holerite{
        Objects.requireNonNull(nome, "O nome nao pode ser nulo");
        Objects.requireNonNull(mesAno, "O nome nao pode ser nulo");
        Objects.requireNonNull(valorSalario, "O nome nao pode ser nulo");
    }

    public void imprimir(){
        System.out.printf("O nome do funcionário é: %s, o mes trabalhado foi: %s e o valor de salário é de: %.2f%n",
        nome, mesAno, valorSalario);
    }

}

package Cap17.generics.main;

import Cap17.generics.domain.Cliente;
import Cap17.generics.domain.Funcionario;
import Cap17.generics.domain.Pesquisador;

public class Principal1 {
    public static void main(String[] args) {
        Funcionario []funcionarios =  {
            new Funcionario("João", 45),
            new Funcionario("Maria", 20),
            new Funcionario("Jessica", 30)
        };

        Cliente[] cliente = {
                new Cliente("Supermercado Pague e Leve", 2_000_000),
                new Cliente("Posto Gasolina Boa", 800_000),
                new Cliente("Javac Consultoria", 58_000_000)
        };

        Funcionario funcionarioEncontrado = Pesquisador.obterNome(funcionarios, "Maria");
        System.out.println(funcionarioEncontrado);

        Cliente clienteEncontrado = Pesquisador.obterNome(cliente, "Supermercado Pague e Leve");
        System.out.println(clienteEncontrado);


    }
}

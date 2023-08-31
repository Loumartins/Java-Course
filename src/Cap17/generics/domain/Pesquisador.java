package Cap17.generics.domain;

public class Pesquisador {
    public static Funcionario obterNome (Funcionario[] funcionarios, String nome){
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)){
                return funcionario;
            }
        }
        throw new RuntimeException("Funcionário não encontrado");
    }
}

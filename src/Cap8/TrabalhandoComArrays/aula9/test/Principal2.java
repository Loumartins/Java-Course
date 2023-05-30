package Cap8.TrabalhandoComArrays.aula9.test;

import Cap8.TrabalhandoComArrays.aula9.domain.Aluno;
import Cap8.TrabalhandoComArrays.aula9.domain.Turma;

public class Principal2 {
    public static void main(String[] args) {
        //instanciando classe turmaB
        Turma turmaB = new Turma();

        turmaB.nomeProfessora = " Marcia";
        turmaB.nomeIdentificacao = "1 ano E.M";


        //instanciado classe Aluno
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();


        aluno1.idade = 4;
        aluno1.nome = "Frederico";

        aluno2.idade = 5;
        aluno2.nome = "Marcela";

        aluno3.idade = 6;
        aluno3.nome = "Ronaldo";

        //chamando metodo adicionarAluno()
        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);
        turmaB.adicionarAluno(aluno3);




    }
}

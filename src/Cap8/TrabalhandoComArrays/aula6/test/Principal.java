package Cap8.TrabalhandoComArrays.aula6.test;


import Cap8.TrabalhandoComArrays.aula6.domain.Aluno;
import Cap8.TrabalhandoComArrays.aula6.domain.Turma;

public class Principal {
    public static void main(String[] args) {

        Turma turmab = new Turma();
        turmab.identificacao = "Maternal B";
        turmab.nomeProfessora = "Tia Maria";
        turmab.alunos = new Aluno[3];

        turmab.alunos[0] = new Aluno();
        turmab.alunos[0].nome = "Joao";
        turmab.alunos[0].idade = 3;

        Aluno aluno1 = new Aluno();

        turmab.alunos[1] = aluno1;
        turmab.alunos[1].nome = "Maria";
        turmab.alunos[1].idade = 4;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Francisco";
        aluno2.idade = 4;

        turmab.alunos[2] = aluno2;

        for (int i = 0; i < turmab.alunos.length; i++) {
            Aluno aluno = turmab.alunos[i];
            System.out.printf("%d - %s (%d anos)%n", i, aluno.nome, aluno.idade);
        }

        turmab.imprimirListaDeAlunos();
    }


}

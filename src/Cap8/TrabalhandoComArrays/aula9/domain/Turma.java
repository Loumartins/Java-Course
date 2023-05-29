package Cap8.TrabalhandoComArrays.aula9.domain;

import java.util.Arrays;

public class Turma {
    public String nomeIdentificacao;
    public String nomeProfessora;
    Aluno[]alunos = new Aluno[0];

    public void adicionarAluno(Aluno aluno){
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length+1);
        this.alunos[this.alunos.length-1] = aluno;
    }

    public void removerAluno(int indice){
        Aluno[] novosAlunos = new Aluno[alunos.length - 1];
        System.arraycopy(alunos, 0,novosAlunos,0,indice);
        System.arraycopy(alunos, indice+1,novosAlunos, indice, novosAlunos.length-indice);

        alunos = novosAlunos;
    }

    public void imprimirAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

package Cap8.TrabalhandoComArrays.aula7.exemplo;

import java.util.Arrays;

public class Turma {
    public String nomeIdentificacao;
    public String nomeProfessora;
     public Aluno[] alunos;

     public void adicionarAluno(Aluno aluno){
         this.alunos = Arrays.copyOf(alunos, alunos.length+1);
         this.alunos[alunos.length - 1] = aluno;

     }
     public void imprimirAluno(){
         for (Aluno aluno : alunos) {
             System.out.println(aluno.nome +""+ aluno.idade);
         }
     }
}

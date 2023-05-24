package Cap8.TrabalhandoComArrays.aula6.domain;

public class Turma {
    public String identificacao;
    public String nomeProfessora;
    public Aluno[] alunos;

    public void imprimirListaDeAlunos(){
        for (Aluno aluno : alunos){
            if (aluno != null){
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else{
                System.out.println("Vago");
            }
        }
    }
}

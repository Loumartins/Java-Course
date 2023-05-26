package Cap8.TrabalhandoComArrays.aula7.exemplo;

public class TurmaTest {
    public static void main(String[] args) {
        Turma turmaA = new Turma();
        turmaA.nomeIdentificacao = "Turma A";
        turmaA.nomeProfessora = "Joana";
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Joao";
        aluno1.idade = 6;
        turmaA.adicionarAluno(aluno1);

        turmaA.imprimirAluno();
    }
}

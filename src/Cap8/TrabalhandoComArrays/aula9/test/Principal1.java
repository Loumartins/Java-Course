package Cap8.TrabalhandoComArrays.aula9.test;

import java.util.ArrayList;

public class Principal1 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        //adicionando elementos
        alunos.add("Joao");
        alunos.add("Maria");

        //Iterando com fori
        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);
        }

        System.out.println("----");

        //Iterando com for
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

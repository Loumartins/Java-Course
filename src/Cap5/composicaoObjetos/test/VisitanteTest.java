package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.Visitante;

public class VisitanteTest {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.idade = 12;
        novoVisitante.nome = "Joao";

        if (novoVisitante.idade < 18){
            System.out.println("Acessso nao permitido para menores de 18 anos");
        } else {
            System.out.println("Acesso liberado");
        }
    }
}

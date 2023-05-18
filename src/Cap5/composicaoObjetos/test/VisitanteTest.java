package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.Visitante;

public class VisitanteTest {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.idade = 12;
        novoVisitante.nome = "Joao";

        if (novoVisitante.possuiAcessoRestritoPorIdade()){
            System.out.printf("Acessso nao permitido para menores de %d anos",
                    Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }
    }
}

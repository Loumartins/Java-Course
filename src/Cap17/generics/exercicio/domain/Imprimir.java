package Cap17.generics.exercicio.domain;

public class Imprimir {
    public static void imprimirEstoque(GerenciadorEstoque gerenciadorEstoque){
        System.out.println(gerenciadorEstoque.getQuantidadeTotal());
    }
}

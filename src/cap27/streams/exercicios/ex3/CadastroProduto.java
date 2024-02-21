package cap27.streams.exercicios.ex3;

import java.util.ArrayList;
import java.util.List;

public class CadastroProduto {

    private final List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto (String nome, double preco){
        Produto produto = new Produto(nome, preco);

        if (produtos.contains(produto)){
            System.out.println("Produto duplicado, por isso nao pode ser cadastrado");
        }
        produtos.add(produto);
    }

    public List<Produto> obterProdutos() {
        return produtos;
    }
}

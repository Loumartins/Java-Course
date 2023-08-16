package Cap16.exceptions.estoque.domain;

public class ProdutoSemEstoqueException extends RuntimeException {

    public ProdutoSemEstoqueException(String message) {
        super(message);
    }
}

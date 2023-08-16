package Cap16.exceptions.estoque.domain;

public class ProdutoInativoException extends RuntimeException {

    public ProdutoInativoException(String message) {
        super(message);
    }
}

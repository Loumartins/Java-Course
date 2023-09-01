package Cap17.generics.estruturaDeDados.domain;

public interface Colecao <T>  {
    void colocar(T item);
    T retirar();
}

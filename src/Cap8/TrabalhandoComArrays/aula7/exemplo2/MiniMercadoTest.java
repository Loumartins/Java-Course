package Cap8.TrabalhandoComArrays.aula7.exemplo2;

public class MiniMercadoTest {
    public static void main(String[] args) {
        MiniMercado miniMercado = new MiniMercado();

        Fruta fruta1 = new Fruta();
        fruta1.nome = "Morango";

        Fruta fruta2 = new Fruta();
        fruta2.nome = "Banana";

        Fruta fruta3 = new Fruta();
        fruta3.nome = "Maracuja";

        Fruta fruta4 = new Fruta();
        fruta4.nome = "Kiwi";

        miniMercado.adicionarFruta(fruta1);
        miniMercado.adicionarFruta(fruta2);
        miniMercado.adicionarFruta(fruta3);
        miniMercado.adicionarFruta(fruta4);

        miniMercado.imprimirFruta();
    }
}

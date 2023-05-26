package Cap8.TrabalhandoComArrays.aula7.exemplo2;

import java.util.Arrays;

public class MiniMercado {
    public String nome;
    public Fruta[] frutas = new Fruta[0];

    public void adicionarFruta(Fruta fruta){
        this.frutas = Arrays.copyOf(frutas, frutas.length+1);
        this.frutas[this.frutas.length -1] = fruta;
    }
    public void imprimirFruta(){
        for (Fruta fruta : frutas) {
            if (fruta !=null){
                System.out.println("Fruta: " + fruta.nome );
            }
        }
    }
}

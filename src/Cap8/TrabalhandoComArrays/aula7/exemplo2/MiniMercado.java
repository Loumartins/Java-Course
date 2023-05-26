package Cap8.TrabalhandoComArrays.aula7.exemplo2;

import java.util.Arrays;

public class MiniMercado {
    public String nome;
    public Fruta[] frutas;

    public void adicionarFruta(Fruta fruta){
        this.frutas = Arrays.copyOf(frutas, frutas.length+1);
        this.frutas[this.frutas.length -1]= fruta;
    }
    public void imprimirFruta(){

    }
}

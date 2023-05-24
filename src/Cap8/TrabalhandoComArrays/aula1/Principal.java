package Cap8.TrabalhandoComArrays.aula1;

public class Principal {
    public static void main(String[] args) {

        int [] notas = {8,5,4,9,10};

        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma+=notas[i];
        }
        double media = soma / notas.length;
        System.out.println(media);

    }
}

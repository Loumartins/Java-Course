package Cap5.composicaoObjetos.exercicios.ex1.test;

import Cap5.composicaoObjetos.exercicios.ex1.domain.Cachorro;

public class CachorroTest {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Milly";
        cachorro1.raca = "Poodle";
        cachorro1.idade= 10;
        cachorro1.sexo = "Feminino";

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Adão";
        cachorro2.raca = "SRD";
        cachorro2.idade= 4;
        cachorro2.sexo = "Masculino";

        System.out.println(cachorro1.nome);
        System.out.println(cachorro1.raca);
        System.out.println(cachorro1.idade);
        System.out.println(cachorro1.sexo);

        System.out.println("-----------");


        System.out.println(cachorro2.nome);
        System.out.println(cachorro2.raca);
        System.out.println(cachorro2.idade);
        System.out.println(cachorro2.sexo);
    }
}

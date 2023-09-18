package Cap18.Collections.mapas.test;

import Cap18.Collections.mapas.domain.Carro;
import Cap18.Collections.mapas.domain.Proprietario;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest01 {
    public static void main(String[] args) {

        Proprietario maria = new Proprietario("Maria", "12345678901");
        Proprietario ana = new Proprietario("Ana", "222222222134");
        Proprietario jose = new Proprietario("Jose", "231456745432");
        Proprietario joao = new Proprietario("Joao", "678970543221");

        Carro bmw = new Carro("AlG1A23", "BMW X3");
        Carro honda = new Carro("W0R9K87", "BMW X3");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        Map<Carro, Proprietario> proprietarios = new HashMap<>();

        // Adicionando valores em um mapa
        proprietarios.put(bmw,maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

        //Substituindo valores de um mapa
        proprietarios.put(porsche, jose);

        //Removendo valores de um mapa
        proprietarios.remove(porsche);


        //System.out.println(proprietarios);

        // System.out.println(proprietarios.get(new Carro("JAV5A67", "Ford Ka")));



        //Iterando sobre as chaves
        for (Carro carro : proprietarios.keySet()) {
            System.out.println(carro);
        }

        // Iterando sobre os valores
        for (Proprietario value : proprietarios.values()) {
            System.out.println(value);
        }

        // Iterando sobre as chave,valor.
        for (Map.Entry<Carro, Proprietario> carroProprietarioEntry : proprietarios.entrySet()) {
            System.out.println(carroProprietarioEntry);
        }
    }
}

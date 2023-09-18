package Cap18.Collections.mapas.test;

import Cap18.Collections.mapas.domain.Carro;
import Cap18.Collections.mapas.domain.Proprietario;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest01 {
    public static void main(String[] args) {
        // é uma implementação muito parecida com HashMap, inclusive LinkedHashMap herda HashMap.
        // LinkedHashMap mantem a ordem de adicao dos elementos.
        // Requer mais memoria
        // Utiliza uma lista ligada para manter a ordem dos elementos.
        // Aceita chaves e valores nulos

        // Quando precisamos de um mapa com uma ordem de inserção dos elementos o utilizado seria o LinkedHashMap

        Proprietario maria = new Proprietario("Maria", "12345678901");
        Proprietario ana = new Proprietario("Ana", "222222222134");
        Proprietario jose = new Proprietario("Jose", "231456745432");
        Proprietario joao = new Proprietario("Joao", "678970543221");

        Carro bmw = new Carro("AlG1A23", "BMW X3");
        Carro honda = new Carro("W0R9K87", "BMW X3");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        Map<Carro, Proprietario> proprietarios = new LinkedHashMap<>();
        proprietarios.put(bmw,maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

        //System.out.println(proprietarios);

        for (Map.Entry<Carro, Proprietario> carroProprietarioEntry : proprietarios.entrySet()) {
            System.out.println(carroProprietarioEntry);
        }

    }
}

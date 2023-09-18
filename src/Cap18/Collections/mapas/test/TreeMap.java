package Cap18.Collections.mapas.test;

import Cap18.Collections.mapas.domain.Carro;
import Cap18.Collections.mapas.domain.Proprietario;

import java.util.LinkedHashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        // TreeMap nao utiliza tabela de espalhamento
        // Implementa um algoritmo de arvore rubro negra
        // as chaves do mapa sao ordenadas de forma natural ou por uma implementação da interface comparator
        // nao podem ter chaves nulas
        // podem ter valores nulos
        // quase sempre sera mais lento que o hashmap, porem o consumo de memoria para armazenar é menor.

        Proprietario maria = new Proprietario("Maria", "12345678901");
        Proprietario ana = new Proprietario("Ana", "222222222134");
        Proprietario jose = new Proprietario("Jose", "231456745432");
        Proprietario joao = new Proprietario("Joao", "678970543221");

        Carro bmw = new Carro("AlG1A23", "BMW X3");
        Carro honda = new Carro("W0R9K87", "BMW X3");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        Map<Carro, Proprietario> proprietarios = new java.util.TreeMap<>();
        proprietarios.put(bmw,maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);


        for (Map.Entry<Carro, Proprietario> carroProprietarioEntry : proprietarios.entrySet()) {
            System.out.println(carroProprietarioEntry);
        }
    }
}

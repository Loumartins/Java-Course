package cap27.streams.exercicios.ex4;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransacaoTest {

    /*
    Dada uma lista de transações, onde cada transação possui um comprador, um vendedor
    e um valor, utilize streams para criar um mapa onde as transações
    são agrupadas por comprador.
     */

    public static void main(String[] args) {
        var cadastroDeTransacao = new CadastroDeTransacao();
        cadastroDeTransacao.adicionarTransacao(new Transacao(new Comprador("Jose"), new Vendedor("Carlos"), new BigDecimal("400")));
        cadastroDeTransacao.adicionarTransacao(new Transacao(new Comprador("Carlos"), new Vendedor("Fernando"), new BigDecimal("6000")));
        cadastroDeTransacao.adicionarTransacao(new Transacao(new Comprador("Carlos"), new Vendedor("Vaneza"), new BigDecimal("800.44")));
        cadastroDeTransacao.adicionarTransacao(new Transacao(new Comprador("Otavio"), new Vendedor("Miranda"), new BigDecimal("23.12")));

        List<Transacao> transacaoList = cadastroDeTransacao.obterTransacao();

        Map<Comprador , List<Transacao>> transacaoMap= transacaoList.stream()
                .collect(Collectors.groupingBy(Transacao::getComprador));


        transacaoMap.forEach((comprador, transacaos) -> {
            System.out.println("Comprador: " + comprador);
            System.out.println("Transacao: " + transacaos);
            System.out.println("----------");
        });

//        transacaoList.stream()
//                .forEach(System.out::println);

    }
}

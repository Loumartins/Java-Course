package Cap13.polimorfismo.notaFiscal.test;

import Cap13.polimorfismo.notaFiscal.domain.GestorFiscal;
import Cap13.polimorfismo.notaFiscal.domain.NotaFiscalProduto;
import Cap13.polimorfismo.notaFiscal.domain.NotaFiscalServico;

public class NotaFiscalTest {
    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 1100, true);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);
    }
}

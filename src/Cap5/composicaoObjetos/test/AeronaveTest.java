package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.Aeronave;

public class AeronaveTest {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        System.out.printf("GOL (%s): %d assentos disponíveis%n", aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());
    }
}

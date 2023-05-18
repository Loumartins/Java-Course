package Cap5.composicaoObjetos.test;

import Cap5.composicaoObjetos.domain.Aeronave;

public class AeronaveTest {
    public static void main(String[] args) {
        //rvw0G77
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        aviaoGol.ativar();

        aviaoGol.reservarAssentos(5);
        System.out.printf("GOL (%s): %d assentos disponíveis%n", aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());

        System.out.println("-------------------------------");
        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalAssentos = 120;

        aviaoLatam.ativar();

        aviaoLatam.reservarAssentos(17);
        System.out.printf("LATAM (%s): %d assentos disponíveis%n", aviaoLatam.ativo ? "Ativo" : "Inativo",
                aviaoLatam.calcularAssentosDisponiveis());


    }
}

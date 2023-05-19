package Cap5.composicaoObjetos.exercicios.ex4.test;

import Cap5.composicaoObjetos.exercicios.ex4.domain.NumeroUtil;

public class NumeroUtilTest {
    public static void main(String[] args) {
      String resposta  = NumeroUtil.descobrirMaiorNumeroInteiro(4,5);
        System.out.println(resposta);

      resposta = NumeroUtil.descobrirMaiorNumeroInteiro(5,10, 23);
        System.out.println(resposta);

      double respostaFlutuante = NumeroUtil.descobrirMaiorNumeroFlutuante(4.5, 3.2);
        System.out.println(respostaFlutuante);
    }
}

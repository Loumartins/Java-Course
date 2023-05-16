package Cap5.composicaoObjetos.exercicios.ex2.domain;

public class FolhaPagamento {
    public int qtdHorasExtras;
    public int qtdHorasTrabalhadas;
    public Holorite calcularSalario(ContratoTrabalho contratoTrabalho){
        Holorite holorite = new Holorite();
        holorite.funcionario = contratoTrabalho.funcionario;
        double salarioNormal = this.qtdHorasTrabalhadas * contratoTrabalho.valorNormal;
        double salarioExtra = this.qtdHorasExtras * contratoTrabalho.valorExtra;
        double salarioFinal = salarioNormal + salarioExtra;

        if (contratoTrabalho.contratoAdicional()){
            salarioFinal+= salarioFinal * holorite.valorAdicionalFilhos;
            holorite.resultado = salarioFinal;
            return holorite;
        }

        holorite.resultado = salarioFinal;
        return holorite;
    }
}

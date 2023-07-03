package Cap14.interfaces.contasPagar.domain.interfaces;

import Cap14.interfaces.contasPagar.domain.Beneficiario;

public interface DocumentoPagavel {

    public double getValorTotal();

    Beneficiario getBeneficiario();

}

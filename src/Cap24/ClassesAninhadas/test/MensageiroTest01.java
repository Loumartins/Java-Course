package Cap24.ClassesAninhadas.test;

import Cap24.ClassesAninhadas.domain.ServicoEmail;

public class MensageiroTest01 {
    public static void main(String[] args) {
        ServicoEmail servicoEmail = new ServicoEmail();
        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem("joao@algaworks.com", "maria@algaworks.com", "\nOlá, tudo bem?");
        servicoEmail.enviar(mensagem);
    }
}

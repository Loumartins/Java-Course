package Cap6.codigoLimpo.aula6.domain;

public class Produto {
    public String nome;
    public double precoUnitario;
    boolean ativo;

 /*   public void alterarStatus(boolean ativo){
        if (ativo){
            System.out.println("Ativando");
        } else {
            System.out.println("Desativando");
        }
        this.ativo = ativo;
    }*/

   public void ativar(){
        System.out.println("Ativando");
        this.ativo = true;
    }
   public void desativar(){
    System.out.println("Desativando");
        this.ativo = false;
    }
}

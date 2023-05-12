package Cap5.composicaoObjetos.domain;

public class Carro {
   public String fabricante, modelo, cor;
   public int anoFabricacao;

   public double precoCompra;
   public Pessoa proprietario;

   public int calcularTempoDeUsoEmAnos() {
       int anoAtual = 2022;
       int tempoDeUsoEmAnos = anoAtual - this.anoFabricacao;
       return tempoDeUsoEmAnos;
   }

   public double calcularIpva(){
       return calcularValorRevenda() * 0.04;
   }
   public double calcularValorRevenda() {
      int vidaUtilEmAnos = 20;
     double valorRevenda = (this.precoCompra / vidaUtilEmAnos)
             * (vidaUtilEmAnos - calcularTempoDeUsoEmAnos());
     if (valorRevenda<0){
        valorRevenda = 0;
     }
     return valorRevenda;
   }

}

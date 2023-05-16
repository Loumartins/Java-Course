package Cap5.composicaoObjetos.domain;

public class Carro {
   public String fabricante, modelo, cor;
   public int anoFabricacao;

   public double precoCompra;
   public Pessoa proprietario;

   public void imprimirResumoDepreciacao(){
       double valorRevenda = calcularValorRevenda();
       int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
       double imprimirIpva = calcularIpva();

       if (precoCompra <= 0){
           System.out.println("Preço de compra zerado, " +
                   "não é possivel imprimir resumo de depreciação");
           return;
       }

       System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoEmAnos);
       System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);
       System.out.printf("O valor do IPVA a ser pago é de: %.2f%n",imprimirIpva );
   }

   public int calcularTempoDeUsoEmAnos() {
       int anoAtual = 2022;
       int tempoDeUsoEmAnos = anoAtual - this.anoFabricacao;
       return tempoDeUsoEmAnos;
   }

   public double calcularIpva(){
       int TempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

       if (TempoDeUsoEmAnos >=10){
           return 0;
       }
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

package Cap20.Strings.main;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat( " Dev Dojo");
        System.out.println(nome);
        //StringBuilder nao é uma String
        //Para manipulação das StringBuilder ou StringBuffer é importante verificar se o retorno dos metodos tbm sao StringBuilder/ Buffer

        StringBuilder sb = new StringBuilder("Luiz Henrique");


        String substring = sb.substring(0,2); // O metodo substring retorna uma String, nao retorna uma StringBuilder
        sb.append( " Martins");

        sb.reverse();

        sb.delete(0,3);

        System.out.println(sb);


    }
}

package Cap20.Strings.Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // Meta - Caracteres
        // \d = Todos os digitos
        // \D = Tudo o que nao for digito
        // \s = Espaços em branco /t /n /f /r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z ou A-Z, digitos e _
        // \W = Tudo o que nao for incluso no \w
        // [] = range

     //   String regex = "[a-zA-C]";

        String regex = "0[xX][0-9a-fA-F]";

        String texto2 = "12 0X 0X 0XFFABC 0X109 0X1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        while (matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group()+ "\n");
        }
        int numeroHex = 0X59F86A;
    }
}

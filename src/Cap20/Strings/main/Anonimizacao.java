package Cap20.Strings.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anonimizacao {
    public static void main(String[] args) {
        String html = "<a href=\"mailto:joao@gmail.com\">\n   joao@gmail.com  </a>\n" +
                "<a>\n   abc@algaworks.com</a><a>xyz@algaworks.com</a>" +
                "<strong>maria@algaworks.com</strong>";
        //System.out.println(html);

        String regex = "<.*?>\\s*([\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3})\\s*</.*?>";

        // String novoHtml = html.replaceFirst(regex, "email@anonimizado"); => altera somente o primeiro email
        String novoHtml = html.replaceAll(regex, "email@anonimizado");

        System.out.println(novoHtml);
    }
}

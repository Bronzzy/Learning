import java.sql.SQLOutput;
import java.util.Scanner;

public class PersonalWebPageGenerator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please describe yourself");
        String sentence = scanner.nextLine();

        System.out.printf("<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<center>\n" +
                "\t\t<h1>" +name+"</h1>\n" +
                "\t</center>\n" +
                "\t<hr />\n"+
                sentence+"\n"+
                "\t<hr />\n" +
                "</body>\n" +
                "</html>");
    }
}


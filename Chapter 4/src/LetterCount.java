import java.util.Scanner;

public class LetterCount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input;
        char character;
        int count = 0;

        System.out.println("Enter your string");
        input = scanner.nextLine();

        System.out.println("Enter your character");
        character = scanner.nextLine().charAt(0);

        for(int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == character)
            {
                count++;
            }
        }
        System.out.println("This character appears "+count);
    }
}
